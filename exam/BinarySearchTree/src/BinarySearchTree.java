import DSAExam
public class BinarySearchTree {
	
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	
	//Q2. a) Insert key into tree node
		public void insert(int key) {
			root=insertE(root,key);	
		}
		
		private Node insertE(Node root,int key) {
			//If the tree is empty
			if(root==null) {
				root=new Node(key);
				return root;
			}
			
			//if the key is smaller than parent node then add it in the left subtree
			if(key<root.data) {
				root.left=insertE(root.left,key);
			}
			
			//if the key is larger than parent node then add it in the right subtree
			else {
				root.right=insertE(root.right,key);
			}
			return root;
		}
		
		//Q2. b) Preorder traversal
		public void preorder() {
			preorderTraversal(root);
		}
				
		private void preorderTraversal(Node root) {
			if(root!=null) {
				System.out.print(root.data+",");
				preorderTraversal(root.left);
				preorderTraversal(root.right);
			}
					
		}
		
		public void display() {
			
		}
				
}

