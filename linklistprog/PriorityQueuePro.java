package linklistprog;

import java.util.PriorityQueue;

public class PriorityQueuePro {
public static void main(String Ar[])    {
    PriorityQueue<String> pq = new PriorityQueue<String>();
    pq.add("a");
    pq.add("b");
    pq.add("c");
    System.out.println(pq);
    System.out.println(pq.peek());
    System.out.println(pq.poll());
    System.out.println(pq);
}
}
