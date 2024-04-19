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
    public static Node deleteleaf(Node root,int x){
        if(root==null){
            return null;
        }
        root.left= deleteleaf(root.left,x);
        root.right= deleteleaf(root.right,x);
        
        if(root.left==null && root.right==null&& root.data==x){
            return null;
        }
        return root;
        
    }
    
    public static void leaf(Node root){
        if(root==null){
            return;
        }
        
        
        if(root.left==null && root.right==null){
            
            System.out.print(root.data+" ");
        }
        leaf(root.left);
        leaf(root.right);
    }
    
    public static void main(String[]args){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int x=5;
        root= deleteleaf(root,x);
        
    }
}
