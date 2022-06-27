import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		Scanner input = new Scanner(System.in);
//		list.addAtBeginning(10);
//		list.addAtBeginning(20);
//		list.addAtBeginning(40);
//		list.addAtEnd(60);
//		list.addAtBeginning(50);
//		list.addAtEnd(30);
//		list.addAtBeginning(25);
		int choice, number;
		do {
			System.out.println("1 - add at the beginning");
			System.out.println("2 - add at the end");
			System.out.println("3 - Show the list");
			System.out.println("4 - take from beginning");
			System.out.println("5 - take from the end");
			System.out.println("6 - search for a number");
			System.out.println("7 - get the size of the list");
			System.out.println("8 - verify if the list is empty");
			System.out.println("0 - exit");
			System.out.println("pick an option");
			choice = input.nextInt();
			if(choice < 0 || choice > 8) {
				System.out.println("invalid option");
			}else {
				switch(choice){
					case 1:
						System.out.println("What number go at the beginning?");
						number = input.nextInt();
						list.addAtBeginning(number);
						break;
					case 2:
						System.out.println("What number go at the end?");
						number = input.nextInt();
						list.addAtEnd(number);
						break;
					case 3:
						if(list.Empty()) {
							System.out.println("The list is empty");
						}else {
							list.Show();
						}
						break;
					case 4:
						if(list.Empty()) {
							System.out.println("The list is empty");
						}else {
							list.takeFromBeginning();
						}
						break;
					case 5:
						if(list.Empty()) {
							System.out.println("The list is empty");
						}else {
							list.takeFromEnd();
						}
						break;
					case 6:
						System.out.println("What number are you searching for?");
						number = input.nextInt();
						list.search(number);
						break;
					case 7:
						System.out.println(list.getSize());
						break;
					case 8:
						System.out.println(list.Empty());
						break;
				}
			}
			
		}while(choice != 0);
	}
}
