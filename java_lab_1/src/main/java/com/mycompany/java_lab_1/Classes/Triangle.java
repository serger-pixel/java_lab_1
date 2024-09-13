package com.mycompany.java_lab_1.Classes;

/**
 *
 * @author ermak
 */
public class Triangle {
    private IntNum [][]_values;
    private String strTriangle;
    static final int _default_len = 2;
    static final int _unit = 1;
    
    
    Triangle(IntNum len){
        _values = new IntNum[len][];
        for (int n = 0; n < len; n++)
        {
            int prev = _unit;
            strTriangle+=prev.getValue();
            triangle[n] = new int[n+1];
            triangle[n][0] = IntNum(_unit);
            for (int k = 1; k <= n; k++)
            {
                prev *= (n - k + 1); 
                prev /= k;
                triangle[n][k] = IntNum(prev);
                strTriangle+=prev.getValue();
            }
            strTriangle+='\n';
        }
    }
    
//    Triangle(){
//        _values = new IntNum[_default_len][];
//        _values[0] = new IntNum[_unit];
//        _values[0][0] = new IntNum(_unit);
//        _values[1] = new IntNum[_unit];
//        _values[1][0] = new IntNum(_unit);
//        _values[1][1] = new IntNum(_unit);
//        _values[1][2] = new IntNum(_unit);
//    }
    
    public String getStrTriangle(){
        return strTriangle;
    }
}
