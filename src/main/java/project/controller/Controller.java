package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.entity.User_roles;
import project.entity.Users;
import project.service.EncryptPassword;
import project.service.LoginDatabase;
import project.service.UsersService;
import project.service.Users_rolesService;

import javax.jws.soap.SOAPBinding;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


/**
 * Created by andrey on 23.03.15.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/aa")
public class Controller {
    @Autowired
    UsersService usersService;

    @Autowired
    Users_rolesService users_rolesService;

    @Autowired
    LoginDatabase loginDatabase;

    @Autowired
    EncryptPassword encryptPassword;

    @RequestMapping(value = "/loginuser", method = RequestMethod.GET)
    public String login2(){
        return "login";
    }

//    @RequestMapping(value = "/loginuser", method = RequestMethod.POST)
//    public void login(@RequestParam("username") String username,@RequestParam("password") String password){
//        System.err.println(username);
//        System.err.println(password);
//    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String test(){
        return "user";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String login3() {
        return "home";
    }

    @RequestMapping(value = "/fail", method = RequestMethod.GET)
    public String login4() {
        return "fail";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String login5() {
        return "home";
    }

    @RequestMapping(value = "/authorized", method = RequestMethod.GET)
    public String login6() {
        return "authorized";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username, @RequestParam("password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Users user = new Users(username,encryptPassword.encrypt(password),1);
        usersService.add(user);
        users_rolesService.add(new User_roles("ROLE_USER",user));
//
//        loginDatabase.connect();
//        password = encryptPassword.encrypt(password);
//        loginDatabase.insertData(username,password);
//        loginDatabase.closeDB();
        return "home";
    }
}
