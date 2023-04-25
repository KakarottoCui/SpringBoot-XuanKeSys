package net.fuzui.StudentInfo.mapper;

import net.fuzui.StudentInfo.pojo.SC;
import net.fuzui.StudentInfo.pojo.StuExitSelect;
import net.fuzui.StudentInfo.pojo.StuSelectResult;
import net.fuzui.StudentInfo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.mapper
 * @ClassName: SelectCourseMapper
 * @Description: 选课数据访问接口
 */
public interface SelectCourseMapper {

    /**
     * 选课
     * @return  选课结果
     */
    public int selectCourse(@Param("cid") String cid, @Param("sid") String sid);

    /**
     * 判断是否加入过此兴趣班
     * @param cid   兴趣班编号
     * @param sid   学号
     * @return
     */
    public String existCourse(@Param("cid") String cid, @Param("sid") String sid);

    /**
     * 查询全部
     * @param data
     * @return  查询结果
     */
    public List<SC> getAllSC(Map<String, Object> data);

    /**
     * 根据兴趣班编号查询兴趣班选课信息
     * @param data
     * @return  查询结果
     */
    public List<SC> getSCByCid(Map<String, Object> data);

    /**
     * 根据学号查询本人已选兴趣班
     * @param data
     * @return  查询结果
     */
    public List<StuSelectResult> getSCBySid(Map<String, Object> data);

    /**
     * 根据学号退选（待确定··）
     * @param data
     * @return  查询结果
     */
    public List<StuExitSelect> getExitBysid(Map<String, Object> data);

    /**
     * 退选
     * @param cid
     * @return
     */
    public int deleteSC(@Param("cid") String cid,@Param("sid") String sid);

    /**
     * 查看兴趣班已选人数
     * @param data
     * @return
     */
    public List<StuExitSelect> getLookByTid(Map<String, Object> data);

    /**
     * 查看兴趣班的学生详细信息
     * @param data
     * @return
     */
    public List<Student> getByStuSid(Map<String, Object> data);

}
