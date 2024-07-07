public class Main
{
    public static void main(String[] args)
    {
        DoublyLinkedList DLL= new DoublyLinkedList(3);
        DLL.append(5);
        DLL.append(7);
        //DLL.remove(1);
        //DLL.prepend(4);
        //DLL.insert(0,1);
        //DLL.set(0,3);
        //DLL.removefirst();
        //DLL.removelast();
        //System.out.println(DLL.get(1).value);
        DLL.printlist();
    }
}