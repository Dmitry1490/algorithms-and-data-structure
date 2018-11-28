public class TwoSideLinkedListImpl extends LinkedListImpl implements TwoSideLinkedList{

    private Node lastElement;

    @Override
    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            firstElement = node;
        } else  {
            lastElement.setIndexNode(node);
        }

        lastElement = node;
        size++;
    }

    @Override
    public int getLast() {
        return lastElement != null ? lastElement.getValue() : -1;
    }

    @Override
    public void add(int value) {
        boolean empty = isEmpty();
        super.add(value);
        if (empty) {
            lastElement = firstElement;
        }

    }

    @Override
    public int remove() {
        if(firstElement != null && firstElement.getIndexNode() == null){
            lastElement = null;
        }
        int temp = firstElement.getValue();
        firstElement = firstElement.getIndexNode();
        return temp;
    }

    @Override
    public boolean remove(int value) {
        Node currentNode = firstElement;
        Node previusNode = null;
        while (currentNode != null){
            if(value == currentNode.getValue()){
                break;
            }
            previusNode = currentNode;
            currentNode = currentNode.getIndexNode();

        }
        if(currentNode == null){
            return false;
        }

        if (lastElement == currentNode){
            lastElement = previusNode;
        }

        previusNode.setIndexNode(currentNode.getIndexNode());
        size--;
        return true;
    }

}
