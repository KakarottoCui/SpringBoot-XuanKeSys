package net.fuzui.StudentInfo.mapper;

import net.fuzui.StudentInfo.pojo.Course;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.mapper
 * @ClassName: CourseMapper
 * @Description: 兴趣班数据访问层接口类
 */
public interface CourseMapper {

    /**
     *  添加兴趣班
     * @param course   兴趣班信息
     * @return  插入结果 !=0则插入成功
     */
    public int insertCourse(Course course);

    /**
     *  根据兴趣班编号删除兴趣班信息信息
     * @param cid   兴趣班编号
     * @return  删除结果，!=0则删除成功
     */
    public int deleteCourse(String cid);

    /**
     *  修改兴趣班信息
     * @param course   兴趣班信息
     * @return  修改结果 !=0则修改成功
     */
    public int modifyCourse(Course course);

    /**
     *  根据兴趣班编号查询出兴趣班实体
     * @param cid
     * @return
     */
    public Course getByCouCid(String cid);


    /**
     * 查询全部兴趣班，接住sql语句进行分页
     * @param data
     * @return      查询结果
     */
    public List<Course> selectCourseBySql(Map<String, Object> data);

    /**
     * 根据兴趣班编号查询兴趣班信息
     * @param data
     * @return  查询结果
     */
    public List<Course> getByCourseCid(Map<String, Object> data);

    /**
     * 根据兴趣班名称查询兴趣班信息
     * @param data
     * @return  查询结果
     */
    public List<Course> getByCourseCname(Map<String, Object> data);

    /**
     *  根据兴趣班学院查询兴趣班信息
     * @param data
     * @return 结果
     */
    public List<Course> getByCourseCol(Map<String, Object> data);

    /**
     *  根据兴趣班类型查询兴趣班信息
     * @param data
     * @return  结果
     */
    public List<Course> getByCourseType(Map<String, Object> data);



    /**
     *  ajax验证兴趣班编号是否存在
     * @param cid   兴趣班编号
     * @return  结果
     */
    public String ajaxQueryByCid(String cid);
}
