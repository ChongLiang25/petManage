package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.Pet;
import zgr.pet.pojo.Result;
import zgr.pet.service.PetService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public Result getPet(){
        log.info("查询全部宠物");
        List<Pet> petList = petService.getPet();
        return Result.success(petList);
    }

    @GetMapping("/{id}")
    public Result getPetById(@PathVariable int id){
        log.info("根据id查询宠物信息, id:{}",id);
        Pet pet = petService.getPetById(id);
        return Result.success(pet);
    }

    @GetMapping("/u/{uid}")
    public Result getPetByUid(@PathVariable int uid){
        log.info("根据uid查询宠物信息, uid:{}",uid);
        List<Pet> pet = petService.getPetByUid(uid);
        return Result.success(pet);
    }

    @GetMapping("/species/{id}")
    public Result getSpecies(@PathVariable int id){
        log.info("根据id查询宠物性别, id:{}",id);
        String species = petService.getSpecies(id);
        return Result.success(species);
    }

    @PostMapping
    public Result addPet(@RequestBody Pet pet){
        log.info("新增宠物，pet:{}",pet);
        petService.addPet(pet);
        return Result.success();
    }

    @PutMapping
    public Result updatePet(@RequestBody Pet pet){
        log.info("更新宠物信息，pet:{}",pet);
        petService.updatePet(pet);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        petService.delete(id);
        return Result.success();
    }

}
