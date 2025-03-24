class Leetcode705 {
    private boolean[] set;

    public Leetcode705() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        Leetcode705 myHashSet = new Leetcode705();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1)); // returns true
        System.out.println(myHashSet.contains(3)); // returns false
        myHashSet.add(2);
        System.out.println(myHashSet.contains(2)); // returns true
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2)); // returns false
    }
}