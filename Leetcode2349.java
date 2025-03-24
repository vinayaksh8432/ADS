import java.util.*;

class Leetcode2349 {
    private Map<Integer, TreeSet<Integer>> numToIndices;
    private Map<Integer, Integer> indexToNum;

    public Leetcode2349() {
        numToIndices = new HashMap<>();
        indexToNum = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexToNum.containsKey(index)) {
            int oldNum = indexToNum.get(index);
            numToIndices.get(oldNum).remove(index);
            if (numToIndices.get(oldNum).isEmpty()) {
                numToIndices.remove(oldNum);
            }
        }
        indexToNum.put(index, number);
        numToIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return numToIndices.containsKey(number) ? numToIndices.get(number).first() : -1;
    }

    public static void main(String[] args) {
        Leetcode2349 container = new Leetcode2349();
        container.change(1, 10);
        container.change(2, 10);
        container.change(3, 10);
        System.out.println(container.find(10));
    }
}