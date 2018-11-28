public class Lsn4_Main {
    public static void main(String[] args){

        LinkedList list2 = new LinkedListImpl();
        TwoSideLinkedList list = new TwoSideLinkedListImpl();
        list.add(10);
        list.add(2);

        list.add(4);
        list.addLast(7);

        list.printList();
        System.out.println("-------------");
        System.out.println("Find 2: " + list.find(7));
        System.out.println(list.remove(7));
        System.out.println("Find 2: " + list.find(7));

        System.out.println("-------------");

        while ( !list.isEmpty() ) {
            System.out.println(list.remove());
        }

        System.out.println("-------------");

        private static void displayAll(LinkedList list2){
            for (Integer value : list) {
                System.out.println(value);
            }
        }
            
        }

    }

