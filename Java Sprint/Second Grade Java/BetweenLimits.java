package sprint;

public class BetweenLimits {

    public String findRange(char from, char to) {
        
        int start = Math.min(from, to) +1;
        int end = Math.max(from, to);

        String result = "";

        for (int i = start; i < end; i++) {
          result += (char) i;
        }
        return result;
    }

}
