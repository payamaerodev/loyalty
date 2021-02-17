package com.hamrasta.management.user.data.repository;

import com.hamrasta.trellis.data.sql.data.repository.IBaseRepository;
import com.hamrasta.management.user.model.User;

import java.util.Optional;

public interface IUserRepository extends IBaseRepository<User> {
    Optional<User> findById(String id);
}
