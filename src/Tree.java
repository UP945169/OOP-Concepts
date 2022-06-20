import  java.awt.*;
public class Tree {
    private double heightFt;
    private double trunkDiammeter;
    private TreeType treeType;

    protected Color TRUNK_COLOR = new Color(102, 51, 0);

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiammeter = this.trunkDiammeter + 1;
    }

    public Tree(double heightFt, double trunkDiammeter, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiammeter = trunkDiammeter;
        this.treeType = treeType;
    }

//    public void announceTree(){
//        System.out.println("Look out for that" + TRUNK_COLOR + "tree");
//    }
    public void announceTallTree(){
        if(this.heightFt > 100){
            System.out.println("This tree tall");
        }
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public void setTRUNK_COLOR(Color TRUNK_COLOR) {
        this.TRUNK_COLOR = TRUNK_COLOR;
    }

    public void setTrunkDiammeter(double trunkDiammeter) {
        this.trunkDiammeter = trunkDiammeter;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public double getTrunkDiammeter() {
        return trunkDiammeter;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public Color getTRUNK_COLOR() {
        return TRUNK_COLOR;
    }
}
