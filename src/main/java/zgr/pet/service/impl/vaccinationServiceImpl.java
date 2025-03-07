package zgr.pet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zgr.pet.mapper.VaccinationMapper;
import zgr.pet.pojo.Vaccination;
import zgr.pet.service.VaccinationService;

import java.util.Date;
import java.util.List;

@Service
public class vaccinationServiceImpl implements VaccinationService {

    @Autowired
    private VaccinationMapper vaccinationMapper;

    @Override
    public List<Vaccination> getVaccine() {
        return vaccinationMapper.getVaccine();
    }

    @Override
    public Vaccination getVaccineById(int id) {
        return vaccinationMapper.getVaccineById(id);
    }

    @Override
    public void addVaccine(Vaccination vaccination) {
        vaccinationMapper.addVaccine(vaccination);
    }

    @Override
    public void updateVaccine(Vaccination vaccination) {
        vaccinationMapper.updateVaccine(vaccination);
    }

    @Override
    public void delete(List<Integer> id) {
        vaccinationMapper.delete(id);
    }

    @Override
    public void updateReminderStatus(Vaccination vaccination) {
        Date currentDate = new Date();
        if (vaccination.getVaccinationDate().compareTo(currentDate) <= 0) {
            vaccination.setReminderStatus("已提醒");
        } else {
            vaccination.setReminderStatus("未提醒");
        }
        vaccinationMapper.updateReminderStatus(vaccination);
    }

    @Override
    public List<Vaccination> getVaccineByUId(int id) {
        return vaccinationMapper.getVaccineByUId(id);
    }
}
