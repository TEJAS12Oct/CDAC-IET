package study.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int profileId;

	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String email;

	
	@OneToOne
	private User1 user;
	
	public User1 getUser() {
		return user;
	}
	
	
	public void setUser(User1 user) {
		this.user = user;
	}
	
	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public UserProfile() {}

	public UserProfile(int profileId, String firstName, String lastName, String email) {
		super();
		this.profileId = profileId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
}
