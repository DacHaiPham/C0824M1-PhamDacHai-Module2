package CleanCodeAndRefactoring.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // Chia hết cho 3 và 5
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // Chia hết cho 3
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // Chia hết cho 5
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // Không chia hết cho 3 hoặc 5
    }

}
