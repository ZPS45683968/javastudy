package design_patternlearn.StructurePattern.adapter.class_adapter;

/**
 * @Author ps_zhao
 * @Description 具体的SD卡实现类
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
