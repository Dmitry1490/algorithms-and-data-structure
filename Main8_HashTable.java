public class Main8_HashTable {

    public static void main(String[] args) {
        //testHashTable();

        testНashTableWithChainingMethod();
    }

    private static void testНashTableWithChainingMethod() {
        НashTableWithChainingMethod hashTable = new НashTableWithChainingMethod(10);

        hashTable.add(new Person("Dmitry", 11));
        hashTable.add(new Person("Dmitry", 21));
        hashTable.add(new Person("Dmitry", 31));
        hashTable.add(new Person("Dmitry", 15));
        hashTable.add(new Person("Dmitry", 2));
        hashTable.add(new Person("Dmitry", 57));
        hashTable.add(new Person("Dmitry", 22));
        hashTable.add(new Person("Dmitry", 45));
        hashTable.add(new Person("Dmitry", 88));

        hashTable.display();

        System.out.println("Search-----------");
        System.out.println(hashTable.find(57));
        System.out.println(hashTable.find(188));

        System.out.println("Remove-----------");
        System.out.println(hashTable.delete(188));
        System.out.println(hashTable.delete(57));
        System.out.println(hashTable.delete(21));

        hashTable.display();

    }

    private static void testHashTable() {
        HashTable hashTable = new HashTable(10);

        hashTable.add(new Person("Dmitry", 28));
        hashTable.add(new Person("Dmitry", 21));
        hashTable.add(new Person("Dmitry", 15));
        hashTable.add(new Person("Dmitry", 2));
        hashTable.add(new Person("Dmitry", 57));
        hashTable.add(new Person("Dmitry", 88));
        hashTable.add(new Person("Dmitry", 22));
        hashTable.add(new Person("Dmitry", 45));

        hashTable.display();

        System.out.println("Search-----------");
        System.out.println(hashTable.find(15));
        System.out.println(hashTable.find(188));
        System.out.println("Remove-----------");
        System.out.println(hashTable.delete(188));
        System.out.println(hashTable.delete(21));
        hashTable.display();

        System.out.println("Size is " + hashTable.getSize());
    }
}
