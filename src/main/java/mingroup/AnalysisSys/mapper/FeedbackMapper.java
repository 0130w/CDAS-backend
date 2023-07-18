package mingroup.AnalysisSys.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedbackMapper {

    @Insert("insert into feedback(user_name, feedback) values(#{userName}, #{feedback})")
    public boolean insertFeedback(String userName, String feedback);
}
