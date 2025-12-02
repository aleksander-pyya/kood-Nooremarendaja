package sprint;

public class Converter {

    // Teisendab stringi arvuks
    public int atoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int result = 0;
        int sign = 1;
        int start = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit = c - '0';
            result = result * 10 + digit;
        }

        return result * sign;
    }

    // Teisendab arvu stringiks
    public String itoa(int num) {
        if (num == 0) return "0";

        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num; // teeme arvu positiivseks
        }

        String digits = "";
        while (num > 0) {
            int digit = num % 10;
            digits = (char)('0' + digit) + digits; // lisame numbri ette
            num /= 10;
        }

        if (negative) {
            digits = "-" + digits; // paneme miinuse stringi ette
        }

        return digits;
    }
}
