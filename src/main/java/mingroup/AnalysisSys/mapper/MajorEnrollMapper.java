package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.College;
import mingroup.AnalysisSys.entity.MajorEnroll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MajorEnrollMapper {
    @Select("select * from major_enroll where college_id = #{collegeID} and major_id = #{desMajorId} and (year = #{year1} or year = #{year2} or year = #{year3})")
    public List<MajorEnroll> getAverageAdmissionScoreRecentThreeYears(int collegeID, int desMajorId, int year1, int year2, int year3);
}
