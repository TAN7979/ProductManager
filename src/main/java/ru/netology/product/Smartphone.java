package ru.netology.product;

public class Smartphone extends Product{

    private String manufacturer;

    public Smartphone(int id, String name, int price) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(String manufacturer){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
