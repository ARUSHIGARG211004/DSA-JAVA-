/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Binarytree
{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binarytree{
        static int idx=-1;
        public static Node buildtree(int node[]){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node newNode=new Node(node[idx]);
        newNode.left=buildtree(node);
        newNode.right=buildtree(node);
        return newNode;
        }
    
     
     //level order traversal
     public static void levelorder(Node root){
         if(root==null){
             return;
         }
         Queue<Node>q=new LinkedList<>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
             Node currentNode=q.remove();
             if(currentNode==null){
                 System.out.println();
                 if(q.isEmpty()){
                     break;
                 }
                 else{
                     q.add(null);
                 }
             }
                 else{
                     System.out.print(currentNode.data);
                     if(currentNode.left!=null){
                         q.add(currentNode.left);
                        
                     }
                     if(currentNode.right!=null){
                         q.add(currentNode.right);
                     }
                 }
             }
         }
     }
    
	public static void main(String[] args) {
	int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	binarytree tree= new binarytree();
	Node root=tree.buildtree(node);
	//System.out.println(root.data);
    tree.levelorder(root);
	
	}
}
	

