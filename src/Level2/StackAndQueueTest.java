package Level2;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueTest {

    public static void main(String[] args) {
        Stack st = new Stack<>(); //LIFO(Last in first out)
        System.out.println("=========STACK =============");
        st.push(56);
        st.push(26);
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println("=========QUEUE ===========");
        Queue q = new LinkedList<>(); //FIFO (First in first out)
        q.offer(1);
        q.offer(2);
        q.offer(3);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
