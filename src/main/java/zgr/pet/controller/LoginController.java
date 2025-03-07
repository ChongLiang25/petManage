package zgr.pet.controller;

import zgr.pet.pojo.Owner;
import zgr.pet.pojo.Result;
import zgr.pet.service.OwnerService;
import zgr.pet.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/login")
    public Result login(@RequestBody Owner owner) {
        log.info("用户登录: {}", owner);

        // 检查是否为管理员账号
        if ("admin".equals(owner.getUsername()) && "1234567".equals(owner.getPassword())) {
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", 0); // 管理员 ID 可以设置为 0 或其他特殊值
            claims.put("name", "管理员");
            claims.put("username", "admin");
            claims.put("role", "admin"); // 添加角色标识

            String jwt = JwtUtils.generateJwt(claims); // 生成 JWT 令牌
            return Result.success(jwt); // 返回成功的 Result 对象
        }

        // 普通用户登录
        Owner e = ownerService.login(owner);
        if (e != null) {
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getOwnerId());
            claims.put("name", e.getOwnerName());
            claims.put("username", e.getUsername());
            claims.put("role", "user"); // 添加角色标识

            String jwt = JwtUtils.generateJwt(claims); // 生成 JWT 令牌
            return Result.success(jwt); // 返回成功的 Result 对象
        }

        // 登录失败
        return Result.error("用户名或密码错误");
    }

}
