package com.cdac.usermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.usermicroservice.entity.Users;
@Repository
public interface UserRepository extends JpaRepository<Users,String> {

}
