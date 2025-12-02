package sprint;

public class AsciiAdder {
    public char addAscii( char z , int b ) {
        int asciiValue = (int) z;
        asciiValue = asciiValue + b;
        char result = (char) asciiValue;
        return result;
    }
}
