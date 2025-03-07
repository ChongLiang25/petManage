package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.GeneticTestingMapper;
import zgr.pet.pojo.GeneticTesting;
import zgr.pet.service.GeneticTestingService;

import java.util.List;

@Service
public class GeneticTestingServiceImpl implements GeneticTestingService {

    @Autowired
    private GeneticTestingMapper geneticTestingMapper;

    @Override
    public List<GeneticTesting> getGT() {
        return geneticTestingMapper.getGT();
    }

    @Override
    public GeneticTesting getGTById(int id) {
        return geneticTestingMapper.getGTById(id);
    }

    @Override
    public void addGT(GeneticTesting gt) {
        geneticTestingMapper.addGT(gt);
    }

    @Override
    public void updateGT(GeneticTesting gt) {
        geneticTestingMapper.updateGT(gt);
    }

    @Override
    public void delete(List<Integer> id) {
        geneticTestingMapper.delete(id);
    }

    @Override
    public List<GeneticTesting> getGTByUId(int id) {
        return geneticTestingMapper.getGTByUId(id);
    }
}
