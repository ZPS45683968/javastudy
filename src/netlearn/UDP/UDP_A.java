package netlearn.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 18:32
 */
public class UDP_A {
    public static void main(String[] args) throws Exception {
        // 创建一个DatagramSocket
        DatagramSocket socket = new DatagramSocket(9999);

        // 构建一个DataGramPacket
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        // 接收数据
        socket.receive(packet);

        // 解析数据
        String str = new String(packet.getData(), 0, packet.getLength());
        System.out.println(str);


        // 回复信息给B
        byte[] buf2 = "Hello, I am A".getBytes();
        DatagramPacket packet2 = new DatagramPacket(buf2, buf2.length, InetAddress.getLocalHost(), 9998);

        socket.send(packet2);
        socket.close();
        System.out.println("A: 任务结束");
    }
}
