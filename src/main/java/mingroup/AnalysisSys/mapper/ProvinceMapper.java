package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    @Select("select * from province")
    public List<Province> findAll();

}
