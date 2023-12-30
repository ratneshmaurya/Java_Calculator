package com.crio.qcalc;

// here this class inheriting standardCalculator class, hence taking all his methods
public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
    }
    public void cos(double a){
        result = Math.cos(a);
    }

    // square() method is using the implementation of the existing 
    //multiply() method which is inherited from the base class.
    public void square(double a){
        multiply(a,a);
    }

    
    public void tan(double a){
        result= Math.tan(a);
    }


    public void log(double a){
        result=Math.log(a);
    }


    public void sqrt(double a){
        result=Math.sqrt(a);
    }


    public void cbrt(double a){
        result=Math.cbrt(a);
    }


    //==========getter and setters for this subclass===================
    
    //we have to override becoz it is already defined in the Base class
    @Override
    public void printResult(){
        System.out.println("Scientific Calculator Result:"+ result );
    }



}
