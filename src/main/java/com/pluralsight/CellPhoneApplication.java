package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        Scanner scan = new Scanner(System.in);

        CellPhone userPhoneOne = new CellPhone();
        CellPhone userPhoneTwo = new CellPhone();

        userPhoneTwo.setSerialNumber(0);
        userPhoneTwo.setPhoneNumber("7279066299");
        userPhoneTwo.setOwner("Personal cell");
        userPhoneTwo.setCarrier("T-Mobile");
        userPhoneTwo.setModel("Mobile number");

        System.out.print("What is the serial number? ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        userPhoneOne.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String model = scan.nextLine();
        userPhoneOne.setModel(model);

        System.out.print("Who is the Carrier: " + phone1.getCarrier());
        String carrier = scan.nextLine();
        userPhoneOne.setCarrier(carrier);

        System.out.print("What is the Phone Number: "+ phone1.getPhoneNumber());
        String phoneNumber = scan.nextLine();
        userPhoneOne.setPhoneNumber(phoneNumber);

        System.out.print("Who is the Owner of the phone: "+ phone1.getOwner());
        String owner = scan.nextLine();
        userPhoneOne.setOwner(owner);

        CellPhone.display(userPhoneOne);
        CellPhone.display(userPhoneTwo);

        userPhoneOne.dial(userPhoneTwo.getPhoneNumber());
        userPhoneTwo.dial(userPhoneOne.getPhoneNumber());

        }
    }
