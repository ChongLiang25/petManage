package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.YueZiMapper;
import zgr.pet.pojo.YueZi;
import zgr.pet.service.YueZiService;

import java.util.List;

@Service
public class YueZiServiceImpl implements YueZiService {

    @Autowired
    private YueZiMapper yueZiMapper;

    @Override
    public List<YueZi> getYueZi() {
        return yueZiMapper.getYueZi();
    }

    @Override
    public YueZi getYueZiById(int id) {
        return yueZiMapper.getYueZiById(id);
    }

    @Override
    public void addYueZi(YueZi yueZi) {
        yueZiMapper.addYueZi(yueZi);
    }

    @Override
    public void updateYueZi(YueZi yueZi) {
        yueZiMapper.updateYueZi(yueZi);
    }

    @Override
    public void delete(List<Integer> id) {
        yueZiMapper.delete(id);
    }

    @Override
    public List<YueZi> getYueZiByUId(int id) {
        return yueZiMapper.getYueZiByUId(id);
    }
}
