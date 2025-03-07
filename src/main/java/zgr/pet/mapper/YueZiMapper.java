package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.YueZi;

import java.util.List;

@Mapper
public interface YueZiMapper {

    @Select("select * from yuezi")
    List<YueZi> getYueZi();

    @Select("select * from yuezi where yzId = #{id}")
    YueZi getYueZiById(int id);

    @Insert("insert into yuezi(petid,OwnerID, startdate, enddate, servicetype) VALUES (#{petId},#{ownerId},#{startDate},#{endDate},#{serviceType})")
    void addYueZi(YueZi yueZi);

    @Update("update yuezi set PetID = #{petId},OwnerID = #{ownerId},StartDate = #{startDate},EndDate = #{endDate}," +
            "ServiceType = #{serviceType} where YzID = #{yzId}")
    void updateYueZi(YueZi yueZi);

    void delete(List<Integer> id);

    @Select("select * from yuezi where OwnerID = #{id}")
    List<YueZi> getYueZiByUId(int id);
}
