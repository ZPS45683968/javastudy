package design_patternlearn.StructurePattern.adapter.class_adapter;

/**
 * @Author ps_zhao
 * @Description
 */
public class Computer {

    // 从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
