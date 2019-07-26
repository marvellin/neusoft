package cn.edu.scau.neusoft.po;

public class User {
    private Integer userID;
    private String password;
    private String userName;

    public User(Integer userID, String password, String userName) {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
