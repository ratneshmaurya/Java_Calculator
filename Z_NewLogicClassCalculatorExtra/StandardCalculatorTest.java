package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }


    //Testing for normal Integer values ==============================

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(10, 5);
        double actualResult= standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(3,5);
        double actualResult=standardCalculator.getResult();
        Assertions.assertEquals(15, actualResult);
    }


    //testing for double values also===============================


    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Doubles")
    void testDivisionOperationForDoubles(){
        standardCalculator.divide(10.5, 5.25);
        double actualResult= standardCalculator.getResult();
        Assertions.assertEquals(2.0, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply(3.0,5.0);
        double actualResult=standardCalculator.getResult();
        Assertions.assertEquals(15.0, actualResult);
    }


    //Testing for overflow(Error Handling Cases) of Double values =============================

    //NOTE----Important
    // Few observations we can make out of these new tests for add and subtract methods:
    // A static assertThrows method of Assertions class currently accepts two parameters.
    // First parameter indicates the type of exception the method being tested should throw.
    // Second parameter is an Executable object which has an overridden execute() method wrapping the method being tested.
    // These tests will PASS if and only if the exception is thrown for some scenarios and matches the Exception type 
    //specified in the first parameter.
        
    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }


    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
        @Override
        public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    
    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }
    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles in which One is Positive and Other is Negative")
    void testMultiplicationOverflowForDoublesOnePosOtherNeg(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    //writing test for divide by zero in division case===============
    
   @Test
   @DisplayName("Test Division Divide By Zero Scenario")
   void testDivisionDivideByZero(){
       //Assert
       Assertions.assertThrows(ArithmeticException.class,new Executable(){
           @Override
           public void execute() throws Throwable{
               standardCalculator.divide(10,0);
           }
       });
   }


}
