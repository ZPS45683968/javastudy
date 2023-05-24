package design_patternlearn.StructurePattern.decorator;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("=========");
        //点一份加鸡蛋的炒饭
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("=========");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("=========");
        //再加一个培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

    }
}
