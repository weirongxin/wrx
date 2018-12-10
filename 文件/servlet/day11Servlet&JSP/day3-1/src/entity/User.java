package entity;

public class User {
	private String userId;
	private String userName;
	private String userPass;
	private String gender;
	private String tel;
	private String likes;
	public User() {
		super();
	}
	public User(String userId, String userName, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
	}
	public User(String userId, String userName, String userPass, String gender, String tel, String likes) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.gender = gender;
		this.tel = tel;
		this.likes = likes;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", gender=" + gender
				+ ", tel=" + tel + ", likes=" + likes + "]";
	}
	
	
	
	
}
