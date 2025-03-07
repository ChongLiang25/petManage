package zgr.pet.service;

import zgr.pet.pojo.GeneticTesting;

import java.util.List;

public interface GeneticTestingService {
    List<GeneticTesting> getGT();

    GeneticTesting getGTById(int id);

    void addGT(GeneticTesting gt);

    void updateGT(GeneticTesting gt);

    void delete(List<Integer> id);

    List<GeneticTesting> getGTByUId(int id);
}
