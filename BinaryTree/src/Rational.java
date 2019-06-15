// Rational represents a fraction of two integers such as
// 1/2 (with numerator 1, denominator 2 and value 0.5)
// or -3/4 (with numerator -3, denominator 4 and value -0.75).
// Rational can also represent "not a number" (NaN).
//
public class Rational {
    // # 20 von 20 Punkten für Rational
    //      # umständlich, schlecht lesbar (Schleife entspricht if(true))
    //      # unnötige Objektvariable

    // TODO: declare variables
    private int numerator, denominator;
    private boolean negative;

    // Returns a new instance of 'Rational' with numerator and denominator.
    // If the denominator is 0 the object returned is an instance of Rational
    // corresponding to NaN (not a number).
    public static Rational create(int numerator, int denominator) {
        // TODO: implement this method
        return new Rational(numerator, denominator);
    }

    // TODO: define a constructor (if needed) that is called by 'Rational.create' only.
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        negative = (numerator>=0 || denominator>=0) && (numerator < 0 || denominator < 0);

    }


    // TODO: further definitions, if needed (depends on your solution)

    // Returns the value of 'this'.
    // If 'this' represents NaN, the method returns Double.NaN.
    public double value() {
        // TODO: implement this method
        if (denominator == 0) return Double.NaN;
        return (double) numerator / (double) denominator;
    }

    // Returns 'true' only if 'this' is equivalent to 'r',
    // which means that 'this' and 'r' in their reduced form have
    // the same numerator and same denominator.
    // In other words x/y is equivalent to (x/d)/(y/d)
    // where d is a common divisor of x and y.
    // We get the reduced form by dividing x and y by the greatest common divisor.
    // The method returns 'false', if either 'this' or 'r' or both are NaN.
    public boolean sameAs(Rational r) {
        // TODO: implement this method
        if (Double.isNaN(value()) || Double.isNaN(r.value())) return false;
        return value() == r.value();
    }

    private void reduce() {
        if (Double.isNaN(value())) return;
        int tmpnum = Integer.MAX_VALUE;
        while (tmpnum != numerator) {
            tmpnum = numerator;
            numerator /= gcd(numerator, denominator);
            denominator /= gcd(tmpnum, denominator);
        }
    }

    // Returns a representation with numerator and denominator in the reduced form
    // (e.g. Rational.create(2,-4).toString() returns "-1/2").
    // If the value is negative, '-' is the first character, i.e., the denominator
    // in the resulting string is always a positive number
    // (making use of the equivalence between x/-y and -x/y).
    // If 'this' is NaN, the method returns "NaN".
    public String toString() {
        // TODO: implement this method
        reduce();
        if (Double.isNaN(value())) return "NaN";
        String negString = negative ? "-" : "";
        return negString + Math.abs(numerator) + "/" + Math.abs(denominator);
    }

    // Returns the greatest common divisor of 'a' and 'b'.
    // The returned value is always positive.
    // Precondition: b != 0
    private static int gcd(int a, int b) {

        if (a==0) return b;
        if (a==b) return a;

        if (a < b) return gcd(b,a);
        if (b < 0) return gcd(a, -b);

        return gcd(a%b, b);
    }

}

