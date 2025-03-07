package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.PetWalking;
import zgr.pet.pojo.Result;
import zgr.pet.service.PetWalkingService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pw")
public class PetWalkingController {

    @Autowired
    private PetWalkingService petWalkingService;

    @GetMapping
    public Result getPW(){
        List<PetWalking> petWalkingList = petWalkingService.getPW();
        return Result.success(petWalkingList);
    }

    @GetMapping("/{id}")
    public Result getPWById(@PathVariable int id){
        PetWalking petWalking = petWalkingService.getPWById(id);
        return Result.success(petWalking);
    }

    @PostMapping
    public Result addPW(@RequestBody PetWalking pw){
        petWalkingService.addPW(pw);
        return Result.success();
    }

    @PutMapping
    public Result updatePW(@RequestBody PetWalking pw){
        petWalkingService.updatePW(pw);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        petWalkingService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getPWByUId(@PathVariable int id){
        List<PetWalking> petWalkingList = petWalkingService.getPWByUId(id);
        return Result.success(petWalkingList);
    }

}
