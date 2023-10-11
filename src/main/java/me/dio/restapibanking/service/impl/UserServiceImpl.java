package me.dio.restapibanking.service.impl;

import me.dio.restapibanking.model.User;
import me.dio.restapibanking.model.UserDTO;
import me.dio.restapibanking.repository.UserRepository;
import me.dio.restapibanking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO findById(Long id) {
        return new UserDTO(userRepository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    private User findUser(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public UserDTO findByAccountNumber(String accountNumber) {
        return new UserDTO(userRepository.findByAccountNumber(accountNumber).orElseThrow(NoSuchElementException::new));
    }

    @Override
    public UserDTO create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return new UserDTO(userRepository.save(userToCreate));
    }

    @Override
    public void deleteUserById(Long id) {
        var user = findUser(id);
        userRepository.delete(user);
    }

    @Override
    public UserDTO update(Long id, User user) {
        User existingUser = findUser(id);
        if (user.getName() != null) {
            existingUser.setName(user.getName());
        }
        if (user.getAccount() != null) {
            existingUser.setAccount(user.getAccount());
        }
        if (user.getCard() != null) {
            existingUser.setCard(user.getCard());
        }
        if (user.getFeatures() != null) {
            existingUser.setFeatures(user.getFeatures());
        }
        if (user.getNews() != null) {
            existingUser.setNews(user.getNews());
        }

        return new UserDTO(userRepository.save(existingUser));
    }
}
