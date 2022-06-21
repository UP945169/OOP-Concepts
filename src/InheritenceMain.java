public class InheritenceMain {
    public static void main(String[] args) {
        Inheritence<Integer> modArrayList = new Inheritence<Integer>();
        modArrayList.add(2);
        modArrayList.add(4);
        modArrayList.add(6);
        modArrayList.add(8);
        modArrayList.add(10);

        modArrayList.getUsingMod(5);

    }
}
