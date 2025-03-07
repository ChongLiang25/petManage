package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.PetWalkingMapper;
import zgr.pet.pojo.PetWalking;
import zgr.pet.service.PetWalkingService;

import java.util.List;

@Service
public class PetWalkingServiceImpl implements PetWalkingService {

    @Autowired
    private PetWalkingMapper petWalkingMapper;

    @Override
    public List<PetWalking> getPW() {
        return petWalkingMapper.getPW();
    }

    @Override
    public PetWalking getPWById(int id) {
        return petWalkingMapper.getPWById(id);
    }

    @Override
    public void addPW(PetWalking pw) {
        petWalkingMapper.addPW(pw);
    }

    @Override
    public void updatePW(PetWalking pw) {
        petWalkingMapper.updatePW(pw);
    }

    @Override
    public void delete(List<Integer> id) {
        petWalkingMapper.delete(id);
    }

    @Override
    public List<PetWalking> getPWByUId(int id) {
        return petWalkingMapper.getPWByUId(id);
    }
}
