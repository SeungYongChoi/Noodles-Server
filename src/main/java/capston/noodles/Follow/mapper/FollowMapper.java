package capston.noodles.Follow.mapper;

import capston.noodles.Follow.model.dao.Follow;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FollowMapper {

    void save(Follow follow);

    Long getFollowByUserIdxs(Follow follow);

}