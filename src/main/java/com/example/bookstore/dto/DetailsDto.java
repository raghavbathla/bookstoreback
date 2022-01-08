package com.example.bookstore.dto;


public class DetailsDto {
    private String pincode;
    private String name;
    private String phoneNumber;
    private String address;
    private String city;
    private String landmark;
    private String type;

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

    public DetailsDto(String pincode, String name, String phoneNumber, String address, String city, String landmark, String type) {
        this.pincode = pincode;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.landmark = landmark;
        this.type = type;
    }

}
