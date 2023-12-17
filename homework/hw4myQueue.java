// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент в конец очереди
// first() - возвращает первый элемент из очереди не удаляя
// getElements() - возвращает все элементы в очереди

package homework;

import java.util.LinkedList;

public class hw4myQueue {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(3);
        ll.add(8);
        ll.add(9);
        ll.add(1);
        ll.add(2);
        ll.add(0);
        System.out.println(ll);
        MyQueue.enqueue(ll,4);
        System.out.println(ll);
        MyQueue.dequeue(ll);
        System.out.println(ll);
        MyQueue.first(ll);
        System.out.println(ll);
        MyQueue.getElements(ll);
        System.out.println(MyQueue.getElements(ll));
    }
    public class MyQueue{

        public static Object enqueue(LinkedList ll,Integer element){
            return ll.add(element);
        }

        public static Object dequeue(LinkedList ll){
            return ll.add(ll.removeFirst());
        }

        public static Object first(LinkedList ll){
            return ll.add(ll.getFirst());
        }

        public static Object getElements(LinkedList ll){
            LinkedList<Integer> reverse = ll.reversed();
            return reverse;
        }
    }
    
}