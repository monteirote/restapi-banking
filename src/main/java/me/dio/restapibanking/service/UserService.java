package me.dio.restapibanking.service;

import me.dio.restapibanking.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
