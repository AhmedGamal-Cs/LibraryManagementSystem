/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shaltout.librarymanagementsystem.db.model;

/**
 *
 * @author ahmed
 */
public class Staff {
    
    private String staffId;
    private String name;
    private String contact;

    public Staff(String staffId, String name, String contact) {
        this.staffId = staffId;
        this.name = name;
        this.contact = contact;
    }

    
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
