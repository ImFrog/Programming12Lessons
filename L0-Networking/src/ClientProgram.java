import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ClientProgram {
    //Our client object.
    private static Client client;
    //IP to connect to.
    static String ip = "localHost";
    //A boolean value.
    static boolean messageReceived = false;

    public static void main(String[] args) throws Exception {
        System.out.println("Connecting to the server...");

        //Start the client and connect
        client = new Client();
        client.start(); //The client MUST be started before connecting can take place.
        //Connect to the server - wait 5000ms before failing.
        client.connect(5000, ip, Network.port);

        //Register classes
        Network.register(client);

        //Add a listener
        client.addListener(new Listener() {

            public void received(Connection c, Object p) {
                //Is the received packet the same class as Network.PacketMessage.class?
                if (p instanceof Network.PacketMessage) {
                    //Cast it, so we can access the message within.
                    Network.PacketMessage packet = (Network.PacketMessage) p;
                    System.out.println("received a message from the host: " + packet.message);

                    //We have now received the message!
                    messageReceived = true;
                }
            }
        });

        System.out.println("Connect! The client program is now waiting for a packet...\n");

        //This is here to stop the program from closing before we receive a message.
        while (!messageReceived) {
            Thread.sleep(1000);
        }
        System.out.println("Client will now exit.");
        System.exit(0);
    }
}
