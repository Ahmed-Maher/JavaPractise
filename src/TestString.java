import java.util.*;

class TestString {

    public static void main(String[] args) {
        String[] arr = {"abcdde", "baccd", "eeabg"};
        final int NUM_ELEMENTS = 26;
        BitSet bitset = new BitSet(NUM_ELEMENTS);
        bitset.set(0, NUM_ELEMENTS);

        /* Create a BitSet for each rock. "AND" it with our original BitSet */
        for (String rock : arr) {
            BitSet currBitSet = new BitSet(NUM_ELEMENTS);
            for (int i = 0; i < rock.length(); i++) {
                currBitSet.set(rock.charAt(i) - 'a');
            }
            bitset.and(currBitSet);
        }
        System.out.println(bitset.cardinality());
    }
}