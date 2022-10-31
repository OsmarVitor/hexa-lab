package com.challenge.hexalab.domain.repository;

import com.challenge.hexalab.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUsersByAgAndAcc(String ag, String acc);

    Optional<User> findUsersByCpfCnpj(String cpfCnpj);
}
