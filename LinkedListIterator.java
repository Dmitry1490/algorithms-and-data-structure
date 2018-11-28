public class LinkedListIterator implements ListIterator {

    private LinkedListImpl list;
    private boolean firstIterate = true;

    private Node current;
    private Node previous;

    public LinkedListIterator(LinkedListImpl list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (firstIterate) {
            firstIterate = false;
            return list.getFirstNode() != null;
        }
        else {
            return current.getIndexNode() != null;
        }
    }

    @Override
    public Integer next() {
        if (current == null) {
            current = list.getFirstNode();
        }
        else {
            previous = current;
            current = current.getIndexNode();
        }
        return current.getValue();
    }
}
