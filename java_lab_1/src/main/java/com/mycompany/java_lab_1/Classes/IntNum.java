package com.mycompany.java_lab_1.Classes;

public class IntNum {
    private int _value; // Значение числа
    private boolean _positive; // Статус числа
    
    /**
     * Конструктор по умолчанию
     */
    public IntNum(){
        _value = 0;
        _positive = false;
    }
    
    /**
     * Конструктор с параметром
     * @param value - значение числа
     */
    public IntNum(int value){
        _value = value;
        _positive = value > 0;
    }
    
    /**
     * Проверка на то, что символ является числом
     * @param value - символ
     * @return true/false в зависимости от результата проверки
     */
    public static boolean isNum(String value){
       try {
            Integer.parseInt(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    /**
     * Получение значения числа
     * @return значение числа
     */
    public int getValue(){
        return _value;
    }
    
    /**
     * Получение статуса числа
     * @return статус числа
     */
    public boolean getPositiveStatus(){
        return _positive;
    }
    
    /**
     * Установка значения числа
     * @param value - символ
     * @return true/false в зависимости от того, удалось ли установить значение
     */
    public boolean setValue(String value){
        if(isNum(value)){
            _value = Integer.parseInt(value);
            return true;
        }
        return false;
    }
    
    /**
     * Проверка строки на наличие символов, не являющихся числами
     * @param values - строка
     * @return true/false в зависимости от результата проверки
     */
    public static boolean checkNums(String values){
        for(var num : values.split(" ")){
            if(!isNum(num)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Получение первого положительного числа из строки
     * @param values - строка
     * @return объект IntNum
     */
    public static IntNum getPositive(String values){
        for(var num : values.split(" ")){
            IntNum number = new IntNum(Integer.parseInt(num));
            if(number.getPositiveStatus()){
                return number;
            }
        }
        IntNum tempNumb = new IntNum();
        return tempNumb;
    }
}
