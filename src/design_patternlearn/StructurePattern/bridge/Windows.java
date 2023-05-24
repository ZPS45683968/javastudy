package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description windows操作系统（扩展抽象化角色）
 */
public class Windows extends OperatingSystem{

        public Windows(VideoFile videoFile) {
            super(videoFile);
        }

        @Override
        public void play(String fileName) {
            videoFile.decode(fileName);
        }
}
