package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.Result;
import zgr.pet.pojo.Walker;
import zgr.pet.service.WalkerService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/walkers")
public class WalkerController {

    @Autowired
    private WalkerService walkerService;

    @GetMapping
    public Result getWalker(){
        List<Walker> walkerList = walkerService.getWalker();
        return Result.success(walkerList);
    }

    @GetMapping("/{id}")
    public Result getWalkerById(@PathVariable int id){
        Walker walker = walkerService.getWalkerById(id);
        return Result.success(walker);
    }

    @PostMapping
    public Result addWalker(@RequestBody Walker walker){
        walkerService.addWalker(walker);
        return Result.success();
    }

    @PutMapping
    public Result updateWalker(@RequestBody Walker walker){
        walkerService.updateWalker(walker);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        walkerService.delete(id);
        return Result.success();
    }

}
