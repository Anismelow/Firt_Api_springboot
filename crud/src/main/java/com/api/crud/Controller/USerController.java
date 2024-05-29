package com.api.crud.Controller;

import com.api.crud.Model.UserModel;
import com.api.crud.Service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class USerController {

    @Autowired
    private UserService userService;


    @GetMapping("/getusers")
    public ArrayList <UserModel> getUsers() {
        return this.userService.getUsers();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public UserModel saveUser(@RequestBody UserModel model) {
        return this.userService.saveUser(model);
    }


    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public UserModel updateUser( @PathVariable Long id, @RequestBody UserModel model) {
        model.setId(id);
        return this.userService.saveUser(model);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
    }
}
