package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.GeneticTesting;
import zgr.pet.pojo.Result;
import zgr.pet.service.GeneticTestingService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(("/gt"))
public class GeneticTestingController {

    @Autowired
    private GeneticTestingService geneticTestingService;

    @GetMapping
    public Result getGT(){
        List<GeneticTesting> geneticTestingList = geneticTestingService.getGT();
        return Result.success(geneticTestingList);
    }

    @GetMapping("/{id}")
    public Result getGTById(@PathVariable int id){
        GeneticTesting geneticTesting = geneticTestingService.getGTById(id);
        return Result.success(geneticTesting);
    }

    @PostMapping
    public Result addGT(@RequestBody GeneticTesting gt){
        geneticTestingService.addGT(gt);
        return Result.success();
    }

    @PutMapping
    public Result updateGT(@RequestBody GeneticTesting gt){
        geneticTestingService.updateGT(gt);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        geneticTestingService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getGTByUId(@PathVariable int id){
        List<GeneticTesting> geneticTestingList = geneticTestingService.getGTByUId(id);
        return Result.success(geneticTestingList);
    }


}
