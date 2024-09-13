package com.mycompany.java_lab_1.Classes;

public class IntNum {
    private int _value;
    private boolean _positive;
    
    IntNum(){
        _value = 0;
        _positive = true;
    }
    
    IntNum(int value){
        _value = value;
        if(value > 0){
            _positive = true;
        } else {
            _positive = false;
        }
    }
    
    static boolean isNum(String str){
       try {
            Integer.parseInt(str);
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
        } else {
            return false;
        }
    }
    
    static boolean checkNums(String values){
        String[] inputNumbs = values.split(" ");
        for(var num : inputNumbs){
            if(!isNum(num)){
                return false;
            }
        }
        return true;
    }
    
    static IntNum getPositive(String[] strMas){
        for(var el : strMas){
            IntNum number = new IntNum(Integer.parseInt(el));
            if(number.getPositiveStatus()){
                return number;
            }
        }
        IntNum tempNumb = new IntNum();
        return tempNumb;
    }
}
