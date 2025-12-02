package sprint;

public class DescComb5 {

    public String combinations() {
        String result = "";

      for (int a = 9; a >= 4; a--) {
        for (int b = a - 1; b >= 3; b--) {
          for (int c = b - 1; c >= 2; c--) {
            for (int d = c - 1; d >= 1; d--) {
              for (int e = d - 1; e >= 0; e--) {
                result += "" + a + b + c + d + e +"|";
              }
            }
          }
        }
      }

      if (result.endsWith("|")) {
        result = result.substring(0, result.length() -1);
      }

      return result;

    }
}
