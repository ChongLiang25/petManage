package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.Result;
import zgr.pet.pojo.Vaccination;
import zgr.pet.service.VaccinationService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/vc")
public class VaccinationController {

    @Autowired
    private VaccinationService vaccinationService;

    @GetMapping
    public Result getVaccine(){
        List<Vaccination> vaccinationList = vaccinationService.getVaccine();
        for (Vaccination vaccination:vaccinationList) {
            vaccinationService.updateReminderStatus(vaccination);
        }
        return Result.success(vaccinationList);
    }

    @GetMapping("/{id}")
    public Result getVaccineById(@PathVariable int id){
        Vaccination vaccination = vaccinationService.getVaccineById(id);
        vaccinationService.updateReminderStatus(vaccination);
        return Result.success(vaccination);
    }

    @PostMapping
    public Result addVaccine(@RequestBody Vaccination vaccination){
        vaccinationService.addVaccine(vaccination);
        return Result.success();
    }

    @PutMapping
    public Result updateVaccine(@RequestBody Vaccination vaccination){
        vaccinationService.updateVaccine(vaccination);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        vaccinationService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getVaccineByUId(@PathVariable int id){
        List<Vaccination> vaccinationList = vaccinationService.getVaccineByUId(id);
        for (Vaccination vaccination:vaccinationList) {
            vaccinationService.updateReminderStatus(vaccination);
        }
        return Result.success(vaccinationList);
    }

}
