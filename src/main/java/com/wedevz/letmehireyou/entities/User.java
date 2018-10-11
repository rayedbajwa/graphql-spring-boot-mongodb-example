package com.wedevz.letmehireyou.entities;

import java.util.Date;
import java.util.function.Function;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private ObjectId id;
	private String email;
	private String username;
	private String firstName;
	private String lastName;
	private String isAdmin;
	private Date createdDate;
	private UserRole role;
	
	public static enum UserRole {
		EMPLOYER, EMPLOYEE, ADMIN, MODERATOR
	};
	
	@Builder
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class UserInput {
		private String email;
		private String username;
		private String firstName;
		private String lastName;
		private String isAdmin;
		private Date createdDate;
		private UserRole role;
	}
	
	public final static Function<UserInput, User> INPUT_MAPPER = u -> User.builder()
			.email(u.getEmail())
			.username(u.getUsername())
			.firstName(u.getFirstName())
			.lastName(u.getLastName())
			.createdDate(u.getCreatedDate())
			.role(u.getRole())
			.isAdmin(u.getIsAdmin())
		.build();
}
