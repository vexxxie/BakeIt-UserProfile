package com.example.bakeitv01;

public class ProfileModel {
    public String fName, mName, lName, email;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfileModel(String fName, String mName, String lName, String email) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.email = email;
    }
}

