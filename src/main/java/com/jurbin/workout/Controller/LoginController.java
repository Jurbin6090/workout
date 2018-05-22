package com.jurbin.workout.Controller;


import com.jurbin.workout.Entity.Login;
import com.jurbin.workout.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
//@RestController("/login")
public class LoginController {

    @Autowired
    LoginRepository loginRepository;

    @PostMapping("login")
    @ResponseBody
    public boolean login(@RequestBody Login login){
        //gets username from DB
        Login retrievedLogin = loginRepository.findLoginByUsername(login.getUsername());

        //compares the DB's username password to the input, and checks to see if null
        if(retrievedLogin != null) {
            if (retrievedLogin.getPassword().equals(login.getPassword())) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    @PutMapping("/createLogin")
    @ResponseBody
    public Login createLogin(@RequestBody Login login){
        return loginRepository.save(login);
    }


}
