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
public class Transaction {
    private int id;
    private int status;
    private int user_id;
    private String user_name;
    private String user_mail;
    private String user_phone;
    private float amount;
    private String massage;
    private Date created;
    private String user_address;
    private int quantity;
    private int product_id;

    public Transaction() {
    }

    public Transaction(int id, int status, int user_id, String user_name, String user_mail, String user_phone, float amount, String massage, Date created, String user_address, int quantity, int product_id) {
        this.id = id;
        this.status = status;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_mail = user_mail;
        this.user_phone = user_phone;
        this.amount = amount;
        this.massage = massage;
        this.created = created;
        this.user_address = user_address;
        this.quantity = quantity;
        this.product_id = product_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    
}
