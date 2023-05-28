package design_patternlearn.BehavioralPattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ps_zhao
 * @Description 订单类,命令中包含的内容
 */
public class Order {

    // 订单号
    private int diningTable;

    // 订单内容，餐品及数量
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String foodName, int foodNum) {
        this.foodDir.put(foodName, foodNum);
    }
}
