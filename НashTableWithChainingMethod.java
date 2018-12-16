import java.util.ArrayList;
import java.util.List;

public class НashTableWithChainingMethod {

    private List[] values;
    private int size;

    public НashTableWithChainingMethod(int maxSize) {
        this.values = new List[maxSize];
        this.size = 0;
    }

    public boolean add(Person person) {
        int key = person.hashCode();
        int index = hashFunk(key);

        if(values[index] == null){
            List<Person> list = new ArrayList<>();
            values[index] = list;
            list.add(person);
            return true;

        } else {
            values[index].add(person);
            return true;
        }
    }

    public Person find(int id){
        int key = id;
        int index = hashFunk(key);

        if (values[index] != null){
            for (int i = 0; i < values[index].size() ; i++) {
                Person countPerson = (Person) values[index].get(i);
                if (countPerson.getId() == id){
                    return countPerson;
                }
            }

        }
        return null;
    }

    public Person delete(int id){
        int key = id;
        int index = hashFunk(key);

        if (values[index] != null){
            for (int i = 0; i < values[index].size() ; i++) {
                Person countPerson = (Person) values[index].get(i);
                if (countPerson.getId() == id){
                    values[index].remove(i);
                    return countPerson;
                }
            }

        }
        return null;
    }


        private int hashFunk(int key) {
        return key % values.length;
    }

    public void display(){
        for (int i = 0; i < values.length; i++) {
            System.out.print(i + ": ");
            if (values[i] == null){
                System.out.println();
            } else {
            for (int j = 0; j < values[i].size(); j++) {
                System.out.print(values[i].get(j) + " ; ");
            }
                System.out.println();
            }
        }
    }


}
