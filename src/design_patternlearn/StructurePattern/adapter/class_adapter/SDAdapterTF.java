package design_patternlearn.StructurePattern.adapter.class_adapter;

/**
 * @Author ps_zhao
 * @Description 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    // 实现目标接口方法
    public String readSD(){
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg){
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
