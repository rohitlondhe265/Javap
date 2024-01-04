package dataStructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(10);
        al.set(0, 15);
        Collections.sort(al);
        System.out.println(al);

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(10);
        stack.pop();
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(10);
        queue.poll();
        System.out.println(queue);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(12);
        deque.push(10);
        deque.offer(8);
        deque.offer(6);
        System.out.println(deque);
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Ascending
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(10);
        pq.offer(18);
        System.out.println(pq.poll());
        // Descending
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new CustomComparator());
        pq2.offer(12);
        pq2.offer(10);
        pq2.offer(18);
        System.out.println(pq2.poll());
    }
}
