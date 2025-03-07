package zgr.pet.mapper;

import org.apache.ibatis.annotations.*;
import zgr.pet.pojo.Pet;

import java.util.List;

@Mapper
public interface PetMapper {

    @Select("select * from pet")
    List<Pet> getPet();

    @Select("select * from pet where PetID = #{id}")
    Pet getPetById(@Param("id") int id);

    @Insert("insert into pet(PetName, OwnerID, Species, Breed, Gender, Age, Weight, HealthStatus) " +
            "values(#{petName},#{ownerId},#{species},#{breed},#{gender},#{age},#{weight},#{healthStatus})")
    void addPet(Pet pet);

    @Update("update pet set PetName = #{petName},OwnerID = #{ownerId},Species = #{species},Breed = #{breed}," +
            "Gender = #{gender},Age = #{age},Weight = #{weight},HealthStatus = #{healthStatus} where PetID = #{petId}")
    void updatePet(Pet pet);

    void delete(List<Integer> id);

    @Select("select Species from pet where PetID = #{id}")
    String getSpecies(int id);

    @Select("select * from pet where OwnerID = #{uid}")
    List<Pet> getPetByUid(int uid);
}
