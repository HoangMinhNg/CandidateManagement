package sample.dto;

import sample.utils.Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
public class Candidate implements Comparable<Object> {

    private String id;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String address;
    private String email;
    private String phone;
    private String type;

    public Candidate() {
    }

    public Candidate(String id) {
        this.id = id;
    }

    // change properties to private.
    // create getter, setter, 
    // Create constructor have parameters( need remove init value of properties
    // override toString

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void creatCandidate() {
        firstName = Utils.getString("First name: ");
        lastName = Utils.getString("Last name: ");
        birthDay = Utils.getString("Birthday: ");
        address = Utils.getString("Address: ");
        email = Utils.getString("email: ");
        phone = Utils.getString("phone: ");
        type = Utils.getString("type: ");
    }

    public void updateCandidate() {
        firstName = Utils.getString("First name", firstName);
        lastName = Utils.getString("Last name", lastName);
        birthDay = Utils.getString("Birthday", birthDay);
        address = Utils.getString("Address", address);
        email = Utils.getString("email", email);
        phone = Utils.getString("phone", phone);
        type = Utils.getString("type", type);
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Candidate) obj).getId());
    }

    @Override
    public String toString() {
        return "Candidate{" + "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", birthDay = " + birthDay
                + ", address = " + address + ", email = " + email + ", phone = " + phone + ", type = " + type;
    }

    @Override
    public int compareTo(Object o) {
        return this.id.compareToIgnoreCase(id);
    }

}
