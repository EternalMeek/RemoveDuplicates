import java.util.Scanner;

public class RDDriver {

	public static void main(String[] args) {
		boolean stillInput=true;
		RemoveDuplicates list=new RemoveDuplicates();

		while(stillInput) {

			System.out.println();
			System.out.println("A - Add number to the list.");
			System.out.println("R - Remove number from the list.");
			System.out.println("RD - Remove all duplicates");
			System.out.println("P - Print the list.");
			System.out.println("S - Terminate.");
			System.out.println();

			System.out.print("Choose what you want to do: ");
			String s="";
			Scanner in=new Scanner(System.in);
			s=in.next();

			if(s.equalsIgnoreCase("A")) {
				System.out.print("How many you want add: ");
				Scanner number=new Scanner(System.in);
				int a=number.nextInt();
				System.out.println("Enter numbers: ");
				for(int i=0; i<a; i++) {
					Scanner input=new Scanner(System.in);
					list.add(input.nextInt());
				}
			}

			if(s.equalsIgnoreCase("R")) {
				System.out.print("Which number you want to remove: ");
				Scanner n=new Scanner(System.in);
				list.remove(n.nextInt());
			}

			if(s.equalsIgnoreCase("RD")) {
				list.remove_duplicates();
			}

			if(s.equalsIgnoreCase("P")) {
				System.out.println(list.toString());
			}

			if(s.equalsIgnoreCase("S")) {
				stillInput=false;
			}
		}
	}
}
