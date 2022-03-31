package controllers;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import view.userRepositry;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private userRepositry iuser ;

    @GetMapping("/All")
    public List <User> GetUser() { return iuser.findAll();}


    @PostMapping("/Add")
    public User CreateUser(@RequestBody User req){return iuser.save(req);}



}

