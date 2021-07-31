import deque.*;
import queue.*;
public class homework3 {
    public static void main(String[] args) {
        System.out.println(".............задание № 1............");
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16};
        Integer[] arr2 = {1,2,4,5,6};
        Integer[] arr3 = {};
        Integer[] arr4 = {1,2,3,4,5,6,8};
        Integer[] arr5 = {1,3};

        int find;

        find = searchNumber.search(arr1);
        System.out.println(find);
        find = searchNumber.search(arr2);
        System.out.println(find);
        find = searchNumber.search(arr3);
        System.out.println(find);
        find = searchNumber.search(arr4);
        System.out.println(find);
        find = searchNumber.search(arr5);
        System.out.println(find);

        System.out.println(".............задание № 2............");
        System.out.println(".....testQueue............");
        testQueue();
        System.out.println(".....testDueue............");
        testDueue();

    }

    private static void testQueue() {


        Queue<Integer> queue = new PriorityQueue<>(5);
        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));


        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

        System.out.println("add element: " + queue.insert(17));
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

    }
    private static void testDueue() {


        Deque<Integer> deque = new DequeImpl<>(5);



        System.out.println("add right element: " + deque.insertRight(34));
        System.out.println("add right element: " + deque.insertRight(12));
        System.out.println("add right element: " + deque.insertRight(20));
        System.out.println("add right element: " + deque.insertRight(16));
        System.out.println("add right element: " + deque.insertRight(14));
          System.out.println("add element: " + deque.insertLeft(17));

        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();

        System.out.println("add left element: " + deque.insertLeft(17));
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove left: " + deque.removeLeft());
        deque.display();
        System.out.println("remove right: " + deque.removeRight());
        deque.display();
        System.out.println("add left element: " + deque.insertLeft(77));
        deque.display();

        System.out.println("remove left: " + deque.removeLeft());
        deque.display();





    }

}
