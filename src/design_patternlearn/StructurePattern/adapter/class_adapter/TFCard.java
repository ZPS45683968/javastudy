package design_patternlearn.StructurePattern.adapter.class_adapter;

/**
 * @Author ps_zhao
 * @Description 适配者类的接口
 */
public interface TFCard {
    // 读取TF卡方法
    String readTF();
    // 写入TF卡功能
    void writeTF(String msg);
}
