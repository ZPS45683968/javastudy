package design_patternlearn.StructurePattern.adapter.object_adapter;

/**
 * @Author ps_zhao
 * @Description 适配者类
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
