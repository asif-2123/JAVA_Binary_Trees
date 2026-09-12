//TC --> O(n^2)
import java.util.*;
public class Diameter1 {
    static class Node{
        int data; Node left,right;
        Node(int data){
            this.data=data; this.left=null; this.right=null;
        }
    }
    static class BinaryTree{
        public static int height(Node root){
            if(root==null)
                return 0;
            int hl=height(root.left);
            int hr=height(root.right);
            return Math.max(hl,hr)+1;
        }
        public static int diameter(Node root){
            if(root==null)
                return 0;
            int ld=diameter(root.left);
            int lh=height(root.left);
            int rd=diameter(root.right);
            int rh=height(root.right);
            int selfdiam=lh+rh+1;
            return Math.max(selfdiam,Math.max(ld,rd));
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        BinaryTree tree=new BinaryTree();
        System.out.println(tree.height(root));
        System.out.println(tree.diameter(root));
    }
}
