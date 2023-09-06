package com.dakr.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity

public class AuthoritiesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String authorities;
	
	@OneToMany
	@JoinColumn(name="userName")
	private List<UserEntity> userEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	

	public List<UserEntity> getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(List<UserEntity> userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public String toString() {
		return "AuthoritiesEntity [id=" + id + ", authorities=" + authorities + ", userEntity=" + userEntity + "]";
	}

	

	public AuthoritiesEntity(Long id, String authorities, List<UserEntity> userEntity) {
		super();
		this.id = id;
		this.authorities = authorities;
		this.userEntity = userEntity;
	}

	public AuthoritiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
