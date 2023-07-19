package mingroup.AnalysisSys.mapper;

import mingroup.AnalysisSys.entity.Feedback;
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
    List<User> findAll();

    @Select("select * from user where user_name = #{userName}")
    User findByUserName(String userName);

    @Select("select * from user where user_name = #{userName} and password = #{password}")
    User login(User user);

    @Update("insert into user(user_name, password, sex, grade, province_name, des_major, des_province, des_college) values(#{userName}, #{" +
            "password}, #{sex}, #{grade}, #{provinceName}, #{desMajor}, #{desProvince}, #{desCollege})")
    boolean insertUser(User user);

    @Delete("delete from user where user_name = #{userName}")
    boolean deleteUser(String userName);

    @Update("update user set password=#{password}, sex=#{sex}, grade=#{grade}, province_name=#{provinceName}, des_major=#{desMajor}, des_province=#{desProvince}, des_college=#{desCollege} where user_name=#{userName}")
    boolean updateUser(User user);

    @Select("select * from feedback where user_name = #{userName}")
    List<Feedback> findFeedbackByUserName(String userName);
}
