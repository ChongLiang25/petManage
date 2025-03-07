package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.PetSpeciesMapper;
import zgr.pet.pojo.PetSpecies;
import zgr.pet.service.PetSpeciesService;

import java.util.List;

@Service
public class PetSpeciesServiceImpl implements PetSpeciesService {

    @Autowired
    private PetSpeciesMapper petSpeciesMapper;

    @Override
    public List<PetSpecies> getAllPetSpecies() {
        return petSpeciesMapper.getAllPetSpecies();
    }

    @Override
    public PetSpecies getPetSpeciesById(int id) {
        return petSpeciesMapper.getPetSpeciesById(id);
    }

    @Override
    public List<String> getBreedsBySpecies(String species) {
        return petSpeciesMapper.getBreedsBySpecies(species);
    }

    @Override
    public void addPetSpecies(PetSpecies petSpecies) {
        petSpeciesMapper.addPetSpecies(petSpecies);
    }

    @Override
    public void updatePetSpecies(PetSpecies petSpecies) {
        petSpeciesMapper.updatePetSpecies(petSpecies);
    }

    @Override
    public void deletePetSpecies(int id) {
        petSpeciesMapper.deletePetSpecies(id);
    }
}