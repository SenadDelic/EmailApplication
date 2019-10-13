package email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySufix = "google.com";
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity = 500;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        //returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        // combine elements that returns the email
        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department + "." + companySufix;
    }

    private String setDepartment() {
        System.out.print("New worker: " + lastName + " Enter dev code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.\nEnter department code: ");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();
        if (departmentChoice == 1)
            return "sales";
        else if (departmentChoice == 2)
            return "dev";
        else if (departmentChoice == 3)
            return "acc";
        else return "";
    }

    // generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDIJKLMNJOPRSTUVZS$?0123456789";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * length);
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // set the mail box capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // set alternative email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    // show info
    public String info() {
        return "\nDisplay name: " + firstName + " " + lastName +
                "\nCompany email: " + email + "\nMailbox capacity: " + mailBoxCapacity + "mb.";
    }
}
