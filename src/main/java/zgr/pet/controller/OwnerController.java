package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.Owner;
import zgr.pet.pojo.Result;
import zgr.pet.service.OwnerService;


import java.util.List;

@Slf4j
@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public Result getOwner(){
        List<Owner> ownerList = ownerService.getOwner();
        return Result.success(ownerList);
    }

    @GetMapping("/{id}")
    public Result getOwnerById(@PathVariable int id){
        Owner owner = ownerService.getOwnerById(id);
        return Result.success(owner);
    }

    @PostMapping
    public Result addOwner(@RequestBody Owner owner){
        ownerService.addOwner(owner);
        return Result.success();
    }

    @PutMapping
    public Result updateOwner(@RequestBody Owner owner){
        ownerService.updateOwner(owner);
        System.out.println("数据是："+owner);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        ownerService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getOwnerByUid(@PathVariable int id){
        List<Owner> ownerList = ownerService.getOwnerByUid(id);
        return Result.success(ownerList);
    }

}
