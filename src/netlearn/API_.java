package netlearn;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 14:57
 * 演示INetAddress类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        // get the local host
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //get the host by name
        InetAddress hostByName = InetAddress.getByName("LAPTOP-35DVKL63");
        System.out.println(hostByName);

        //get the host by ip
        InetAddress hostByIp = InetAddress.getByName("www.baidu.com");
        System.out.println(hostByIp);

        //get the host address by inetAddress object
        String hostAddress = hostByIp.getHostName();
        System.out.println(hostAddress);
    }
}
