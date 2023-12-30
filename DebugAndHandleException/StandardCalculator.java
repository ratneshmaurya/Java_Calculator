package DebugAndHandleException;

public class StandardCalculator {
    
    private double result;

    //========Addition functions of calculators=====================================================
    public void add(int num1, int num2){

        //converting int to double and calling double type fucntion only for int parameter also
        add((double)num1, (double)num2);
    }
    
    //this was before handling the MAXValues exception
    // public void add(double num1, double num2){
    //     result = num1 + num2;
    // }


    //handling maxvalues exception
    public void add(double num1, double num2){

        double result = num1 + num2;

        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }

    //=========subtract functions of calculators======================================================
    public void subtract(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        subtract((double)num1,(double)num2);
    }

    //this was before handling the MAXValues exception
    // public void subtract(double num1, double num2){
    //     result= num1-num2;
    // }


    //handling maxvalues exception
    public void subtract(double num1, double num2){

        double result = num1 - num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }


    //========multiply functions of calculators======================================================
    public void multiply(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        multiply((double)num1,(double)num2);
    }

    public void multiply(double num1, double num2){
        result= num1*num2;
    }


    //==========================================================================
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
