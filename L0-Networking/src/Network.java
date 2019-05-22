import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

public class Network {
    //Ports to listen on
    static public final int port = 27960;

    // This registers objects that are going to be sent over the network.
    static public void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
        kryo.register(PacketMessage.class);
    }

    //We can only send objects as packets if they are registered.

    static public class PacketMessage {
        //This is the Packet class. Everything in this object can be sent over the network
        String message;
    }
}
