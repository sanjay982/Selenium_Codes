package src.test.java.Selenium;

public class User {
    int id;

    int userstatus = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String username;
    String Firstname;

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getFirstname() {
        return Firstname;
    }

    String Lastname;

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getLastname() {
        return Lastname;
    }

    String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    String Password;

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    String Phone;

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

}