package zgr.pet.service;

import zgr.pet.pojo.PetSpecies;

import java.util.List;

public interface PetSpeciesService {
    List<PetSpecies> getAllPetSpecies();
    PetSpecies getPetSpeciesById(int id);
    List<String> getBreedsBySpecies(String species); // 新增方法
    void addPetSpecies(PetSpecies petSpecies);
    void updatePetSpecies(PetSpecies petSpecies);
    void deletePetSpecies(int id);
}