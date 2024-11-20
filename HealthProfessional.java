package org.example;

public class HealthProfessional {
    private int id;
    private String name;
    private String basicInfo;

    // Default Constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.basicInfo = "No information";
    }

    // Constructor to initialize all variables
    public HealthProfessional(int id, String name, String basicInfo) {
        this.id = id;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }

    public String getName() {
        return name;
    }
}
