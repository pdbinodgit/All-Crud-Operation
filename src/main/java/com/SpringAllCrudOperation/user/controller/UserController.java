package com.SpringAllCrudOperation.user.controller;

import com.SpringAllCrudOperation.user.model.User;
import com.SpringAllCrudOperation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User saveValue(@RequestBody User user){
        return userService.saveValues(user);
    }

    @GetMapping("/all/{offset}/{page}")
    public Page<User> getAll(@PathVariable("offset") int offset,@PathVariable("page") int page){
        return userService.getAllValues(offset, page);

    }
    @GetMapping("/getById/{id}")
        public User getById(@PathVariable ("id") int id){

        return userService.getById(id);
    }
    @GetMapping("/getByName/{name}")
    public User getByName(@PathVariable String name){
        return userService.getByName(name);
    }

    @GetMapping("/getByAge/{age}")
    public List<User> getByAge(@PathVariable("age") String age){
      return userService.getByAge(age);
    }
    @GetMapping("/getByAgeGreaterThan25")
    public List<User> getAllByAge(){
        return userService.getByAgeGreaterThan25();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
         userService.deleteValue(id);
         return "deleted";
    }
    @PutMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
}
