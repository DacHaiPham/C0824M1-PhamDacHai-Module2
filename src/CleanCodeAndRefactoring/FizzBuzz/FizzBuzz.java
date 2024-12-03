package CleanCodeAndRefactoring.FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        // Tách biểu thức thành các biến có ý nghĩa
        boolean isFizz = number % 3 == 0; // Kiểm tra số chia hết cho 3
        boolean isBuzz = number % 5 == 0; // Kiểm tra số chia hết cho 5

        if (isFizz && isBuzz) { // Số chia hết cho cả 3 và 5
            return "FizzBuzz";
        }
        if (isFizz) { // Số chia hết cho 3
            return "Fizz";
        }
        if (isBuzz) { // Số chia hết cho 5
            return "Buzz";
        }
        // Trả về chính số đó nếu không thỏa mãn điều kiện trên
        return number + "";
    }
}
