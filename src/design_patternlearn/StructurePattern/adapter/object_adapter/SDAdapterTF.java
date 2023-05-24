package design_patternlearn.StructurePattern.adapter.object_adapter;

/**
 * @Author ps_zhao
 * @Description 适配器类
 */
public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }
    // 实现目标接口方法
    public String readSD(){
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    public void writeSD(String msg){
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
