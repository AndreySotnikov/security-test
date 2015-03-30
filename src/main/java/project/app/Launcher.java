package project.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import project.entity.User_roles;
import project.entity.Users;
import project.repository.User_rolesRepository;
import project.repository.UsersRepository;
import project.service.EncryptPassword;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by andrey on 23.03.15.
 */
public class Launcher {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        EncryptPassword encryptPassword = new EncryptPassword();
        ApplicationContext context = SpringApplication.run(MainConfig.class,args);
        User_rolesRepository ur = context.getBean(User_rolesRepository.class);
        UsersRepository u = context.getBean(UsersRepository.class);

        Users user = new Users("22",encryptPassword.encrypt("22"),1);
        u.save(user);
        ur.save(new User_roles("ROLE_USER", user));

        user = new Users("333",encryptPassword.encrypt("333"),1);
        u.save(user);
        ur.save(new User_roles("ROLE_USER", user));

        user = new Users("4444",encryptPassword.encrypt("4444"),1);
        u.save(user);
        ur.save(new User_roles("ROLE_USER", user));
    }
}
