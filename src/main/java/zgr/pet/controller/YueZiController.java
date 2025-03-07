package zgr.pet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zgr.pet.pojo.Result;
import zgr.pet.pojo.YueZi;
import zgr.pet.service.YueZiService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("yue")
public class YueZiController {

    @Autowired
    private YueZiService yueZiService;

    @GetMapping
    public Result getPet(){
        List<YueZi> yueZiList = yueZiService.getYueZi();
        return Result.success(yueZiList);
    }

    @GetMapping("/{id}")
    public Result getYueZiById(@PathVariable int id){
        YueZi yueZi = yueZiService.getYueZiById(id);
        return Result.success(yueZi);
    }

    @PostMapping
    public Result addYueZi(@RequestBody YueZi yueZi){
        yueZiService.addYueZi(yueZi);
        return Result.success();
    }

    @PutMapping
    public Result updateYueZi(@RequestBody YueZi yueZi){
        yueZiService.updateYueZi(yueZi);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable List<Integer> id){
        log.info("根据id删除, id:{}",id);
        yueZiService.delete(id);
        return Result.success();
    }

    @GetMapping("/u/{id}")
    public Result getYueZiByUId(@PathVariable int id){
        List<YueZi> yueZiList = yueZiService.getYueZiByUId(id);
        return Result.success(yueZiList);
    }

}
