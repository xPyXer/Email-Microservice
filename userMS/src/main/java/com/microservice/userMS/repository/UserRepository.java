package com.microservice.userMS.repository;


import com.microservice.userMS.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
