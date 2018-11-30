import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задача возведению числа в степень с помощью рекурсии.;
        System.out.println(powerOfTwo(4,-3));

        // Задача про рюкзак;
        Backpack backpack = new Backpack(15);

        ArrayList<Item> arrayList = new ArrayList<Item>();

        Item a = new Item("Книга", 2, 4000);
        Item b = new Item("Бинокль", 10, 1500);
        Item c = new Item("Аптечка", 5, 100);
        Item d = new Item("Ноутбук", 1, 150);
        Item e = new Item("Кофейник", 1, 1000);


        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);


        //System.out.println(Arrays.toString(arrayList.toArray()));

        arrayList.sort(Item.COMPARE_BY_COST);

        //System.out.println(Arrays.deepToString(arrayList.toArray()));


        for (Item item : searchPlace(backpack, arrayList)) {
            System.out.println(item.getName());
        }

    }

    public static ArrayList<Item> searchPlace(Backpack backpack, ArrayList<Item> arrayList){
        ArrayList<Item> fullBag = new ArrayList<Item>();
        int size = backpack.getMaxSize();
        int index = arrayList.size() - 1;
        return searchPlaceRec( size, index, arrayList, fullBag );
        }

    public static ArrayList<Item> searchPlaceRec(int size, int index, ArrayList<Item> arrayList,ArrayList<Item> fullBag){
        Item now = arrayList.get(index);
        //System.out.println(now.getName());
        int weight = now.getWeight();
        if (size < weight){
            index = index - 1;
            if(index == -1){
                return fullBag;
            }
            now = arrayList.get(index);

        }
        if (size > 0){
            size = size - now.getWeight();
            fullBag.add(now);
            index = index - 1;
            if(index == -1){
                return fullBag;
            }
            return searchPlaceRec(size, index, arrayList, fullBag);
        } else {
            return fullBag;
        }

    }

    public static double powerOfTwo(int x, int n) {
        if (n == 1) return x;
        if (n > 0){
            return x * powerOfTwo(x, n - 1);
        }
        else if (n < 0){
            return  1 / (x * powerOfTwo(x, -n - 1));
        }
        return -1;
    }

}















