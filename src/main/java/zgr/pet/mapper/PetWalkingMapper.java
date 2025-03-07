package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.PetWalking;

import java.util.List;

@Mapper
public interface PetWalkingMapper {

    @Select("select * from petwalking")
    List<PetWalking> getPW();

    @Select("select * from petwalking where PwID = #{id}")
    PetWalking getPWById(int id);

    @Insert("insert into petwalking(petid,OwnerID, startdate, enddate, servicetype, walkerid) VALUES " +
            "(#{petId},#{ownerId},#{startDate},#{endDate},#{serviceType},#{walkerId})")
    void addPW(PetWalking pw);

    @Update("update petwalking set PetID = #{petId},OwnerID = #{ownerId},startdate = #{startDate}," +
            "enddate = #{endDate},servicetype = #{serviceType},walkerid = #{walkerId} where PwID = #{pwId}")
    void updatePW(PetWalking pw);

    void delete(List<Integer> id);

    @Select("select * from petwalking where OwnerID = #{id}")
    List<PetWalking> getPWByUId(int id);
}
