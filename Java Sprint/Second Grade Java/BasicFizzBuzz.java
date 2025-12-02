package sprint;

public class BasicFizzBuzz {

    public String fizzBuzz(int number) {
        
        if (number % 15 == 0) {
          return "FizzBuzz";
        } else if (number % 3 == 0) {
          return "Fizz";
          
        } else if (number % 5 == 0) {
          return "Buzz";
        } else if (number % 7 == 0) {
          return "7";
        } else {
          return Integer .toString(number);
        }

        

    }
}
