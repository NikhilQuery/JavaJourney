public class Method_practice_Set {

    // Question 1: Multiplication table
    static void multiplication(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", num, i, num * i);
        }
    }

    // Question 2: Increasing star pattern
    static void starPatternUp(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();   
        }
    }

    // Question 3: Recursive sum of first n natural numbers
    static int sumOfNaturalNumbers(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumOfNaturalNumbers(num - 1);
    }

    // Question 4: Decreasing star pattern
    static void starPatternDown(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 5: Nth term of Fibonacci series using recursion
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    
    public static void main(String[] args) {
        
        System.out.println("--- Question 1: Multiplication Table ---");
        multiplication(7);
        System.out.println();

        System.out.println("--- Question 2: Increasing Pattern ---");
        starPatternUp(4);
        System.out.println();

        System.out.println("--- Question 3: Recursive Sum ---");
        int sumResult = sumOfNaturalNumbers(4);
        System.out.println("Sum of first 4 natural numbers: " + sumResult);
        System.out.println();

        System.out.println("--- Question 4: Decreasing Pattern ---");
        starPatternDown(4);
        System.out.println();

        System.out.println("--- Question 5: Fibonacci Series ---");
        int fibResult = fibonacci(5);
        System.out.println("The 5th term of Fibonacci series is: " + fibResult);
    }
}