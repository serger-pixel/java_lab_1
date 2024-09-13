package com.mycompany.java_lab_1.Classes;
import java.util.Scanner;

public class Interface {
    public void startApplication(){
        Scanner sc = new Scanner(System.in);
        String message = "Enter numbers divided by spaces and press ENTER to continue:";
        System.out.println(message);
        
        Triangle triangle = new Trinagle(sc.nextLine());
        
    }
}
