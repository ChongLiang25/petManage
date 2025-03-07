package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.Owner;

import java.util.List;

@Mapper
public interface OwnerMapper {

    @Select("select * from owner")
    List<Owner> getOwner();

    @Select("select * from owner where OwnerID = #{id}")
    Owner getOwnerById(int id);

    @Insert("insert into owner(ownername, username, password, phone) VALUES (#{ownerName},#{username},#{password},#{phone})")
    void addOwner(Owner owner);

    @Update("update owner set OwnerName = #{ownerName},username = #{username},password = #{password},Phone = #{phone} where OwnerID = #{ownerId}")
    void updateOwner(Owner owner);

    void delete(List<Integer> id);

    @Select("select * from owner where username = #{username} and password = #{password};")
    Owner getByUsernameAndPassword(Owner owner);

    @Select("select * from owner where OwnerID = #{id}")
    List<Owner> getOwnerByUid(int id);
}
