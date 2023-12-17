/* Дан LinkedList c несколькими элементами разного типа. В методе revert класса LLTasks  
реализуйте разворот этого списка без использования встроенного функционала */

package homework;

import java.util.LinkedList;


public class hw4reverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("один");
        ll.add(2);
        ll.add("два");
        System.out.println(ll);
        System.out.println(LLTasks.revert(ll));
    }
    public class LLTasks {
        public static LinkedList<Object> revert(LinkedList<Object> ll) {
            LinkedList<Object> result = new LinkedList<>();
            for (int i = ll.size() - 1; i > -1; i--) {
                result.add(ll.get(i));
            }
            return result;
        }
    }
}
    