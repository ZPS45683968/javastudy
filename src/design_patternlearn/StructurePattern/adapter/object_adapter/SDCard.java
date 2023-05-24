package design_patternlearn.StructurePattern.adapter.object_adapter;

/**
 * @Author ps_zhao
 * @Description 目标接口
 */
public interface SDCard {
    // 读取SD卡方法
    String readSD();
    // 写入SD卡功能
    void writeSD(String msg);
}
