package Hashtable;

import Hashtable.HashTable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();

        System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("nails") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("lumber") );
    }
}