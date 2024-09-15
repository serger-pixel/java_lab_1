package com.mycompany.java_lab_1.Classes;
import java.util.Scanner;

public class Interface {
    private String _message;
    private Scanner _sc;
    static private final String _default_mess = "Enter numbers";

    public Interface(String message) {
        _sc = new Scanner(System.in);
        _message = message;
    }
    
    public Interface(){
        this(_default_mess);
    }
    
    public void startApplication(){
        String input_user;
        do{
            input_user = scanInput();
        }while(!check(input_user));
        IntNum len = IntNum.getPositive(input_user);
        Triangle triangle = new Triangle(len);
        System.out.println(triangle.getStrTriangle());
    }
    
    private String scanInput(){
        System.out.println(_message);
        String input_user = _sc.nextLine();
        return input_user;
    }
    
    private boolean check(String input_user){
        IntNum len;
        if (input_user.length() == 0) return false;
        if (IntNum.checkNums(input_user)){
            len = IntNum.getPositive(input_user);
            return len.getPositiveStatus(); 
        }
        return false;
    }
    
    
}
