package com.wedevz.letmehireyou.resolvers.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.wedevz.letmehireyou.entities.User;
import com.wedevz.letmehireyou.repositories.UserRepository;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	private final UserRepository userRepository;

	@Autowired
	public Mutation(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User createUser(final User.UserInput input) {
		return userRepository.insert(User.INPUT_MAPPER.apply(input));
	}
}
