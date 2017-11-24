public class DoublyLinkedList{

	Integer item;
	DoublyLinkedList next, previous;

	public DoublyLinkedList(Integer item, DoublyLinkedList previous, DoublyLinkedList next){ //this is more useful than having one that sets next
		this.item = item;
		this.previous = previous;
		this.next = next;
	}

	public DoublyLinkedList(){ //used to create the head
		item = null;
		next = this;
		previous = this;
	}

	/*basic accessor functions*/
	public DoublyLinkedList getNext(){
		return next;
	}

	public DoublyLinkedList getPrevious(){
		return previous;
	}

	public void setNext(DoublyLinkedList n){
		next = n;
	}

	public void setPrevious(DoublyLinkedList p){
		previous = p;
	}

	public Integer getItem(){
		return item;
	}

	public Integer[] to3Array(){ //FOR Tree23Node
		Integer[] returnArray = new Integer[3];
		DoublyLinkedList n = next;
		for (int i = 0; i < 3; i++){
			returnArray[i] = n.getItem();
			n = n.getNext();
		}
		return returnArray;
	}

	public boolean sortedAdd(Integer item){
		/*Iterate forwards through the list until next->next->item > itemToAdd*/
		DoublyLinkedList n = next;
		while(n.getItem() != null && n.getNext().getItem() != null && n.getNext().getItem() < item){ //item == key
			n = n.getNext();
		}
		DoublyLinkedList temp = n.getNext();
		n.setNext(new DoublyLinkedList(item, n, temp)); 	//place it after n and before temp
		temp.setPrevious(n.getNext()); 				//n's next becomes new node's next
		return true; //success!
	}

	public boolean sortedRemove(Integer item){ //item is used as a search key
		DoublyLinkedList n = next;
		while(n.getItem() != null && n.getItem() != item){
			n = n.getNext();
		}
		if (n.getItem() == null) return false;
		DoublyLinkedList temp = n.getPrevious();
		temp.setNext(n.getNext());		//jump the pointers over our node
		n.getNext().setPrevious(temp);	
		return true;					//success! after the function the collector will take care of n
	}

	public void printItem(){
		System.out.print("[" + previous.getItem() + " : ");
		System.out.print(" " + item + " ");
		System.out.print(" : " + next.getItem() + "]");
	}

	public void printList(){
		DoublyLinkedList n = next;
		while(n.getItem() != null){
			n.printItem();
			n = n.getNext();
		}
		System.out.println();
	}

	// public static void main(String[] args){
	// 	DoublyLinkedList head = new DoublyLinkedList(); //empty constructor creates the head - may be broken out later
	// 	for(int i = 0; i < 10; ++i){
	// 		head.sortedAdd(i);
	// 	}
	// 	head.printList();
	// 	for (int i = 3; i < 10; i += 2){
	// 		head.sortedRemove(i);
	// 		head.printList();
	// 	}
	// 	head.printList();
	// }
}