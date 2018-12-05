import java.util.Objects;

public class Person {

    private int id;
    private final String name;
    final int maxSize = 20; // Максимальное число для диапазона от 0 до max


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(String name) {
        for (int i = 0; i < 5; i++){
            this.id = (int) rnd(maxSize);

        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private static double rnd(final int max)
    {
        return Math.random() * max;
    }

}
