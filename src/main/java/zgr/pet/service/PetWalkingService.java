package zgr.pet.service;

import zgr.pet.pojo.PetWalking;

import java.util.List;

public interface PetWalkingService {
    List<PetWalking> getPW();

    PetWalking getPWById(int id);

    void addPW(PetWalking pw);

    void updatePW(PetWalking pw);

    void delete(List<Integer> id);

    List<PetWalking> getPWByUId(int id);
}
