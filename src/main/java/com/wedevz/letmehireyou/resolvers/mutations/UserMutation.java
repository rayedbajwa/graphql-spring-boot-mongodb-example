package com.wedevz.letmehireyou.resolvers.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.wedevz.letmehireyou.entities.User;

@Service
public class UserMutation implements GraphQLResolver<User> {
	
	@Autowired
	public UserMutation() {
	}

}
