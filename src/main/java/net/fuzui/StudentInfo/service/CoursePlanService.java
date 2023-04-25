package net.fuzui.StudentInfo.service;

import net.fuzui.StudentInfo.pojo.CourseGrade;
import net.fuzui.StudentInfo.pojo.CoursePlan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.service
 * @ClassName: CoursePlanService
 * @Description: 兴趣班安排service接口
 */

public interface CoursePlanService {

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
    //public List<CoursePlan> selectCoursePlanBySql(int pageNo, int pageSize);

    /**
     * 根据排课班级名查询兴趣班安排信息
     * @param pageNo
     * @param pageSize
     * @param courseclass   开课班级名
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanCourseclass(int pageNo, int pageSize, String courseclass);

    /**
     * 根据教师id查询该教师所安排兴趣班信息
     * @param pageNo
     * @param pageSize
     * @param tid   教师id
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanTid(int pageNo, int pageSize, String tid);

    /**
     * 根据教师id查询该教师所安排兴趣班的兴趣班编号，以方便查询兴趣班具体信息
     * @param pageNo
     * @param pageSize
     * @param   tid     教师id
     * @return  查询结果
     */
    public List<CoursePlan> getCidByCoursePlanTid(int pageNo, int pageSize, String tid);

    /**
     * 根据兴趣班id查询该兴趣班的上课教师，以方便查询教师具体信息
     * @param pageNo
     * @param pageSize
     * @param   cid     兴趣班编号
     * @return  查询结果
     */
    public List<CoursePlan> getTidByCoursePlanCid(int pageNo, int pageSize, String cid);

    /**
     * 根据上课时间、地点、查询兴趣班安排信息，为了ajax查重
     * @param coursetime    上课时间
     * @param courseweek    上课周
     * @param classroom     上课教师
     * @return  查询结果
     */
    public String ajaxGetCoursePlan(String coursetime, String courseweek, String classroom);

    /**
     *  根据兴趣班编号查询该兴趣班，用于查询是否有有安排兴趣班
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
     * @param pageNo
     * @param pageSize
     * @param   cid     兴趣班编号
     * @return  查询结果
     */
    public List<CourseGrade> getCourseGrade(int pageNo, int pageSize, String cid);

}
