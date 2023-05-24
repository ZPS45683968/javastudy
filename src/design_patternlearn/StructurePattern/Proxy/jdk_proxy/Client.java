package design_patternlearn.StructurePattern.Proxy.jdk_proxy;

/**
 * @Author ps_zhao
 * @Description 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 使用代理工厂对象获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        // 3. 调用代理对象的方法
        proxyObject.sell();
    }

}
