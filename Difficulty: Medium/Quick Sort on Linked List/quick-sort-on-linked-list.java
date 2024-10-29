//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class SortLL {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            addToTheLast(head);

            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(str[i]);
                addToTheLast(new Node(a));
            }

            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);

            printList(node);
            System.out.println();
        
System.out.println("~");
}
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node node) {
        // Your code here
         int count=0;
        Node temp=node;
       while(temp!=null){
           temp=temp.next;
           count++;
       }
        int i=0;
        Node arr[]=new Node[count];
        while(node !=null){
            arr[i]=node;
            node=node.next;
            i++;
        }
        // System.out.println(Arrays.toString(arr));
        quicksort(arr,0,count-1);
        Node prev=arr[0];
        for(int j=1;j<count;j++){
            prev.next=arr[j];
            prev=prev.next;
        }
        arr[count-1].next=null;
        return arr[0];
    
    }
    
   static int arrange(Node arr[],int i,int j){
        
        int position=i;
        for(int k=i;k<j;k++){
            if(arr[k].data<arr[j].data){
                Node temp=arr[position];
                arr[position]=arr[k];
                arr[k]=temp;
                position++;
            }
        }
                Node temp=arr[position];
                arr[position]=arr[j];
                arr[j]=temp;
                
                return position;
            }
        
    
    
    static void quicksort(Node arr[],int i,int j){
        
        if(i<j){
            
           int p= arrange(arr,i,j);
            quicksort(arr,i,p-1);
            quicksort(arr,p+1,j);
            
            
        }

    }
}