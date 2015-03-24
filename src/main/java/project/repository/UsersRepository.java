package project.repository;

import org.springframework.data.repository.CrudRepository;
import project.entity.Users;

/**
* Created by andrey on 23.03.15.
*/
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
