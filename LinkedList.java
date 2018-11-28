public interface LinkedList extends Iterable<Integer>{

    void add(int value);

    int remove();

    boolean remove(int value);

    boolean find(int value);

    boolean isEmpty();

    int getSize();

    void printList();

    int getFirstElement();

    Node getFirstNode();

}
