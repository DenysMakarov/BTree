package LimitQueueAddRemTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddWhenQueueIsEmpty {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        MyQueue myQueue = new MyQueue(stack);
        myQueue.addToQueue(1);
        myQueue.addToQueue(2);
        myQueue.addToQueue(3);
        myQueue.addToQueue(4);
        myQueue.addToQueue(5);
        myQueue.removeFromQueue();
        myQueue.addToQueue(6);
        myQueue.addToQueue(7);
        myQueue.removeFromQueue();

        myQueue.showCollection();
        System.out.println("----------");
        myQueue.showTempCollection();

    }


    static class MyQueue {

        Deque<Integer> stack;
        Deque<Integer> tempStack = new ArrayDeque<>();

        public MyQueue(Deque<Integer> stack) {
            this.stack = stack;
        }

        public void addToQueue(int num){
            if (stack.size() == 3){
                tempStack.add(num);
            }
            else {
                if (tempStack.size() <= 0){
                    stack.add(num);
                }else {
                    stack.add(tempStack.removeFirst());
                }
            }
        }

        public void removeFromQueue(){
            stack.removeFirst();
            if (tempStack.size() > 0){
                stack.add(tempStack.removeFirst());
            }
        }

        public void showCollection(){
            stack.stream().forEach(e -> System.out.println(e));
        }
        public void showTempCollection(){
            tempStack.stream().forEach(e -> System.out.println(e));
        }

    }

}


