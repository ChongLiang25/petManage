package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.PetSpecies;
import zgr.pet.pojo.Result;
import zgr.pet.service.PetSpeciesService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pet-species")
public class PetSpeciesController {

    @Autowired
    private PetSpeciesService petSpeciesService;

    @GetMapping
    public Result getAllPetSpecies() {
        log.info("查询全部宠物种类和品种");
        List<PetSpecies> petSpeciesList = petSpeciesService.getAllPetSpecies();
        return Result.success(petSpeciesList);
    }

    @GetMapping("/{id}")
    public Result getPetSpeciesById(@PathVariable int id) {
        log.info("根据id查询宠物种类和品种信息, id:{}", id);
        PetSpecies petSpecies = petSpeciesService.getPetSpeciesById(id);
        return Result.success(petSpecies);
    }

    @GetMapping("/breeds")
    public Result getBreedsBySpecies(@RequestParam String species) {
        log.info("根据species查询breed, species:{}", species);
        List<String> breeds = petSpeciesService.getBreedsBySpecies(species);
        return Result.success(breeds);
    }

    @PostMapping
    public Result addPetSpecies(@RequestBody PetSpecies petSpecies) {
        log.info("新增宠物种类和品种，petSpecies:{}", petSpecies);
        petSpeciesService.addPetSpecies(petSpecies);
        return Result.success();
    }

    @PutMapping
    public Result updatePetSpecies(@RequestBody PetSpecies petSpecies) {
        log.info("更新宠物种类和品种信息，petSpecies:{}", petSpecies);
        petSpeciesService.updatePetSpecies(petSpecies);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result deletePetSpecies(@PathVariable int id) {
        log.info("根据id删除宠物种类和品种, id:{}", id);
        petSpeciesService.deletePetSpecies(id);
        return Result.success();
    }
}