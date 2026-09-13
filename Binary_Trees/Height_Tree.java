import java.util.*;
public class Height_Tree {
    static class Node{
        int data; Node left,right;
        Node(int data){
            this.data=data; this.left=null; this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)
                return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static int height(Node root){
            if(root==null)
                return 0;
            int hl=height(root.left);
            int hr=height(root.right);
            return Math.max(hl, hr)+1;
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
        System.out.print(tree.height(root));
    }
}
