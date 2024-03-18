package com.POCProject.POC.Repositories;

import com.POCProject.POC.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);
}
