package com.mycompany.java_lab_1.Classes;
import java.util.Scanner;

public class Interface {
    private String _message; // Сообщение для пользователя
    private Scanner _sc; // Объект сканнера
    static private final String _defaultMess = "Enter numbers"; // Сообщение
    // для пользователя по умолчанию

    /**
     * Конструктор с параметром
     * @param message - сообщение для пользователя 
     */
    public Interface(String message) {
        _sc = new Scanner(System.in);
        _message = message;
    }
    
    /**
     * Конструктор по умолчанию
     */
    public Interface(){
        this(_defaultMess);
    }
    
    /**
     * Запуск приложения
     */
    public void startApplication(){
        String inputUser;
        do{
            inputUser = scanInput();
        }while(!check(inputUser));
        IntNum len = IntNum.getPositive(inputUser);
        Triangle triangle = new Triangle(len);
        System.out.println(triangle.getStrTriangle());
    }
    
    /**
     * Получение ввода пользователя
     * @return введённую строчку
     */
    private String scanInput(){
        System.out.println(_message);
        String inputUser = _sc.nextLine();
        return inputUser;
    }
    
    /**
     * Проверка на корректность ввода
     * @param inputUser - введённая пользователем строка
     * @return true/false в зависимости от результата проверки
     */
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
