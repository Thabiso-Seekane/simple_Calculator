package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add()
    {
        calculator addition = new calculator();
        int sum = addition.add(1,4);
        assertEquals(5,sum);
        System.out.println(sum);
    }

    @Test
    void addMultiple() {
        calculator addition = new calculator();
        int sum = addition.addMultiple(1,4,3);
        assertEquals(8,sum);
        System.out.println(sum);
    }

    @Test
    void multiply() {
        calculator multiplication = new calculator();
        int results = multiplication.multiply(2,3);
        assertEquals(6,results);
        System.out.println(results);
    }

    @Test
    void moreMultiple() {
        calculator multiplication = new calculator();
        int results = multiplication.moreMultiple(1,3,3);
        assertEquals(9,results);
        System.out.println(results);
    }
}