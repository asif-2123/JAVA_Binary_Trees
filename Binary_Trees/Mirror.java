import java.util.*;
public class Mirror {
    static class Node{
        int data; Node left,right;
        Node(int data){
            this.data=data; this.left=null; this.right=null;
        }
    }
    static class BinaryTree{
        Node root;
        Node mirror(Node root){
            if(root==null)
                return null;
            Node left=mirror(root.left);
            Node right=mirror(root.right);
            root.left=right;
            root.right=left;
            return root;
        }
        void inorder(Node root){
            if(root==null)
                return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        
    }
    public static void main(String args[]){
            BinaryTree tree=new BinaryTree();
            tree.root=new Node(1);
            tree.root.left=new Node(2);
            tree.root.right=new Node(3);
            tree.root.left.left=new Node(4);
            tree.root.left.right=new Node(5);
            tree.root.right.left=new Node(6);
            tree.root.right.right=new Node(7);
            tree.inorder(tree.root);
            tree.mirror(tree.root);
            System.out.println();
            tree.inorder(tree.root);
        }
}
