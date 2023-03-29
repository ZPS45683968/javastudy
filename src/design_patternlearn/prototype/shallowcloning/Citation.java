package design_patternlearn.prototype.shallowcloning;

/**
 * @ author ps_zhao
 * @ date 2023/3/29 17:53
 */
public class Citation implements Cloneable{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void display() {
        System.out.println(name + "同学：在2023学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
