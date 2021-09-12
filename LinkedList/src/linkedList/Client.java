package linkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list= new LinkedList();
		
		//addLast
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.display();
		
		//addFirst
		list.addFirst(60);
		list.addFirst(70);
		list.display();
		
		System.out.println("****************************");
		//getFirst
		System.out.println(list.getFirst());
		
		System.out.println("****************************");
		System.out.println(list.getLast());
		
		System.out.println("****************************");
		System.out.println(list.getAt(1));
		
		System.out.println("****************************");
		System.out.println(list.removeFirst());
		list.display();
		
		System.out.println("****************************");
		System.out.println(list.removeLast());
		list.display();
		
		System.out.println("****************************");
		System.out.println(list.removeAt(2));
		list.display();
		
		System.out.println("****************************");
		list.reverseData();
		list.display();
		
		System.out.println("****************************");
		list.reversePointers();
		list.display();
	}

}
