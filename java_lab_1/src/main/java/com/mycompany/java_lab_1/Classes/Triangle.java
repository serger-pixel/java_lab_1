package com.mycompany.java_lab_1.Classes;

/**
 *
 * @author ermak
 */
public class Triangle {
    private IntNum _values [][];
    private String _strTriangle;
    static final int _defaultLen = 2;
    static final int _unit = 1;
    
    
    public Triangle(IntNum len){
        _strTriangle = "";
        _values = createMas(len);
    }
    
    public Triangle(){
        this(new IntNum(_defaultLen));
    }
    
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
    
    public String getStrTriangle(){
        return _strTriangle;
    }
    
    public boolean setTriangle(IntNum len){
        if (!len.getPositiveStatus()){
            return false;
        }
        _values = createMas(len);
        return true;
    }
}
