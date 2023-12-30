
package DebugAndHandleException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        StandardCalculator calc = new StandardCalculator();
        //calc.add(1,2);
        //System.out.println(calc.getResult());

        //now priting the overflow values conditions
        calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        calc.printResult();
        //System.out.println(new App().getGreeting());
    }
}
