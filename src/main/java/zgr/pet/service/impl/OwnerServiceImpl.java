package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.OwnerMapper;
import zgr.pet.pojo.Owner;
import zgr.pet.service.OwnerService;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public List<Owner> getOwner() {
        return ownerMapper.getOwner();
    }

    @Override
    public Owner getOwnerById(int id) {
        return ownerMapper.getOwnerById(id);
    }

    @Override
    public void addOwner(Owner owner) {
        ownerMapper.addOwner(owner);
    }

    @Override
    public void updateOwner(Owner owner) {
        ownerMapper.updateOwner(owner);
    }

    @Override
    public void delete(List<Integer> id) {
        ownerMapper.delete(id);
    }

    @Override
    public Owner login(Owner owner) {
        return ownerMapper.getByUsernameAndPassword(owner);
    }

    @Override
    public List<Owner> getOwnerByUid(int id) {
        return ownerMapper.getOwnerByUid(id);
    }
}
