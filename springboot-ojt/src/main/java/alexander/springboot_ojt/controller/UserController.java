package alexander.springboot_ojt.controller;

import alexander.springboot_ojt.model.User;
import alexander.springboot_ojt.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("user/")
public class UserController {

    UserService userService;

    @GetMapping("list")
        public List<User> listAllUser(){
        return userService.listAllUser();
        System.out.println();
        }


        @PostMapping()
    public User addUser(@ResponseBody User user){

        return user;
        }


}
