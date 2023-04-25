package net.fuzui.StudentInfo.mapper;

import net.fuzui.StudentInfo.pojo.CourseGrade;
import net.fuzui.StudentInfo.pojo.CoursePlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.mapper
 * @ClassName: CoursePlanMapper
 * @Description: 兴趣班安排数据接口层
 */
public interface CoursePlanMapper {

    /**
     *  添加兴趣班安排
     * @param coursePlan   兴趣班安排信息
     * @return  插入结果 !=0则插入成功
     */
    public int insertCoursePlan(CoursePlan coursePlan);

    /**
     *  根据排课班级名删除兴趣班信息信息
     * @param courseclass   排课班级名
     * @return  删除结果，!=0则删除成功
     */
    public int deleteCoursePlan(String courseclass);

    /**
     *  修改兴趣班信息
     * @param coursePlan   兴趣班安排信息
     * @return  修改结果 !=0则修改成功
     */
    public int modifyCoursePlan(CoursePlan coursePlan);



    //查询全部兴趣班安排，暂无需求
    //public List<CoursePlan> selectCoursePlanBySql(Map<String, Object> data);

    /**
     * 根据排课班级名查询兴趣班安排信息
     * @param data
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanCourseclass(Map<String, Object> data);

    /**
     * 根据教师id查询该教师所安排兴趣班信息
     * @param data
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanTid(Map<String, Object> data);

    /**
     * 根据教师id查询该教师所安排兴趣班的兴趣班编号，以方便查询兴趣班具体信息
     * @param data
     * @return  查询结果
     */
    public List<CoursePlan> getCidByCoursePlanTid(Map<String, Object> data);

    /**
     * 根据兴趣班id查询该兴趣班的上课教师，以方便查询教师具体信息
     * @param data
     * @return  查询结果
     */
    public List<CoursePlan> getTidByCoursePlanCid(Map<String, Object> data);

    /**
     * 根据上课时间、地点、查询兴趣班安排信息，为了ajax查重
     * @param coursetime    上课时间
     * @param courseweek    上课周
     * @param classroom     上课教室
     * @return  查询结果
     */
    public String ajaxGetCoursePlan(@Param("coursetime") String coursetime,@Param("courseweek") String courseweek,@Param("classroom") String classroom);

    /**
     *  	根据兴趣班编号查询该兴趣班，用于查询是否有有安排兴趣班
     * @param cid
     * @return
     */
    public String existsCoursePlan(String cid);
    
    /**
     *  	根据兴趣班编号查询该兴趣班学分
     * @param cid
     * @return
     */
    public Integer getCreditsByCid(String cid);
    

    /**
     * 根据兴趣班id查询该兴趣班的上课教师，以方便查询教师具体信息
     * @param data
     * @return  查询结果
     */
    public List<CourseGrade> getCourseGrade(Map<String, Object> data);

}
