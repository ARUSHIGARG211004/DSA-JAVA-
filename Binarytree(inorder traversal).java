/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
    
     
     public static void inorder(Node root){
         if(root==null){
            
             return;
         }
         inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
     }
    }
	public static void main(String[] args) {
	int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	binarytree tree= new binarytree();
	Node root=tree.buildtree(node);
	//System.out.println(root.data);
    tree.inorder(root);
	
	}
}
