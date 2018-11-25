public class StackImpl implements Stack{

    private char[] data;
    private int size;

    public StackImpl (int maxSize) {

        this.data = new char[maxSize];
        this.size = 0;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(char value) {
        data[size++] = value;
    }

    @Override
    public int pop() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }
}
