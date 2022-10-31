package com.challenge.hexalab.domain.repository;

import com.challenge.hexalab.domain.model.Extract;
import com.challenge.hexalab.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExtractRepository extends JpaRepository<Extract, Long> {

    List<Extract> findByUserReceiverId(User user);
}
