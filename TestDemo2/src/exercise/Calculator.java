package exercise;

public class Calculator {

    //metode er vores mindste unit i klassen
    public double sum(double num1, double num2)  {
        if (num1 <= 0.0 && num2 <= 0.0) {
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }
}
