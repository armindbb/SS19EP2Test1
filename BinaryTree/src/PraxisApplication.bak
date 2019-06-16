// This class can be modified and is for testing your solution.
// Modifications will NOT be reviewed or assessed.
//
public class PraxisApplication {

    public static void main(String[] args) {

        Rational r = Rational.create(-3,-6);
        System.out.println(r); // 1/2
        System.out.println(r.value()); // 0.5

        Rational s = Rational.create(2,0);
        System.out.println(s); // NaN
        System.out.println(s.value()); // NaN

        System.out.println(r.sameAs(Rational.create(5,10))); // true
        System.out.println(r.sameAs(s)); // false
        System.out.println(s.sameAs(s)); // false

        RationalSet m1 = new RationalSet();

        System.out.println(m1.add(r)); // true
        System.out.println(m1.add(Rational.create(3,6))); // false
        System.out.println(m1.add(Rational.create(2,-3))); // true
        System.out.println(m1.add(Rational.create(-3,-4))); // true
        System.out.println(m1.add(Rational.create(1,-3))); // true

        System.out.println(m1); // [-2/3, -1/3, 1/2, 3/4]

    }
}

