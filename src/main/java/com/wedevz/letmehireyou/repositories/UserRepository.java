package com.wedevz.letmehireyou.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wedevz.letmehireyou.entities.User;

public interface UserRepository extends MongoRepository<User, UUID> {
}
