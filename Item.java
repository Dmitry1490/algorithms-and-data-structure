import java.util.Arrays;
import java.util.Comparator;

public class Item {

    private String name;
    private int weight;
    private int cost;

    public Item(String name, int weight, int cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public static final Comparator<Item> COMPARE_BY_COST = new Comparator<Item>() {
        @Override
        public int compare(Item lhs, Item rhs) {
            return lhs.getCost() - rhs.getCost();
        }
    };
}
