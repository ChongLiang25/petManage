package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.PetMapper;
import zgr.pet.pojo.Pet;
import zgr.pet.service.PetService;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;

    @Override
    public List<Pet> getPet() {
        return petMapper.getPet();
    }

    @Override
    public Pet getPetById(int id) {
        return petMapper.getPetById(id);
    }

    @Override
    public String getSpecies(int id) {
        return petMapper.getSpecies(id);
    }

    @Override
    public  List<Pet> getPetByUid(int uid) {
        return petMapper.getPetByUid(uid);
    }

    @Override
    public void addPet(Pet pet) {
        petMapper.addPet(pet);
    }

    @Override
    public void updatePet(Pet pet) {
        petMapper.updatePet(pet);
    }

    @Override
    public void delete(List<Integer> id) {
        petMapper.delete(id);
    }


}
