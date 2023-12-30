package ScientificCalculator;

//Base class is Standard Caclulator and Subclass is Scientific Calculator
public class StandardCalculator {
    
    // private double result;
    //making protected becoz we are using this variable in subclass- ScientificCalculator class
    protected double result;


    //========Addition functions of calculators=====================================================
    //making final so that subcalss don't override this method
    public final void add(int num1, int num2){

        //converting int to double and calling double type fucntion only for int parameter also
        add((double)num1, (double)num2);
    }
    
    //this was before handling the MAXValues exception
    // public void add(double num1, double num2){
    //     result = num1 + num2;
    // }


    //handling maxvalues exception
     //making final so that subcalss don't override this method
    public final void add(double num1, double num2){

        double result = num1 + num2;

        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }

    //=========subtract functions of calculators======================================================
     //making final so that subcalss don't override this method
    public final void subtract(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        subtract((double)num1,(double)num2);
    }

    //this was before handling the MAXValues exception
    // public void subtract(double num1, double num2){
    //     result= num1-num2;
    // }


    //handling maxvalues exception
     //making final so that subcalss don't override this method
    public final void subtract(double num1, double num2){

        double result = num1 - num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }


    //========multiply functions of calculators======================================================
     //making final so that subcalss don't override this method
    public final void multiply(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        multiply((double)num1,(double)num2);
    }

    //handling maxvalues exception
    public final void multiply(double num1, double num2){
        //result= num1*num2;
        double result = num1*num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
    }


    //==========================================================================
     //making final so that subcalss don't override this method
    public final void divide(int num1, int num2){
        //converting int to double and calling double type fucntion only for int parameter also
        divide((double)num1,(double)num2);
    }

    //handling maxvalues exception
    public final void divide(double num1, double num2){
        //result= num1/num2;
        double result = num1/num2;

        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
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
