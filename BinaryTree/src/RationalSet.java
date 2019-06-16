// This class represents a sorted set of elements of type 'Rational'.
// The elements are sorted with respect to their value.
// 'RationalSet' uses a binary search tree for storing elements.
// The set must not contain two rationals with the same reduced form (no duplicates).
// TODO: define further classes for the implementation of the binary search tree, if needed (either in this file
//  or in separate files)
//
public class RationalSet {

    // # 55 von 55 Punkten für RationalSet

    // TODO: declare variables
    private RationalSet left, right;
    private Rational value;

    // Ensures that 'r' is an element of the set. The methods changes the set only if
    // it does not already have an element equivalent to 'r'.
    // Returns 'true' if this set changed as a result of the call, and 'false' otherwise.
    // NaN can not be an element of this set, i.e., if 'r' is NaN the method returns 'false'.
    // Precondition: r != null.
    public boolean add(Rational r) {
        // TODO: implement this method
        if (Double.isNaN(r.value())) return false;

        if (value == null) {
            value = r;
            return true;
        }

        if (r.value() < value.value()) {
            if (left == null) left = new RationalSet();
            return left.add(r);
        }

        if (value.value() == r.value()) return false;

        if (r.value() > value.value()) {
            if (right == null) right = new RationalSet();
            return right.add(r);
        }

        return false;
    }

    // Returns a string representation of this set. Elements are in ascending order
    // according to their value. Example: "[-2/3, -1/3, 1/2, 3/4]"
    public String toString() {
        // TODO: implement this method
        String retString = "[";

        if (left != null) retString += left.toString().substring(1, left.toString().length() - 1) + ", ";
        if (value != null) retString += value.toString();
        if (right != null) retString += ", " + right.toString().substring(1, right.toString().length() - 1);

        return retString + "]";
    }

}

