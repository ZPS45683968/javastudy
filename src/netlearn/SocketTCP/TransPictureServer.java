package netlearn.SocketTCP;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 15:59
 */
public class TransPictureServer {
    public static void main(String[] args) throws Exception{
        // 建立连接
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        // 读取图片
        String savePath = "D:\\Javaproject\\javastudy\\src\\netlearn\\SocketTCP\\123.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());

        // 写出图片
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(savePath));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }



        // 给客户端回写数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("图片已经收到");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();

        // 关闭资源
        bufferedWriter.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();
    }
}