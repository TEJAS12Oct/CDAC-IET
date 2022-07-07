package study.jparest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class User1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userId;
	
	@Column
	private String userName;
	@Column
	private String password;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private UserProfile profile;
	
	public UserProfile getProfile() {
		return profile;
	}
	
	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	public User1() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public User1(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	
	
	
}
