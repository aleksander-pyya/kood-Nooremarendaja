package sprint;

public class Accumulator {

    public int accumulate(int n) {

        if (n < 0) {
          return 0;
        } else {
          int sum = 0;
          for (int i = 0; i <= n; i++) {
            sum += i;
          }
          return sum;
        }
        
    }

}
