package zgr.pet.service;

import zgr.pet.pojo.Pet;

import java.util.List;

public interface PetService {

    List<Pet> getPet();

    Pet getPetById(int id);

    void addPet(Pet pet);

    void updatePet(Pet pet);

    void delete(List<Integer> id);

    String getSpecies(int id);

    List<Pet> getPetByUid(int uid);
}
