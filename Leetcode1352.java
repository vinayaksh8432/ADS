import java.util.*;

class Leetcode1352 {
    private List<Integer> list;
    private int lastZero;

    public Leetcode1352() {
        list = new ArrayList<>();
        lastZero = -1;
    }

    public void add(int num) {
        if (num == 0) {
            list.clear();
            lastZero = 0;
        } else {
            if (list.isEmpty()) {
                list.add(num);
            } else {
                list.add(list.get(list.size() - 1) * num);
            }
        }
    }

    public int getProduct(int k) {
        if (k > list.size())
            return 0;
        if (k == list.size())
            return list.get(list.size() - 1);
        return list.get(list.size() - 1) / list.get(list.size() - k - 1);
    }

    public static void main(String[] args) {
        Leetcode1352 productOfNumbers = new Leetcode1352();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        System.out.println(productOfNumbers.getProduct(2));
    }
}