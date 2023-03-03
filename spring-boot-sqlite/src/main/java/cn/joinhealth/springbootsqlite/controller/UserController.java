package cn.joinhealth.springbootsqlite.controller;

import cn.joinhealth.springbootsqlite.model.User;
import cn.joinhealth.springbootsqlite.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author linjian
 * @date 2023/3/3 14:45
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@RequestParam Integer id) {
        User user = userService.getById(id);
        log.info("user {}", user);
        return user;
    }
}
