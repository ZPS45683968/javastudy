package netlearn.SocketTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serial;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 15:17
 */
public class SocketTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello, I am server.".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();

    }
}
