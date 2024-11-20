package org.example;

public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // Default Constructor
    public GeneralPractitioner() {
        super();
        this.specialty = "General Medicine";
    }

    // Constructor to initialize all variables
    public GeneralPractitioner(int id, String name, String basicInfo, String specialty) {
        super(id, name, basicInfo);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Type: General Practitioner");
    }
}
