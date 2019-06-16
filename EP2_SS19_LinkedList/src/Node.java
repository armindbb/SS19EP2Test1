public class Node {
    private Node left;
    private Node right;
    private double key;
    private Rational value;

    public Node() {
    }
    public Node(Rational value) {
        this.value = value;
        this.key = value.value();
    }

    public Rational getValue() {
        return value;
    }

    public void add (Rational r) {
        if (this.value == null) {
            this.value = r;
            this.key = value.value();
        } else {
            if (this.key >= r.value()) {
                if(this.left == null) {
                    this.left = new Node(r);
                } else {
                    this.left.add(r);
                }
            } else {
                if(this.right == null) {
                    this.right = new Node(r);
                } else {
                    this.right.add(r);
                }
            }
        }
    }

    public Rational product(double lower, Rational r) {
        if (this.left != null && this.left.key >= lower) {
            r = this.left.product(lower, r);
        }
        if (this.right != null && this.right.key >= lower) {
            r = this.right.product(lower, r);
        }
        if (this.value.value() >= lower && this.value.isValidNumber()) {
            return r.mult(this.value);
        } else {
            return r;
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (this.left != null) {
            s += this.left.toString()+", ";
        }
        s += this.value.toString();
        if (this.right != null) {
            s += ", " + this.right.toString();
        }
        return s;
    }
}
