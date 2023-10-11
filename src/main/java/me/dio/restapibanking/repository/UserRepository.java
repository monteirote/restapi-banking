package me.dio.restapibanking.repository;

import me.dio.restapibanking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

    Optional<User> findByAccountNumber(String accountNumber);

}
