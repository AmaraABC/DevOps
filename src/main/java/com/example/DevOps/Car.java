package com.example.DevOps;

public class Car {
    private String mark;
    private String plateNumber;
    private String price;

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String mark, String plateNumber, String price) {
        this.mark = mark;
        this.plateNumber = plateNumber;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
