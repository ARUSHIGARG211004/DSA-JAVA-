import java.util.*;
public class Binarytree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    public static boolean univalued(Node root){
        if(root==null){
            return true;
        }
        boolean left= univalued(root.left);
        boolean right= univalued(root.right);
        
        if(root.left!=null && root.left.data!=root.data){
            return false;
        }
        if(root.right!=null && root.right.data!=root.data){
            return false;
        }
        return left&&right;
    }
    
    public static void main(String[]args){
        Node root= new Node(2);
        root.left= new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(2);
        root.left.right=new Node(2);
        root.right.left=new Node(3);
        root.right.right=new Node(2);
        
        boolean isvalued=univalued(root);
        System.out.print(isvalued);
    }
}
