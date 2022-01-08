package com.example.bookstore.model;


import com.example.bookstore.dto.DetailsDto;

import javax.persistence.*;

@Entity
@Table(name = "details_address")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String pincode;
    private String name;
    private String phoneNumber;
    private String address;
    private String city;
    private String landmark;
    private String type;

    public Details(DetailsDto dto) {
        this.pincode = dto.getPincode();
        this.name = dto.getName();
        this.phoneNumber = dto.getPhoneNumber();
        this.address = dto.getAddress();
        this.city = dto.getCity();
        this.landmark = dto.getLandmark();
        this.type = dto.getType();
    }

    public Details() {

    }


    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
