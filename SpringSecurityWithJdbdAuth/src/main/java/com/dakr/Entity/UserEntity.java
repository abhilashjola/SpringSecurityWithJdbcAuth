package com.dakr.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jdbc_Auth")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	private int enabled;
	
	@OneToMany(mappedBy = "userEnty",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<AuthoritiesEntity> authEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	

	public List<AuthoritiesEntity> getAuthEntity() {
		return authEntity;
	}

	public void setAuthEntity(List<AuthoritiesEntity> authEntity) {
		this.authEntity = authEntity;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", enabled=" + enabled
				+ ", authEntity=" + authEntity + "]";
	}

	
	public UserEntity(Long id, String userName, String password, int enabled, List<AuthoritiesEntity> authEntity) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.authEntity = authEntity;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
