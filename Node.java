public class Node {

    private final int value;
    private Node indexNode;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getIndexNode() {
        return indexNode;
    }

    public void setIndexNode(Node indexNode) {
        this.indexNode = indexNode;
    }
}
