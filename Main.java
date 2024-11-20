package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Part 3 - Using Classes and Objects
        System.out.println("// Part 3 - Using Classes and Objects");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Experienced GP", "General Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Taylor", "Specializes in Pediatrics", "General Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lee", "Expert in family health", "Family Medicine");

        Specialist sp1 = new Specialist(4, "Dr. Green", "Cardiology Specialist", "Cardiology");
        Specialist sp2 = new Specialist(5, "Dr. Brown", "Orthopedic Specialist", "Orthopedics");

        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();
        sp1.printDetails();
        System.out.println();
        sp2.printDetails();
        System.out.println();

        // Part 5 - Collection of appointments
        System.out.println("// Part 5 - Collection of appointments");

        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create appointments
        appointments.add(new Appointment("Alice", "1234567890", "08:00", gp1));
        appointments.add(new Appointment("Bob", "9876543210", "10:00", gp2));
        appointments.add(new Appointment("Charlie", "5678901234", "14:30", sp1));
        appointments.add(new Appointment("Diana", "3456789012", "16:00", sp2));

        // Print all appointments
        printAppointments(appointments);

        // Cancel an appointment
        cancelAppointment(appointments, "9876543210");

        // Print all appointments after cancellation
        printAppointments(appointments);
    }

    public static void printAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println();
            }
        }
    }

    public static void cancelAppointment(ArrayList<Appointment> appointments, String patientPhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientPhone().equals(patientPhone)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment with phone " + patientPhone + " has been cancelled.");
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with phone " + patientPhone);
        }
    }
}
