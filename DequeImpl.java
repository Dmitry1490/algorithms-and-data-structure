import java.util.Arrays;

public class DequeImpl implements Deque{

    private static final int DEFAULT_FRONT = 0;
    private static final int DEFAULT_REAR = -1;

    private int[] data;
    private int size;
    private int sizeForRight;

    private int front;
    private int rear;

    private int countLeft;
    private int countRight;
    private int startPointIntLeft;

    public DequeImpl(int maxSize){

        this.data = new int[maxSize];
        this.size = 0;
        front = DEFAULT_FRONT;
        rear = DEFAULT_REAR;
        countLeft = 0;
        countRight = 0;
        startPointIntLeft = data.length - 1;
        sizeForRight = data.length -1;
    }

    @Override
    public boolean isEmpty(){
        return countLeft + countRight == 0;
    }

    @Override
    public boolean isFull(){
        return (countLeft + countRight) == data.length;
    }

    @Override
    public void insertLeft(int value) {
        data[++rear] = value;
        countLeft++;
        size ++;
    }

    @Override
    public void insertRight(int value) {
        data[startPointIntLeft--] = value;
        countRight++;
        size++;
    }

    @Override
    public int delRight() {
        int temp = data[sizeForRight--];
        countRight--;
        size--;
        return temp;
    }

    @Override
    public int delLeft() {
        int temp = data[front++];
        countLeft--;
        size--;
        return temp;
    }

    @Override
    public void printDeque() {
        for (int i = front; i <= (countLeft + countRight); i++) {
            System.out.print(data[i] + " ");
        }
    }

    @Override
    public int getSize(){
        return size;
    }
}
