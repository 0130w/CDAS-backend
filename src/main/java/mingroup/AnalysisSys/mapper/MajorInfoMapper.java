package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.MajorInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MajorInfoMapper {
    @Select("select * from major_info where college_id = #{collegeId}")
    public List<MajorInfo> findByCollegeID(int collegeId);
}
