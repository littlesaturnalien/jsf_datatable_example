package org.kmryfv.jsf.beans;

public class Product {
    private Integer id;
    private String name;
    private double price;
    private boolean edit;

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public Product(){
    }

    public Product(int id, String name, double price, boolean edit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.edit = edit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
