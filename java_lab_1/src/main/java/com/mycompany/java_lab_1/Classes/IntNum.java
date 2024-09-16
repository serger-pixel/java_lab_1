package com.mycompany.java_lab_1.Classes;

public class IntNum {
    private int _value;
    private boolean _positive;
    
    IntNum(){
        _value = 0;
        _positive = false;
    }
    
    IntNum(int value){
        _value = value;
        _positive = value > 0;
    }
    
    static boolean isNum(String value){
       try {
            Integer.parseInt(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    int getValue(){
        return _value;
    }
    
    boolean getPositiveStatus(){
        return _positive;
    }
    
    boolean setValue(String value){
        if(isNum(value)){
            _value = Integer.parseInt(value);
            return true;
        }
        return false;
    }
    
    static boolean checkNums(String values){
        for(var num : values.split(" ")){
            if(!isNum(num)){
                return false;
            }
        }
        return true;
    }
    
    static IntNum getPositive(String values){
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
