package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

	private class Node{
		int data;
		Node left;
		Node right;
		Node(int data, Node left, Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	private Node root=null;
	private int size=0;
	BinaryTree(){
		Scanner s= new Scanner(System.in);
		this.root=takeInput(s,null,false);
	}
	private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
		if(parent==null) {
			System.out.println("enter the data for root node");
		}else {
			if(isLeftorRight) {
				System.out.println("enter the data for left child of "+ parent.data);
			}else {
				System.out.println("enter the data for right child of "+ parent.data);
			}
		}
		int nodedata= s.nextInt();
		Node node= new Node(nodedata,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("do you have left child of "+ node.data);
		choice=s.nextBoolean();
		if(choice) {
			node.left=takeInput(s,node,true);
		}
		choice=false;
		System.out.println("do you have right child of "+ node.data);
		choice=s.nextBoolean();
		if(choice) {
			node.right=takeInput(s,node,false);
		}
		return node;
		
	}
}
