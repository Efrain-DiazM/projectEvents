package com.eventsBooking.events.infraestructure.entities;

import java.util.Date;

public class ticket {
    private int id;
    private Integer status;
    private String type;
    private Float price;
    private Integer number;
    private Integer presale;
    private Date createdAt;
    private Date updatedAt;
    private int eventId; // Esta será la clave foránea de la tabla event
    private int customerId; // Esta será la clave foránea de la tabla customer

    public ticket() {
    }

    public ticket(int id, Integer status, String type, Float price, Integer number, Integer presale, Date createdAt, Date updatedAt, int eventId, int customerId) {
        this.id = id;
        this.status = status;
        this.type = type;
        this.price = price;
        this.number = number;
        this.presale = presale;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.eventId = eventId;
        this.customerId = customerId;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPresale() {
        return presale;
    }

    public void setPresale(Integer presale) {
        this.presale = presale;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
