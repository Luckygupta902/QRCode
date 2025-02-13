package com.pratices.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratices.demo.modle.UserMobileDetailes;


@Repository
public interface UserMobileRepo extends JpaRepository<UserMobileDetailes,Long>{

}
