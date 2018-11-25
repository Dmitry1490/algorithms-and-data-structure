public interface Deque {

    boolean isEmpty();

    boolean isFull();

    void insertLeft(int value);

    void insertRight(int value);

    int delRight();

    int delLeft();

    int getSize();

    void printDeque();
}
