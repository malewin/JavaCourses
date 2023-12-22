package lection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class lection4collections {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(); // односвязный список
        LinkedList<Integer> ll = new LinkedList<>(); // двусвязный список
        Queue<Integer> ql = new LinkedList<Integer>(); //очередь (отщипывается с краю)
        PriorityQueue<Integer> pl = new PriorityQueue<>(); // (очередь где минимальное в приоритете)
        Deque<Integer> deque = new ArrayDeque<>(); // с обоих концов (addFirst/addLast, removeFirst/removeLast, getFirst/getLast  и т д)

        var exp ="1 2 3 * +".split(" "); // 1 +2 *3
        int res = 0;
        System.out.println(exp);

        // Stack<Integer> st = new Stack<>();
        // for (int i = 0; i < exp.length; i++) {
        //     if (isDigit(exp[i])) {
        //         st.push(Integer.parseInt(exp[i]));
        //     } else {
        //         switch (exp[i]) {
        //             case "+":
        //                 res = st.pop() + st.pop();
        //                 st.push(res);
        //                 break;
        //             case "-":
        //                 res = st.pop() - st.pop();
        //                 st.push(res);
        //                 break;
        //             case "/":
        //                 res = st.pop() / st.pop();
        //                 st.push(res);
        //                 break;
        //             case "*":
        //                 res = st.pop() * st.pop();
        //                 st.push(res);
        //                 break;    
        //             default:
        //                 break;
        //         }
        //         System.out.printf("%d\n", st.pop());
        //     }
        // }



    }
    
}
