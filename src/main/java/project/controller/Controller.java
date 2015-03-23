package project.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by andrey on 23.03.15.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/aa")
public class Controller {
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
}
