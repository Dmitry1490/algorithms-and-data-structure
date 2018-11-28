import java.util.Iterator;

public class LinkedListImpl implements LinkedList{

    protected Node firstElement;
    protected int size;

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        newNode.setIndexNode(firstElement);
        firstElement = newNode;
        size++;
    }

    @Override
    public int remove() {
        if(isEmpty()){
            return -1;
        }

        int removeValue = firstElement.getValue();
        firstElement = firstElement.getIndexNode();

        size++;
        return removeValue;

    }

    @Override
    public boolean remove(int value){
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

        previusNode.setIndexNode(currentNode.getIndexNode());
        size--;
        return true;

    }

    @Override
    public boolean find(int value) {
        Node currentNode = firstElement;

        while (currentNode != null){
            if(value == currentNode.getValue()){
                return true;
            }

            currentNode = currentNode.getIndexNode();

        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 || firstElement == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList() {
        Node currentNode = firstElement;

        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getIndexNode();
        }
    }

    @Override
    public int getFirstElement() {
        return firstElement != null ? firstElement.getValue() : null;}

    public Node getFirstNode() {
        return firstElement;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(this);
    }
    }




