package chap7.java_20181026;

public class BookStore {
	public static void main(String[] args) {
		Book booklist[] = new Book[5];
		//Book ��ü 5�� ���� �迭
		
		//Book ��ü ���� : ������ �����ε�
		//Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		
		//booklist �迭����
		booklist[0] = new Book("Java Program", 25000);
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		//BookMgr ������(Book[] booklist)
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== å ��� ===");
		mgr.printBookList();
		System.out.println("");
		System.out.println("=== å ������ ���� ===");
		mgr.printTotalPrice();
	}
}
