
public class DoubleLinkedList {
	Node first;
	Node last;

	public DoubleLinkedList() {
		first = null;
		last = null;
	}

	public void addAtEnd(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			fresh.prior = last;
			last.next = fresh;
			last = fresh;
		}
	}

	public void addAtBeginning(int num) {
		Node fresh = new Node(num);

		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			first.prior = fresh;
			fresh.next = first;
			first = fresh;
		}
	}

	public void takeFromEnd() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				Node current = first;
				while (current.next != last) {
					current = current.next;
				}
				last.prior = null;
				last = current;
				last.next = null;
			}
		}
	}

	public void takeFromBeginning() {
		if (first != null) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				first = first.next;
				first.prior = null;
			}
		}
	}

	public void Show() {
		Node current = first;
		while (current != null) {
			System.out.print(current.num + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void search(int num) {// Not a very good way of searching but definitely one of them
		Node current = first;
		int position = -1;
		while (current != null) {
			position++;
			if (current.num == num) {
				System.out.println("Number " + num + " found in the position " + position);
				break;
			} else {
				current = current.next;
			}
		}
		if (current == null) {
			System.out.println("Number not found");
		}
	}

	public int getSize() {
		int sum = 0;
		Node current = first;

		while (current != null) {
			current = current.next;
			sum++;
		}
		return sum;
	}

	public boolean Empty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}
}
