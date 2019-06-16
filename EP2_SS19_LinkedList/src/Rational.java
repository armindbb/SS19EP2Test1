// Rational represents a fraction of two integers such as
// 1/2 (with numerator 1, denominator 2 and value 0.5)
// or -3/4 (with numerator -3, denominator 4 and value -0.75).
// Rational can also represent "not a number" (NaN).
//
public class Rational {

    // # 20 von 20 Punkten für Rational

    // TODO: declare variables
    private int numerator;
    private int denominator;
    private boolean validNumber;

    // Returns a new instance of 'Rational' with numerator and denominator.
    // If the denominator is 0, the object returned is an instance of Rational
    // corresponding to NaN (not a number).
    public static Rational create(int numerator, int denominator) {
        Rational r = new Rational(numerator, denominator);
        return r;
    }

    public boolean isValidNumber() {
        return validNumber;
    }

    public Rational(int numerator, int denominator) {
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator == 0) {
            this.validNumber = false;
        } else {
            this.validNumber = true;
        }
    }

    // TODO: further definitions, if needed (depends on your solution)

    // Returns the product of 'this' and 'r'.
    // For example, the product of 2/3 and 4/5 is 8/15.
    // If either 'this' or 'r' is NaN, the method returns NaN.
    public Rational mult(Rational r) {
        if (!this.validNumber) {
            return this;
        }
        if (!r.validNumber){
            return r;
        }

        Rational r2 = new Rational(this.numerator*r.numerator, this.denominator*r.denominator);
        return r2;
    }

    // Returns the value of 'this'.
    // If 'this' represents NaN, the method returns Double.NaN.
    public double value() {
        if (!this.validNumber) {
            return Double.NaN;
        }

        double d = (double)this.numerator/this.denominator;
        return d;
    }

    // Returns a representation with numerator and denominator such as "-1/2".
    // If the value is negative, the sign is the first character, i.e., the denominator
    // in the resulting string is always a positive number
    // (making use of the equivalence between x/-y and -x/y).
    // If 'this' is NaN, the method returns "NaN".
    public String toString() {
        if (!this.validNumber) {
            return "NaN";
        }
        return "" + this.numerator+"/"+ this.denominator;
    }

}


