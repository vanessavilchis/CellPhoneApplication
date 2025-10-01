package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the serial number: "+ phone1.getSerialNumber());
        int serialNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("What Model is the phone: "+ phone1.getSerialNumber());
        String model = scan.nextLine();

        System.out.print("Who is the Carrier: " + phone1.getCarrier());
        String carrier = scan.nextLine();

        System.out.print("What is the Phone Number: "+ phone1.getPhoneNumber());
        String phoneNumber = scan.nextLine();

        System.out.print("Who is the Owner of the phone: "+ phone1.getOwner());
        String owner = scan.nextLine();

        }
    }
