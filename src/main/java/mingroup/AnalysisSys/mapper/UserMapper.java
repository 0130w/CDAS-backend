package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.User;
import org.apache.ibatis.annotations.*;

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

    @Update("insert into user(user_name, password, sex, grade, province_name, des_major, des_province, des_college) values(#{userName}, #{" +
            "password}, #{sex}, #{grade}, #{provinceName}, #{desMajor}, #{desProvince}, #{desCollege})")
    public boolean insertUser(User user);

    @Delete("delete from user where user_name = #{userName}")
    public boolean deleteUser(String userName);
}
