package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description 操作系统（抽象化角色）
 */
public abstract class OperatingSystem {

        protected VideoFile videoFile;

        public OperatingSystem(VideoFile videoFile) {
            this.videoFile = videoFile;
        }

        //播放功能
        public abstract void play(String fileName);
}
