package zgr.pet.service;

import zgr.pet.pojo.Walker;

import java.util.List;

public interface WalkerService {

    List<Walker> getWalker();

    Walker getWalkerById(int id);

    void addWalker(Walker walker);

    void updateWalker(Walker walker);

    void delete(List<Integer> id);
}
