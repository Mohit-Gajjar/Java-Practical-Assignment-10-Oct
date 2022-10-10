import java.util.*;

class Queue 
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];

    Queue(int n) {
        int capacity = n;
        System.out.println("Enter Any 8 Number (first-in first-out fashion): ");
        for (int i = 0; i < capacity; i++) {
            elements[i] = sc.nextInt();
        }
    }
int size;
    void data() {
        size = elements.length;
    }

    int enqueue(int v) {
        int t = v;
        t = elements[0];
        return t;
    }

    void dequeue() {
        for (int i = 0; i < 7; i++) {
            elements[i] = elements[i + 1];
        }
    }

    boolean empty() {
        
        return true;
    }

    int getSize() {
        return size ;
    }
}

class Stack 
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];

    Stack(int n) {
        int capacity = n;
        System.out.println("Enter Any 8 Number (last-in first-out fashion): ");
        for (int i = 0; i < capacity; i++) {
            elements[i] = sc.nextInt();
        }
    }
    int size;
    void data() {
        size = elements.length;
    }

    int enqueue(int v) {
        int t = v;
        
        return t;
    }

    void dequeue() {
        for (int i = 0; i < 7; i++) {
            elements[i] = elements[i + 1];
        }
    }

    boolean empty() {
        
        return true;
    }

    int getSize() {
        return size;
    }
}

class Practical4 {
    public static void main(String[] args) {
        Queue q = new Queue(8);
        Stack s = new Stack(8);
        
        q.enqueue(10);
        q.dequeue();
        System.out.println("The First-in First-Out Fashion :");
        
        for (int i = 0; i < 7; i++) {
            System.out.println(q.elements[i]);
        }

     
        s.dequeue();
        System.out.println("The First-in Last-Out Fashion :");
        for (int i = 0; i < 7; i++) {
            System.out.println(s.elements[i]);
        }
        System.out.println(s.enqueue(500));  
    }
}
