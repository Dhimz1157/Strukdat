package PakaiLib;

import java.util.LinkedList;
import java.util.Queue;
public class MainQueue {

    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remofe: " + queue.remove());
        System.out.println("element: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}