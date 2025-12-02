package sprint;

public class ReverseLetter {
    public char reverseLetter ( char a ) {
        int letterNumber = 'a' + ('z' - a);
        char letter = (char) letterNumber;
        return letter;
    }
}
