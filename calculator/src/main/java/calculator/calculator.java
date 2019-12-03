package calculator;
import java.util.Scanner;
public class calculator {

//    function that adds only two numbers.
    public static int add(int a, int b) {
        return a + b;
    }
//this function allows multiple addition.
    public static int addMultiple(int...x)
    {
        int sum = 0;
        for (int i = 0; i <x.length ; i++) {
            sum += x[i];
        }
        return sum;
    }

//    the function allows multiplication between two numbers.
    public static int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

//    this method allows multi multiplication.
    public static int moreMultiple(double...y) {
        int count = 1;
        for (int i = 0; i < y.length ; i++) {
            count *= y[i];
        }
        return count;
    }

    public static void main(String[] args)
    {
        int sum = add(1,2);
        System.out.println(sum);

        int multiSum = addMultiple(1,2,9,4);
        System.out.println(multiSum);

        int answer = multiply(20,2);
        System.out.println(answer);

        int multianswer= moreMultiple(3,4,8,5,7);
            System.out.println(multianswer);


    }
}
