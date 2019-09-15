package exercise1;

import javax.swing.*;

public class PatientTest {
    public static void main(String[] args) {
        int patientId;
        String firstName;
        String lastName;
        String address;
        String city;
        String province;
        String postalCode;

        patientId = Integer.parseInt(JOptionPane.showInputDialog("Patient ID"));
        firstName = JOptionPane.showInputDialog("Patient First Name");
        lastName = JOptionPane.showInputDialog("Patient Last Name");
        address = JOptionPane.showInputDialog("Patient Address");
        city = JOptionPane.showInputDialog("Patient City");
        province = JOptionPane.showInputDialog("Patient Province");
        postalCode = JOptionPane.showInputDialog("Patient Postal CODE");

        Patient patient1 = new Patient(patientId, firstName, lastName, address, city, province, postalCode);

        String message = String.format("The patient is %s %s, Id = %d, Address %s, Province %s, City %s, Postal CODE %s",
                patient1.getFirstName(), patient1.getLastName(), patient1.getPatientId(), patient1.getAddress(),
                patient1.getProvince(), patient1.getCity(), patient1.getPostalCode());

        JOptionPane.showMessageDialog(null, message);
    }
}
