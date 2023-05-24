package design_patternlearn.StructurePattern.Proxy.jdk_proxy;

import design_patternlearn.StructurePattern.Proxy.static_proxy.ProxyPoint;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author ps_zhao
 * @Description 代理工厂
 */
public class ProxyFactory {

    // 维护一个目标对象
    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject(){
        // 返回一个代理对象
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),  // 目标对象的类加载器
                trainStation.getClass().getInterfaces(),    // 目标对象实现的接口
                new InvocationHandler() {
                    /*
                        Object proxy: 代理对象，和proxyObject是同一个对象
                        Method method: 目标对象的方法
                        Object[] args: 目标对象方法的参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 增强代码
                        System.out.println("代售点收取一定的服务费用(JDK动态代理)");
                        // 执行目标对象方法
                        Object invoke = method.invoke(trainStation, args);
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
