package com.bmc.fw;

/**
 * Created by energetic on 27.07.2016.
 */
public class ContactData {

    private String firstname;
    private String lastname;
    private String adress;
    private String home;
    private String mobile;
    private String work;
    private String email1;
    private String email2;

    public String getFirstname() {
        return firstname;
    }

    public ContactData setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public ContactData setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public ContactData setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getHome() {
        return home;
    }

    public ContactData setHome(String home) {
        this.home = home;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public ContactData setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getWork() {
        return work;
    }

    public ContactData setWork(String work) {
        this.work = work;
        return this;
    }

    public String getEmail1() {
        return email1;
    }

    public ContactData setEmail1(String email1) {
        this.email1 = email1;
        return this;
    }

    public String getEmail2() {
        return email2;
    }

    public ContactData setEmail2(String email2) {
        this.email2 = email2;
        return this;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress='" + adress + '\'' +
                ", home='" + home + '\'' +
                ", mobile='" + mobile + '\'' +
                ", work='" + work + '\'' +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                '}';
    }
}
