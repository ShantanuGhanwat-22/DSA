public class TestTree {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		
		//int [] arr= {45,12,34,10,51,8,52,59,50};
		
		
		bst.insert(45);
		bst.insert(12);
		bst.insert(34);
		bst.insert(10);
		bst.insert(51);
		bst.insert(8);
		bst.insert(52);
		bst.insert(59);
		bst.insert(50);
		
		System.out.println(bst.toString());
	}
}
