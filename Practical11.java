import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

class Triplet<U, V, T> {
    public final U first;
    public final V second;
    public final T third;

    private Triplet(U first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Object o) {
        /* Checks specified object is "equal to" the current object or not */

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triplet triplet = (Triplet) o;

        if (!first.equals(triplet.first) ||
                !second.equals(triplet.second) ||
                !third.equals(triplet.third)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        /*
         * Computes hash code for an object by using hash codes of
         * the underlying objects
         */

        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c) {
        return new Triplet<>(a, b, c);
    }
}

class Practical11 {
    public static void main(String[] args) throws ExecutionException {
        Triplet<String, Integer, Character> p1 = Triplet.of("Mohit Gajjar", 27, 'M');
        Triplet<String, Integer, Character> p2 = Triplet.of("Jal", 19, 'M');
        Triplet<String, Integer, Character> p3 = Triplet.of("Vraj", 25, 'M');

        List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);

        System.out.println(pairs);

        Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
        System.out.println(distinctTriplets);
    }
}
