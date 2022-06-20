public class Main {
    public static void main(String[] args) {
        Tree newMapleTree = new Tree(25, 15, TreeType.MAPLE);

        Tree newPineTree = new Tree(200, 50, TreeType.PINE);

        newMapleTree.grow();
        newPineTree.announceTallTree();

    }
}
