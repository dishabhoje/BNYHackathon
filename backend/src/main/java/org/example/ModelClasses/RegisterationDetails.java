package org.example.ModelClasses;

public class RegisterationDetails {
    String fname;
    String lname;
    String role;
    String email;
    String password;

    public RegisterationDetails(String fname, String lname, String role, String email, String password) {
        this.fname = fname;
        this.lname = lname;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
