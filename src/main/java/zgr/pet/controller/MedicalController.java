package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.MedicalCheckup;
import zgr.pet.pojo.Result;
import zgr.pet.service.MedicalService;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/medical")
public class MedicalController {

    @Autowired
    private MedicalService medicalService;

    @GetMapping
    public Result getList() {
        log.info("查询全部体检信息");
        List<MedicalCheckup> MedicalCheckupList = medicalService.getAllList();
        for (MedicalCheckup checkup : MedicalCheckupList) {
            medicalService.updateReminderStatus(checkup);
        }
        return Result.success(MedicalCheckupList);
    }

    @GetMapping("/{id}")
    public Result getListById(@PathVariable int id) {
        MedicalCheckup medicalCheckup = medicalService.getListById(id);
        medicalService.updateReminderStatus(medicalCheckup);
        return Result.success(medicalCheckup);
    }

    @PostMapping
    public Result addList(@RequestBody MedicalCheckup mc) {
        medicalService.addList(mc);
        //medicalService.updateReminderStatus(mc);
        return Result.success();
    }

    @PutMapping
    public Result updateMC(@RequestBody MedicalCheckup mc) {
        medicalService.updateMC(mc);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id) {
        log.info("根据id删除, id:{}", id);
        medicalService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getMedicalById(@PathVariable int id) {
        log.info("查询当前用户的宠物的体检信息");
        List<MedicalCheckup> MedicalCheckupList = medicalService.getMedicalById(id);
        for (MedicalCheckup checkup : MedicalCheckupList) {
            medicalService.updateReminderStatus(checkup);
        }
        return Result.success(MedicalCheckupList);
    }

}
