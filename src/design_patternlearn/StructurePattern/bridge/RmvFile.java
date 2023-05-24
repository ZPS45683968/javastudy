package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description rmv视频文件（具体实现化角色）
 */
public class RmvFile implements VideoFile{

            @Override
            public void decode(String fileName) {
                System.out.println("rmv视频文件：" + fileName);
            }
}
