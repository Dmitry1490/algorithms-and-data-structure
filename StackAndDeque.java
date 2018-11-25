import java.util.Arrays;

public class StackAndDeque {

    public static void main(String[] args){

        Stack st = new StackImpl(10);

        st.push('c');
        st.push('o');
        st.push('o');
        st.push('l');
        st.push('y');

    // Создать программу, которая переворачивает вводимые строки (читает справа налево).

        while(! st.isEmpty()){
            System.out.print((char) st.pop());
        }

        System.out.println();


        Queue queue = new QueueImpl(10);

        queue.insert(1);
        queue.insert(3);
        queue.insert(7);

        while(! queue.isEmpty()){
            System.out.print(queue.remove());
        }
        System.out.println();
        System.out.println("Deque");

        Deque dq = new DequeImpl(6);

        // Здесь не понимаю как избавиться от нуля в массиве?
        // Из-за этого нуля не понимаю как выводить массив.

        dq.insertLeft(1); // 100000;
        dq.insertLeft(4); // 140000;
        dq.insertLeft(9); // 149000;
        dq.insertRight(5); // 149005;
        dq.insertRight(3); // 149035;

        dq.printDeque();
        System.out.println();

        System.out.println(dq.delRight());
        dq.printDeque();
        System.out.println();

        System.out.println(dq.delLeft());
        dq.printDeque();
        System.out.println();

    }

}







