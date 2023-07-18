package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MajorMapper {
    @Select("select * from major where major_name = #{majorName}")
    public Major getMajorByName(String majorName);
}
