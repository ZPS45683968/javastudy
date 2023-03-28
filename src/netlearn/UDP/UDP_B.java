package netlearn.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 18:38
 */
public class UDP_B {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] data = "Hello, I am B".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);

        socket.send(packet);

        byte[] buf = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(buf, buf.length);
        socket.receive(packet2);

        String str = new String(packet2.getData(), 0, packet2.getLength());
        System.out.println(str);

        socket.close();
        System.out.println("B: 任务结束");
    }
}
