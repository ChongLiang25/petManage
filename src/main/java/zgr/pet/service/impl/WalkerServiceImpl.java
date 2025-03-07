package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.WalkerMapper;
import zgr.pet.pojo.Walker;
import zgr.pet.service.WalkerService;

import java.util.List;

@Service
public class WalkerServiceImpl implements WalkerService {

    @Autowired
    private WalkerMapper walkerMapper;

    @Override
    public List<Walker> getWalker() {
        return walkerMapper.getWalker();
    }

    @Override
    public Walker getWalkerById(int id) {
        return walkerMapper.getWalkerById(id);
    }

    @Override
    public void addWalker(Walker walker) {
        walkerMapper.addWalker(walker);
    }

    @Override
    public void updateWalker(Walker walker) {
        walkerMapper.updateWalker(walker);
    }

    @Override
    public void delete(List<Integer> id) {
        walkerMapper.delete(id);
    }
}
