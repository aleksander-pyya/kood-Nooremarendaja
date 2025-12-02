package sprint;

public class FloatMinusInt {

    public static double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
        return floating - integer ;
    }

    public static int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
        int casted = (int)floating ;
        return casted - integer;
    }
}
