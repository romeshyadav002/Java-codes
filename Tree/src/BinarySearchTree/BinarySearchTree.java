package BinarySearchTree;

public class BinarySearchTree {
	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinarySearchTree(int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		// mid
		int mid = (lo + hi) / 2;
		// create an new node
		Node nn = new Node();
		nn.data = arr[mid];

		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		// self work
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		str += "=>" + node.data + "<=";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		System.out.println(str);

		// left
		display(node.left);
		// right
		display(node.right);
	}

	// Find In
	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(Node node, int item) {
		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			node = nn;
		} else if (item > node.data) {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}
		} else {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;
			} else {
				add(node.left, item);
			}
		}
	}

	public boolean isBST() {
		return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data > max || node.data < min) {
			return false;
		} else if (!this.isBST(node.left, min, node.data)) {
			return false;
		} else if (!this.isBST(node.right, node.data, max)) {
			return false;
		}
		return true;
	}

	public int sumLeaf() {
		return this.sumLeaf(this.root);
	}

	private int sumLeaf(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return node.data;
		}
		int lsum = sumLeaf(node.left);
		int rsum = sumLeaf(node.right);
		return lsum + rsum;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		int height = Math.max(lheight, rheight) + 1;
		return height;
	}

	public int diameter() {
		return this.diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		// when dia passes through the root
		int case1 = this.height(node.left) + this.height(node.right) + 2;
		int case2 = this.diameter(node.left);
		int case3 = this.diameter(node.right);
		int myans = Math.max(case1, Math.max(case2, case3));
		return myans;

	}

	public class DiaPair {
		int height;
		int diameter;

		

		DiaPair(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}
	public int diameterBtr() {
		return this.diameterBtr(this.root).diameter;
	}
	private DiaPair diameterBtr(Node node) {
		if(node==null) {
			DiaPair bp= new DiaPair(-1,0);
			return bp;
		}
		DiaPair lp= this.diameterBtr(node.left);
		DiaPair rp = this.diameterBtr(node.right);
		
		DiaPair mp= new DiaPair();
		mp.height= Math.max(lp.height, rp.height) +1;
		mp.diameter=Math.max(lp.height + rp.height +2, Math.max(lp.diameter, rp.diameter));
		return mp;
	}
}
