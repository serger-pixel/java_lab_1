package com.mycompany.java_lab_1.Classes;
import java.util.Scanner;

public class Interface {
    private String _message;
    private Scanner _sc;
    static private final String _defaultMess = "Enter numbers";

    public Interface(String message) {
        _sc = new Scanner(System.in);
        _message = message;
    }
    
    public Interface(){
        this(_defaultMess);
    }
    
    public void startApplication(){
        String inputUser;
        do{
            inputUser = scanInput();
        }while(!check(inputUser));
        IntNum len = IntNum.getPositive(inputUser);
        Triangle triangle = new Triangle(len);
        System.out.println(triangle.getStrTriangle());
    }
    
    private String scanInput(){
        System.out.println(_message);
        String inputUser = _sc.nextLine();
        return inputUser;
    }
    
    private boolean check(String inputUser){
        IntNum len;
        if (inputUser.length() == 0) return false;
        if (IntNum.checkNums(inputUser)){
            len = IntNum.getPositive(inputUser);
            return len.getPositiveStatus(); 
        }
        return false;
    }
    
    
}
