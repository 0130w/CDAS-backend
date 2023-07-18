package mingroup.AnalysisSys.repository;

import mingroup.AnalysisSys.entity.CollegeMajor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CollegeMajorRepository {
    @Select("select year, province_name, college_name, lowest_grade, lowest_ranking, major_name, major_grade, major_ranking " +
            "from relation natural join college natural join major_info natural join major natural join major_enroll")
    public List<CollegeMajor> findAll();

}
