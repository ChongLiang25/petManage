package zgr.pet.service;

import zgr.pet.pojo.YueZi;

import java.util.List;

public interface YueZiService {
    List<YueZi> getYueZi();

    YueZi getYueZiById(int id);

    void addYueZi(YueZi yueZi);

    void updateYueZi(YueZi yueZi);

    void delete(List<Integer> id);

    List<YueZi> getYueZiByUId(int id);
}
