/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author chotr
 */
public class Product {
    private int id;
    private String type;
    private String name;
    private float price;
    private String img_link;
    private String img_list;
    private Date created;
    private int view;
    private int quantity;

    public Product() {
    }

    public Product(int id, String type, String name, float price, String img_link, String img_list, Date created, int view, int quantity) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.img_link = img_link;
        this.img_list = img_list;
        this.created = created;
        this.view = view;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }

    public String getImg_list() {
        return img_list;
    }

    public void setImg_list(String img_list) {
        this.img_list = img_list;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
