package com.jurbin.workout.Repository;

import com.jurbin.workout.Entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, Integer>{
    Login findLoginByUsername(String username);
    Login findLoginByPassword(String password);

}
