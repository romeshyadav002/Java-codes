package BinarySearchTree;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70};
		BinarySearchTree bst= new BinarySearchTree(arr);
		bst.display();
		System.out.println(bst.find(100));
		System.out.println(bst.find(10));
		
		bst.add(55);
		bst.display();
		
		System.out.println(bst.isBST());
		System.out.println(bst.sumLeaf());
	}

}
