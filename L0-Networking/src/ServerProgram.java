import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;

import java.util.Date;

public class ServerProgram {
    //Server object
    static Server server;

    public static void main(String[] args) throws Exception {
        System.out.println("Creating Server");

        //Start server on these ports
        server = new Server();
        server.bind(Network.port);
        server.start();

        //Register classes
        Network.register(server);

        //Add the listener
        server.addListener(new Listener() {

            //This is run when a connection is received!
            public void connected(Connection c) {
                System.out.println("Received a connection from " + c.getRemoteAddressTCP().getHostString());
                //Create a message packet.
                Network.PacketMessage packetMessage = new Network.PacketMessage();
                //Assign the message text.
                packetMessage.message = "Hello friend! The time is: " + new Date().toString();

                //Send the message
                c.sendTCP(packetMessage);
                //Alternatively, we could do:
                //c.sendUDP(packetMessage);
                //To send over UDP.
            }

            //This is run when we receive a packet.
            public void received(Connection c, Object p) {
                //We will do nothing here.
                //We do no expect to receive any packets
            }

            //This is run when a client has disconnect.
            public void disconnected(Connection c) {
                System.out.println("A client disconnected!");
            }
        });

        System.out.println("Server is operational!");
    }
}
