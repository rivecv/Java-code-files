package org.example;

public class Specialist extends HealthProfessional {
    private String field;

    // Default Constructor
    public Specialist() {
        super();
        this.field = "Unknown Specialty";
    }

    // Constructor to initialize all variables
    public Specialist(int id, String name, String basicInfo, String field) {
        super(id, name, basicInfo);
        this.field = field;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Field: " + field);
        System.out.println("Type: Specialist");
    }
}
