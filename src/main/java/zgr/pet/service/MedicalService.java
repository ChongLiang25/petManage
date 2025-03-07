package zgr.pet.service;

import zgr.pet.pojo.MedicalCheckup;

import java.util.List;

public interface MedicalService {

    List<MedicalCheckup> getAllList();

    MedicalCheckup getListById(int id);

    void addList(MedicalCheckup mc);

    void updateMC(MedicalCheckup mc);

    void delete(List<Integer> id);

    void updateReminderStatus(MedicalCheckup mc);

    List<MedicalCheckup> getMedicalById(int id);
}
