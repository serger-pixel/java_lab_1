package com.mycompany.java_lab_1.Classes;

/**
 *
 * @author ermak
 */
public class Triangle {
    private IntNum _values [][];
    private String strTriangle = "";
    static final int _default_len = 2;
    static final int _unit = 1;
    
    
    public Triangle(IntNum len){
        _values = createMas(len);
    }
    
    public Triangle(){
        this(new IntNum(_default_len));
    }
    
    private IntNum[][] createMas(IntNum len){
        IntNum [][]values = new IntNum[len.getValue()][];
        for (int n = 0; n < len.getValue(); n++)
        {
            int prev = _unit;
            strTriangle += prev;
            values[n] = new IntNum[n+1];
            values[n][0] = new IntNum(_unit);
            for (int k = 1; k <= n; k++)
            {
                prev *= (n - k + 1); 
                prev /= k;
                values[n][k] = new IntNum(prev);
                strTriangle += prev;
            }
            strTriangle += '\n';
        }
        return values;
    }
    
    public String getStrTriangle(){
        return strTriangle;
    }
    
    public boolean setTriangle(IntNum len){
        if (!len.getPositiveStatus()){
            return false;
        }
        _values = createMas(len);
        return true;
    }
}
