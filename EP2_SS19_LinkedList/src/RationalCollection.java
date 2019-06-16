// This class represents a sorted collection of elements of type 'Rational'.
// The elements are sorted with respect to their value.
// 'RationalCollection' uses a binary search tree for storing elements.
// For simplicity it is assumed that rounding errors do not matter; don't worry about them.
// Duplicate elements (entries) can occur in the collection.
//
public class RationalCollection {

    // # 55 von 55 Punkten für RationalCollection
    // # -2 Sichtbarkeit

    Node root;

    public RationalCollection() {
        this.root = new Node();
    }
    public RationalCollection(Node root) {
        this.root = root;
    }

    // Adds the specified Rational 'r' to this set.
    // Preconditions: r != null and r is not NaN (need not be checked).
    public void add(Rational r) {
        if (this.root.getValue() == null) {
            this.root = new Node(r);
        } else {
            this.root.add(r);
        }
    }

    // Returns the product of all elements of this collection with values
    // greater than or equal to 'lower'.
    // Returns 1/1 if there are no such elements in the collection.
    public Rational product(double lower) {
        Rational r = new Rational(1,1);
        r = this.root.product(lower, r);
        return r;
    }

    // Returns a string representation of this collection. Elements are in
    // ascending order according to their values. Example: "[-2/3, -1/3, 1/2, 3/4]"
    public String toString() {
        return "[" + root.toString() + "]";
    }

}



