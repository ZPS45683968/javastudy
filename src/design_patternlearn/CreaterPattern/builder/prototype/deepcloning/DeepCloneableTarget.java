package design_patternlearn.CreaterPattern.builder.prototype.deepcloning;

import java.io.Serializable;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 18:21
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 由于该类的属性都是String，因此我们这里使用默认的clone完成即可
    @Override
    protected DeepCloneableTarget clone() throws CloneNotSupportedException {
        return (DeepCloneableTarget)super.clone();
    }
}
