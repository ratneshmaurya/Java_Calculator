package com.crio.qcalc;

//you are going to work on improving the Calculator application to 
//support floating-point arithmetic calculations.

public class StandardCalculator {
    
    private double result;

    public void add(int num1, int num2){

        //converting int to double and calling double type fucntion only for int parameter also
        add((double)num1, (double)num2);
    }
    
    public void add(double num1, double num2){
        result = num1 + num2;
    }

    public void subtract(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        subtract((double)num1,(double)num2);
    }
    public void subtract(double num1, double num2){
        result= num1-num2;
    }

    public void multiply(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        multiply((double)num1,(double)num2);
    }

    public void multiply(double num1, double num2){
        result= num1*num2;
    }

    public void divide(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        divide((double)num1,(double)num2);
    }

    public void divide(double num1, double num2){
        result= num1/num2;
    }


    //========getter setters and prinitng===========
    public double getResult() {
        return result;
    }
    
    public void clearResult() {
        result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }

    
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

}
