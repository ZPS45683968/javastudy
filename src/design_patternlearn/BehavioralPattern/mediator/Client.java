package design_patternlearn.BehavioralPattern.mediator;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        // 创建中介者
        MediatorStructure mediator = new MediatorStructure();
        // 创建租房者和房东
        Tenant tenant = new Tenant("张三", mediator);
        HouseOwner houseOwner = new HouseOwner("李四", mediator);
        // 中介者分别与租房者和房东建立联系
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        // 租房者发出信息
        tenant.contact("我想租一套三室的房子");
        // 房东发出信息
        houseOwner.contact("我这里有三室的房子，你需要租吗？");
    }
}
