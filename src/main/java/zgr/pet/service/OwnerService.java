package zgr.pet.service;

import zgr.pet.pojo.Owner;

import java.util.List;

public interface OwnerService {

    List<Owner> getOwner();

    Owner getOwnerById(int id);

    void addOwner(Owner owner);

    void updateOwner(Owner owner);

    void delete(List<Integer> id);

    Owner login(Owner owner);

    List<Owner> getOwnerByUid(int id);
}
