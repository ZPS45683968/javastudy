package design_patternlearn.StructurePattern.Proxy.static_proxy;

/**
 * @Author ps_zhao
 * @Description 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用方法
        proxyPoint.sell();
    }
}
