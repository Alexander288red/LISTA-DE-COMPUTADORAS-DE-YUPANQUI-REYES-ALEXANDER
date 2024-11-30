/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO.DE.COMPUTADORAS.model;

/**
 *
 * @author Usuario
 */
public class Computer {
private Long id;
    private String brand;
    private String model;
    private String processor;
    private int ramSize; // en GB
    private int storageSize; // en GB

    // Constructor
    public Computer(Long id, String brand, String model, String processor, int ramSize, int storageSize) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}
