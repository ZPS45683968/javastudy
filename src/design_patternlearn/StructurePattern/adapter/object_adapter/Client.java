package design_patternlearn.StructurePattern.adapter.object_adapter;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author ps_zhao
 * @Description  客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("===================================");
        // 使用该电脑读取TF卡中的数据
        // 定义适配器类
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        // 读取TF卡中的数据
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);

    }
}
