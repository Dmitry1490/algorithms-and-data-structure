import java.util.Arrays;

public class ArrayImplementation implements Array, Cloneable{

    private int[] data;
    private int currentSize;

    public ArrayImplementation(int maxSize){
        this.data = new int[maxSize];
    }

    public ArrayImplementation(){

    }

    public ArrayImplementation(int[] data, int currentSize){
        this.data = Arrays.copyOf(data, currentSize);
        this.currentSize = currentSize;
    }

    @Override
    public void add(int value) {
        data[currentSize++] = value;
    }


    @Override
    public void addRandom() {
        for(int i = 0; currentSize < data.length; i++){
            data[i] = (int) (Math.random() * 100000);
            currentSize++;
        }
    }

    @Override
    public boolean remove(int value) {
        int index = findIndex(value);

        if (index == -1){
            return false;
        }

        for(int i = index; i < currentSize - 1; i++){
            data[i] = data[i + 1];
        }

        data[--currentSize] = value;

        return true;
    }


    @Override
    public boolean search(int value) {
        if (findIndex(value) == -1){
            return false;
        }
        return true;
    }

    private int findIndex(int value) {
        for (int i = 0; i < currentSize; i++ ){
            if (data[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < currentSize; i++){
            sb.append(data[i] + " ");
        }
        return sb.toString();
    }

    public Array copy(){
         return new ArrayImplementation(data, currentSize);
    }


    @Override
    public void bublSort() {
        for(int i = 0; i < currentSize -1 ; i++){
            for(int j = 0; j < currentSize - 1 - i ; j++){
                if (data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sortSelect() {
        for ( int i = 0; i < currentSize; i++){
            int minIndx = i;
            for( int j = i + 1; j < currentSize; j++ ){
                if (data[j] < data[minIndx]) {
                    minIndx = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndx];
            data[minIndx] = temp;
        }
    }

    @Override
    public void sortInsert() {
        int in, out;
        for (out = 1; out < currentSize; out++) {
            int temp = data[out];
            in = out;
            while (in > 0 && data[in - 1] >= temp) {
                data[in] = data[in - 1];
                in--;
            }

            data[in] = temp;
        }

    }

}
