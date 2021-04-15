package com.luxtest.core.repository;

import com.luxtest.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.luxtest.core.util.Queries.FIND_USERS_BY_COUNTRY;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = FIND_USERS_BY_COUNTRY, nativeQuery = true)
    List<User> findByCountry(@Param("country") String country);
}
