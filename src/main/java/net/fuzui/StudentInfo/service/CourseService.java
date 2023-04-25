package net.fuzui.StudentInfo.service;

import net.fuzui.StudentInfo.pojo.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.service
 * @ClassName: CourseService
 * @Description: 兴趣班service接口层
 */

public interface CourseService {

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
     * @param pageNo
     * @param pageSize
     * @return      查询结果
     */
    public List<Course> selectCourseBySql(int pageNo, int pageSize);

    /**
     * 根据兴趣班编号查询兴趣班信息
     * @param pageNo
     * @param pageSize
     * @return  查询结果
     */
    public List<Course> getByCourseCid(int pageNo, int pageSize,String cid);

    /**
     * 根据兴趣班名称查询兴趣班信息
     * @param pageNo
     * @param pageSize
     * @param cname     兴趣班名称
     * @return  查询结果
     */
    public List<Course> getByCourseCname(int pageNo, int pageSize,String cname);

    /**
     *  根据兴趣班学院查询兴趣班信息
     * @param pageNo
     * @param pageSize
     * @param belongcoll    所属兴趣班学院
     * @return 结果
     */
    public List<Course> getByCourseCol(int pageNo, int pageSize,String belongcoll);

    /**
     *  根据兴趣班类型查询兴趣班信息
     * @param pageNo
     * @param pageSize
     * @param type      兴趣班类型
     * @return  结果
     */
    public List<Course> getByCourseType(int pageNo, int pageSize,String type);



    /**
     *  ajax验证兴趣班编号是否存在
     * @param cid   兴趣班编号
     * @return  结果
     */
    public String ajaxQueryByCid(String cid);

}
