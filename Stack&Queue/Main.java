public class Main
{
    public static void main(String[] args) {

        System.out.println("Output for Stack");
        Stack Mystack = new Stack(4);
        Mystack.push(3);
        Mystack.push(2);
        Mystack.pop();
        Mystack.printstack();

        System.out.println(" ");
        System.out.println("Output for Queue: ");
        Queue MyQueue = new Queue(1);
        MyQueue.enqueue(2);
        MyQueue.enqueue(3);
        MyQueue.dequeue();
        MyQueue.printQueue();


    }
}