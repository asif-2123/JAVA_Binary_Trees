import java.util.*;
public class Max_Sum {
    static class Node{
        int data; Node left,right;
        Node(int data){
            this.data=data; this.left=null; this.right=null;
        }
    }   
    static int maxsum=Integer.MIN_VALUE;
    public static int maxSum(Node root){        
        if(root==null)
            return 0;
        int left=Math.max(0,maxSum(root.left));
        int right=Math.max(0,maxSum(root.right));
        maxsum=Math.max(maxsum,left+right+root.data);
        return Math.max(left,right)+root.data;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        maxSum(root);
        System.out.println(maxsum);
    }
}
