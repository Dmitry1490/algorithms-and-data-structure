import java.util.Arrays;

public class MassiveSort {

    public static void main (String[] args) throws CloneNotSupportedException {

        Array arr = new ArrayImplementation(10000);

        arr.addRandom();

        System.out.println(arr.toString());

//      Пузырьковая сортировка:

        Array arr1 = arr.copy();
        Array arr2 = arr.copy();

        long startTime = System.nanoTime();
        arr.bublSort();
        float deltaTime = System.nanoTime() - startTime;
        System.out.printf("Time BublSort: %f ms\n ", deltaTime * 0.000001f);
        System.out.println(arr.toString());


//      Сортировка выбором:

        startTime = System.nanoTime();
        arr1.sortSelect();
        deltaTime = System.nanoTime() - startTime;
        System.out.printf("Time sortSelect: %f ms\n ", deltaTime * 0.000001f);
        System.out.println(arr1.toString());

//      Сортировка вставками:

        startTime = System.nanoTime();
        arr2.sortInsert();
        deltaTime = System.nanoTime() - startTime;
        System.out.printf("Time sortInsert: %f ms\n ", deltaTime * 0.000001f);
        System.out.println(arr2.toString());
    }
}
