package com.company;

/**
 * Created by zero on 15-3-26.
 */
public class Rvnames {

    static char rvnames[] = new char[52];
    static int rvnames2[] = new int[52];
    static int rvnum = 0;

    public Rvnames(){

    }

    int exist(String s){

        char name = s.charAt(0);
        int idx = 0;
        if( name > 64 && name < 91)
            idx = name - 41;
        else if (name > 96 && name < 123)
            idx = name - 70;

        if(rvnames[idx] == 0){
            rvnames[idx] = name;
            rvnames2[idx] = 1 << rvnum;
            rvnum ++;
            return rvnames2[idx];
        }else{
            return rvnames2[idx];
        }
    }


}
