package practice.demo;

public class Library {
	String username;
	String book;
	String card;
	String reminder;
	public String arr[];
	
	Library(String u, String b, String c, String r) {      //Constructor
		username = u;
		book = b;
		card = c;
		reminder = r;				
	}

	void userDetails() {
	}
	
	String userDetails1(String u, String b, String c, String r) {
		return u + b + c + r;
	}
	
	void userDetails2(String u, String b, String c, String r) {
		this.username = u;
		this.book = b;
		this.card = c;
		this.reminder = r;
		
	}
	static void printLine() {
		System.out.println("********************************************************************************");
	}

	public static void main(String[] args) {
		
		printLine();
		
		Library libraryMgmt1 = new Library("User1", "Book1", "Card1", "Reminder1"); // object 1
		
		libraryMgmt1.userDetails();
		
		System.out.println("User: " + "\t" + " : " +  libraryMgmt1.username);
		System.out.println("Book: " + "\t" + " : " +  libraryMgmt1.book);
		System.out.println("Card: " + "\t" + " : " +  libraryMgmt1.card);
		System.out.println("Reminder " + ": " + libraryMgmt1.reminder);
		
		printLine();
		
		Library libraryMgmt2 = new Library("User2", "Book2", "Card2", "Reminder2"); // object 2
		
		libraryMgmt2.userDetails(); // calling method1
		
		System.out.println("User: " + "\t" + " : " +  libraryMgmt2.username);
		System.out.println("Book: " + "\t" + " : " +  libraryMgmt2.book);
		System.out.println("Card: " + "\t" + " : " +  libraryMgmt2.card);
		System.out.println("Reminder " + ": " + libraryMgmt2.reminder);
		
		printLine();
		
		String details = libraryMgmt2.userDetails1("User3", "Book3", "Card3", "Reminder3"); // calling method2
		
		System.out.println(details);
		
		printLine();
		
		libraryMgmt2.userDetails2("User4", "Book4", "Card4", "Reminder4"); // calling method3
		
		System.out.println("User " + "\t" + " : " + libraryMgmt2.username);
		System.out.println("Book " + "\t" + " : " + libraryMgmt2.book);
		System.out.println("Card " + "\t" + " : " + libraryMgmt2.card);
		System.out.println("Reminder " + ": " + libraryMgmt2.reminder);
		
		printLine();
		
		System.out.println("User" + "\t" + "Book" + "\t" + "Card" + "\t" + "Reminder" + "\t");
		
		printLine();
		
		System.out.println(libraryMgmt1.username + "\t" + libraryMgmt1.book + "\t" + libraryMgmt1.card + "\t" +
				libraryMgmt1.reminder + "\t");
		System.out.println(libraryMgmt2.username + "\t" + libraryMgmt2.book + "\t" + libraryMgmt2.card + "\t" +
				libraryMgmt2.reminder + "\t");
		
		printLine();
	}

}
