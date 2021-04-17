package com.luxtest.userservice.repository;

import com.luxtest.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.luxtest.userservice.util.Queries.FIND_USERS_BY_COUNTRY;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = FIND_USERS_BY_COUNTRY, nativeQuery = true)
    List<User> findByCountry(@Param("country") String country);
}
