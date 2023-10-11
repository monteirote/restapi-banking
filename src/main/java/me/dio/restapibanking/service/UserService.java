package me.dio.restapibanking.service;

import me.dio.restapibanking.model.User;
import me.dio.restapibanking.model.UserDTO;

public interface UserService {

    UserDTO findById(Long id);

    UserDTO findByAccountNumber(String accountNumber);

    UserDTO create(User userToCreate);

    void deleteUserById(Long id);

    UserDTO update(Long id, User user);

}
