public class QueueImpl implements Queue{

    public static final int FRONT_DEF = 0;
    public static final int REAR_DEF = -1;
    private int[] data;
    private int size;

    private int front;
    private int rear;

    public QueueImpl(int maxSize){

        this.data = new int[maxSize];
        this.size = 0;
        front = FRONT_DEF;
        rear = REAR_DEF;
    }

    @Override
    public void insert(int value) {
        if(rear == data.length - 1){
            rear = REAR_DEF;
        }
        data[++rear] = value;
        size++;
    }

    @Override
    public int remove() {
        if(front == data.length - 1 ){ front = FRONT_DEF;}
        size--;
        return (data[front++]);
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
}
