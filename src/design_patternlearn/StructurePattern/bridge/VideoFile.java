package design_patternlearn.StructurePattern.bridge;

/**
 * @Author ps_zhao
 * @Description 视频文件(实现化角色)
 */
public interface VideoFile {

    //解码功能
    void decode(String fileName);
}
