package LeetCode_DSA.Easy;
import java.util.List;

    class Solution {
    public List<String> fizzBuzz(int n) {
        // String ka S capital aur beech me '=' lagaya hai
        String[] strarray = new String[n]; 
        
        for (int i = 0; i < n; i++) {
            int number = i + 1;
            
            // F aur B ko capital kiya hai LeetCode ke mutabik
            if (number % 3 == 0 && number % 5 == 0) {
                strarray[i] = "FizzBuzz"; 
            }
            else if (number % 3 == 0) {
                strarray[i] = "Fizz";
            }
            else if (number % 5 == 0) {
                strarray[i] = "Buzz";
            }
            else {
                strarray[i] = number + "";
            }
        }
        return java.util.Arrays.asList(strarray);
    }
}