package com.company;

import java.util.ArrayList;

/**
 * Created by zero on 15-3-26.
 */
public class Expression {

    int type;
    int length;
    ArrayList<Integer> col;
    ArrayList<Double> val;

    public Expression(){
        col = new ArrayList<Integer>();
        val = new ArrayList<Double>();
    }

    void setLength(int i){
        this.length = i;
    }

    void setType(int i){
        this.type = i;
    }

    void addElement(int a, double b){
        this.length ++;
        col.add(a);
        val.add(b);
    }

    int getLength(){
        return this.length;
    }

    int getType(){
        return type;
    }

    int getCol(int i){
        return col.get(i);
    }

    double getVal(int i){
        return val.get(i);
    }

    void print(){
        System.out.println("type = "+type);
        System.out.println("length = " + length);
        for (int i=0;i<length;i++){
            System.out.println("col = "+col.get(i) +" val = "+val.get(i));
        }

    }

}
