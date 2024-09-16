package com.mycompany.java_lab_1.Classes;

public class Triangle {
    private IntNum _values [][]; // Массив строк треугольника
    private String _strTriangle; // Представление треугольника в виде строки
    static final int _defaultLen = 2; // Кол-во строк по умолчанию
    static final int _unit = 1; // Опорная единица
    
    /**
     * Конструктор с параметрами
     * @param len - кол-во строк треугольника
     */
    public Triangle(IntNum len){
        _strTriangle = "";
        _values = createMas(len);
    }
    
    /**
     * Конструктор по умолчанию
     */
    public Triangle(){
        this(new IntNum(_defaultLen));
    }
    
    /**
     * Заполнение массива объектами IntNum
     * @param len - кол-во строк треугольника
     * @return массив массивов объектов IntNum
     */
    private IntNum[][] createMas(IntNum len){
        IntNum [][]values = new IntNum[len.getValue()][];
        for (int n = 0; n < len.getValue(); n++)
        {
            int prev = _unit;
            _strTriangle += prev;
            values[n] = new IntNum[n+1];
            values[n][0] = new IntNum(_unit);
            for (int k = 1; k <= n; k++)
            {
                prev *= (n - k + 1); 
                prev /= k;
                values[n][k] = new IntNum(prev);
                _strTriangle += prev;
            }
            _strTriangle += '\n';
        }
        return values;
    }
    
    /**
     * Полуение представления треугольника в виде строки
     * @return представление треугольника в виде строки
     */
    public String getStrTriangle(){
        return _strTriangle;
    }
    
    /**
     * Переопределение треугольника
     * @param len - кол-во строк треугольника
     * @return true/false в зависимости от проверки статуса числа строк
     */
    public boolean setTriangle(IntNum len){
        if (!len.getPositiveStatus()){
            return false;
        }
        _values = createMas(len);
        return true;
    }
}
