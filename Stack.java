public interface Stack {

    boolean isEmpty();
    boolean isFull();

    int getSize();

    void push(char value);

    int pop();

    int peek();
}
