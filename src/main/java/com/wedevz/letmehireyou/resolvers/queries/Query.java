package com.wedevz.letmehireyou.resolvers.queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.wedevz.letmehireyou.entities.User;
import com.wedevz.letmehireyou.repositories.UserRepository;

@Component
public class Query implements GraphQLQueryResolver {
	
	private final UserRepository userRepository;
	
	@Autowired
	public Query(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
