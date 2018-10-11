package com.wedevz.letmehireyou.resolvers.queries;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.wedevz.letmehireyou.entities.User;

@Service
@Transactional
public class UserQuery implements GraphQLResolver<User> {
	
	
	@Autowired
	public UserQuery() {
	}
}
