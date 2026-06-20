package com.labdemo.productdemo;
 

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "pid")
    private int pid;

    @Column(name = "pname")
    private String pname;

    @Column(name = "price")
    private double price;
    
    public Product() {
    	
    
    }

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price=price;

    }

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid=pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname=pname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price=price;
    }
   
    @Override
    public String toString() {
        return "Product [pid=" + pid +
                ", pname=" + pname +
                ", price=" + price +
                "]";
    }
}
