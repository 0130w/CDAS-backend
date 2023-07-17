package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
//public interface UserMapper extends BaseMapper<User>
public interface UserMapper {

    @Select("select * from user")
    @Results({
            @Result(column = "user_id", property = "userID"),
            @Result(column = "user_name", property = "userName")
    })
    public List<User> findAll();

    @Select("select * from user where user_name = #{userName}")
    public User findByUserName(String userName);

    @Select("select * from user where user_name = #{userName} and password = #{password}")
    public User login(String userName, String password);
}
