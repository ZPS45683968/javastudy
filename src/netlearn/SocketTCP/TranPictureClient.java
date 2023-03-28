package netlearn.SocketTCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 16:00
 */
public class TranPictureClient {
    public static void main(String[] args) throws Exception{
        // 建立连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        // 读取本地图片
        String picturePath = "F:\\mydesk\\Desktop\\123.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(picturePath));

        // 写出图片
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }


        socket.shutdownOutput();

        // 接收服务器回写的数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭资源
        bufferedReader.close();
        bufferedInputStream.close();
        socket.close();

    }
}
