public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value){            //constructor of Node class
            this.value= value;
        }
    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head= newNode;
        tail= newNode;
        length=1;
    }

    public void printlist()
    {
        Node temp= head;
        while(temp != null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void gethead()
    {
        System.out.println("head: "+ head.value);
    }
    public void gettail()
    {
        System.out.println("Tail: "+ tail.value);
    }
    public void getlength()
    {
        System.out.println("length: "+ length);
    }

    public void append(int value)       //append(adding element in front)
    {
        Node newNode= new Node(value);
        if(length == 0)
        {
            head= newNode;
            tail= newNode;
        }
        else {
            tail.next = newNode;
            tail= newNode;
        }
        length++;
    }

    public Node removelast()        //for removing the last item
    {
        if(length == 0) return null;    //when list is empty
        Node temp = head;               //when list has elements
        Node pre = head;
        while(temp.next != null)
        {
            pre= temp;
            temp.next = temp;
        }
        tail = pre;
        tail.next= null;
        length--;
        if(length == 0)
        {
            head= null;
            tail= null;
        }
        return temp;
    }

    public void prepend(int value)          //inserting value at the end
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            head= newNode;
            tail= newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst()               //removing first value
    {
        if(length == 0) return null;
        Node temp= head;
        head= head.next;
        temp.next= null;
        length--;
        if(length == 0)
        {
            tail= null;
        }
        return temp;
    }

    public Node get(int index) {                        //get the index
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i=0; i< index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index,int value)                 //change value or set value
    {
        Node temp = get(index);
        if( temp!= null)
        {
            temp.value= value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value)  {          //inserting value
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){                          //removing value
        if(index < 0 || index >=length) return null;
        if(index == 0) return removeFirst();
        if(index == length) return removelast();

        Node prev= get(index -1);
        Node temp= prev.next;

        prev.next =temp.next;
        temp.next= null;
        length--;

        return temp;
    }

    public void reverse()                           //reversing
    {
        Node temp= head;
        head= tail;
        tail= temp;
        Node after = temp.next;
        Node before= null;
        for(int i=0; i < length; i++)
        {
            after= temp.next;
            temp.next = before;
            before= temp;
            temp= after;
        }
    }
}
