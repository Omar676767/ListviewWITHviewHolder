package com.example.hp.listviewwithviewholder;

/**
 * Created by HP on 10/11/2017.
 */

public class UserInfo {
    private String name;
    private String contact;

    public UserInfo(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }
}
