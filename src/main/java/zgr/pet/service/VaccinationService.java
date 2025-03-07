package zgr.pet.service;

import zgr.pet.pojo.Vaccination;

import java.util.List;

public interface VaccinationService {
    List<Vaccination> getVaccine();

    Vaccination getVaccineById(int id);

    void addVaccine(Vaccination vaccination);

    void updateVaccine(Vaccination vaccination);

    void delete(List<Integer> id);

    void updateReminderStatus(Vaccination vaccination);

    List<Vaccination> getVaccineByUId(int id);
}
