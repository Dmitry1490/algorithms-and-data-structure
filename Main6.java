public class Main6 {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 0; i < 1000000; i++){

            Tree tree = new TreeImpl();
            while (tree.isFull()){
                tree.add(new Person("Dmitry"));

            }
//            tree.displayTree();
//            System.out.println();
//            System.out.println();
            if (tree.balance()){count++;}

        }

        System.out.println(count); // Что то неправльно, из 1000000 деревьев 115 сбалансированных;
    }
}
