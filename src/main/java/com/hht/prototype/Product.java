package com.hht.prototype;

public class Product implements IPrototype{

    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }




    @Override
    public IPrototype clone() {
        Product product = new Product(this.name, this.price);
        return product;
    }


    @Override
    public IPrototype deepClone() {
        return clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +"Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
