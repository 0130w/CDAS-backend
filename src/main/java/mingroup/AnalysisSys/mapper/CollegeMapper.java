package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.College;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CollegeMapper {

    @Select("select * from college")
    public List<College> findAll();

    @Select("select province_name from college")
    public List<String> findProvince();

    @Select("select count(*) from college group by province_name order by count(*) desc")
    public List<Integer> findProvinceCount();

    @Select("select * from college order by popularity desc")
    public List<College> sortByPopularity();

    @Update("update college set display_ad = #{displayAd} where college_name = #{collegeName}")
    public boolean updateDisplayAd(String collegeName, boolean displayAd);
}
