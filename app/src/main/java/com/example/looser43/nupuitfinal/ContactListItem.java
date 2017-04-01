package com.example.looser43.nupuitfinal;

/**
 * Created by Shree on 3/24/2017.
 */

public class ContactListItem {
    private String ContactImage;
    public String ContactName;
    public String ContactNumber;

    public ContactListItem(String name, String phoneNumber) {
        this.ContactName = name;
        this.ContactNumber = phoneNumber;
    }

    public String getContactImage() {
        return ContactImage;
    }

    public void setContactImage(String contactImage) {
        this.ContactImage = ContactImage;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }
}