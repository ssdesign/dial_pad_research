package com.ssdesigninteractive.dialpadresearch;

/**
 * Created by i079691 on 9/27/17.
 */

public class Globals {
    private static Globals instance;
    private static double concept_1;
    private static double concept_2;

    private Globals(){}

    public void setC1(double c){
        Globals.concept_1 = c;
    }
    public double getC1(){
        return Globals.concept_1;
    }

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance = new Globals();
        }
        return instance;
    }

}
