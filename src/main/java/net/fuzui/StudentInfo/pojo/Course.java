package net.fuzui.StudentInfo.pojo;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.pojo
 * @ClassName: Course
 * @Description: 兴趣班实体类
 */
public class Course implements java.io.Serializable{
    /**
     *  序列化
     */
    private static final long serialVersionUID = 1L;
    //兴趣班编号
    private String cid;
    //兴趣班名称
    private String cname;
    //兴趣班介绍
    private String cintroduction;


    /**
     * 默认构造方法
     */
    public Course() {

    }

    /**
     *  置取方法
     */
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCintroduction() {
        return cintroduction;
    }
    public void setCintroduction(String cintroduction) {
        this.cintroduction = cintroduction;
    }



}

