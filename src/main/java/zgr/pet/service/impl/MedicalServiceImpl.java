package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.MedicalMapper;
import zgr.pet.pojo.MedicalCheckup;
import zgr.pet.service.MedicalService;

import java.util.Date;
import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {

    @Autowired
    private MedicalMapper medicalMapper;

    @Override
    public List<MedicalCheckup> getAllList() {
        return medicalMapper.getAllList();
    }

    @Override
    public MedicalCheckup getListById(int id) {
        return medicalMapper.getListById(id);
    }

    @Override
    public void addList(MedicalCheckup mc) {
        medicalMapper.addList(mc);
    }

    @Override
    public void updateMC(MedicalCheckup mc) {
        medicalMapper.updateMC(mc);
    }

    @Override
    public void delete(List<Integer> id) {
        medicalMapper.delete(id);
    }

    @Override
    public void updateReminderStatus(MedicalCheckup mc) {
        Date currentDate = new Date();
        if (mc.getCheckupDate().compareTo(currentDate) <= 0) {
            mc.setReminderStatus("已提醒");
        } else {
            mc.setReminderStatus("未提醒");
        }
        medicalMapper.updateReminderStatus(mc);
    }

    @Override
    public List<MedicalCheckup> getMedicalById(int id) {
        return medicalMapper.getMedicalById(id);
    }
}
