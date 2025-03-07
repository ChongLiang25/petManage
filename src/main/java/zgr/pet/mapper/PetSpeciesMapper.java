package zgr.pet.mapper;

import org.apache.ibatis.annotations.*;
import zgr.pet.pojo.PetSpecies;

import java.util.List;

@Mapper
public interface PetSpeciesMapper {

    @Select("SELECT * FROM petspecies")
    List<PetSpecies> getAllPetSpecies();

    @Select("SELECT * FROM petspecies WHERE id = #{id}")
    PetSpecies getPetSpeciesById(int id);

    @Select("SELECT breed FROM petspecies WHERE species = #{species}")
    List<String> getBreedsBySpecies(String species);

    @Insert("INSERT INTO petspecies (species, breed) VALUES (#{species}, #{breed})")
    void addPetSpecies(PetSpecies petSpecies);

    @Update("UPDATE petspecies SET species = #{species}, breed = #{breed} WHERE id = #{id}")
    void updatePetSpecies(PetSpecies petSpecies);

    @Delete("DELETE FROM petspecies WHERE id = #{id}")
    void deletePetSpecies(int id);
}