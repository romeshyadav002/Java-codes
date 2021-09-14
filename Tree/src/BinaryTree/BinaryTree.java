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
	private Node root= null;
	private int size=0;
	
	BinaryTree(){
		Scanner s= new Scanner(System.in);
		this.root=takeInput(s,null,false);
	}
	private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
		if(parent==null) {
			System.out.println("Enter the data for root node");
		}
		else {
			if(isLeftorRight) {
				System.out.println("Enter the data for left child of "+ parent.data);
			}
			else {
				System.out.println("Enter the data for right child of "+ parent.data);
			}
		}
		int nodedata= s.nextInt();
		Node node= new Node(nodedata,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("Do you have left child of "+ node.data);
		choice=s.nextBoolean();
		
		if(choice) {
			node.left=takeInput(s,node,true);
		}
		choice=false;
		System.out.println("Do you have right child of "+ node.data);
		choice=s.nextBoolean();
		
		if(choice) {
			node.right=takeInput(s,node,false);
		}
		return node;
	}
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		String str="";
		if(node.left!=null) {
			str=str+node.left.data+"=>";
		}else {
			str=str+"END=>";
		}
		//str=str.node.data;
		if(node.right!=null) {
			str=str+node.right.data+"<=";
		}else {
			str=str+"<=END";
		}
		System.out.println(str);
		if(node.left!=null) {
			this.display(node.left);
		}
		if(node.right!=null) {
			this.display(node.right);
		}
	}
	public int height() {
		return this.height(this.root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		int lheight=this.height(node.left);
		int rheight= this.height(node.right);
		
		int height=Math.max(lheight, rheight)+1;
		return height;
	}
	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("End");
	}
	private void preOrder(Node node) {
		if(node==null) {
			return;		
		}
		System.out.println(node.data+", ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("End");
	}
	private void inOrder(Node node) {
		if(node==null) {
			return;		
		}
		inOrder(node.left);
		System.out.println(node.data+", ");
		inOrder(node.right);
	}
	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("End");
	}
	private void postOrder(Node node) {
		if(node==null) {
			return;		
		}
		inOrder(node.left);
		inOrder(node.right);
		System.out.println(node.data+", ");
	}
}
