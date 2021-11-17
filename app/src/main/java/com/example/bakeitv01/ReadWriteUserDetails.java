package com.example.bakeitv01;

public class ReadWriteUserDetails {
    public String fName, mName, lName;

    public ReadWriteUserDetails(){};

    public ReadWriteUserDetails(String textFName, String textMName, String textLName) {
        this.fName = textFName;
        this.mName = textMName;
        this.lName = textLName;
    }
}
