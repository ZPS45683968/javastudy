package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description avi视频文件（具体实现化角色）
 */
public class AviFile implements VideoFile{

        @Override
        public void decode(String fileName) {
            System.out.println("avi视频文件：" + fileName);
        }
}
