package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.Walker;

import java.util.List;

@Mapper
public interface WalkerMapper {

    @Select("select * from walker")
    List<Walker> getWalker();

    @Select("select * from walker where WalkerID = #{id}")
    Walker getWalkerById(int id);

    @Insert("insert into walker(walkername, phone) VALUES (#{walkerName},#{phone})")
    void addWalker(Walker walker);

    @Update("update walker set WalkerName = #{walkerName},Phone = #{phone} where WalkerID = #{walkerId}")
    void updateWalker(Walker walker);

    void delete(List<Integer> id);

}
