package chap2.java_20181019;

import java.util.Scanner;

public class Purchass_spec  {

	public static void main(String[] args) {
		Product ram = new Product("���", 500, 7);
		Product beer = new Product("����", 1500, 2);		
		Product eggs = new Product("���", 5000, 1);		
		Product beef = new Product("�ҺҰ��", 10000, 1);		
		Product apple = new Product("���", 1000, 5);
		
		System.out.println("������ ���� �������Դϴ�.\n");
		System.out.println("��ǰ��: ���� * ���Լ��� = �Ѱ���");
		
		ram.print();
		beer.print();
		eggs.print();
		beef.print();
		apple.print();
		
		Product.gross_price
		(apple.each_price(),beef.each_price(),eggs.each_price(),
				beer.each_price(),ram.each_price());
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine()+"(��)�� ���� �Ϸ�Ǿ����ϴ�.");*/
		
		String payment = "ī��";
		System.out.println(payment == "ī��"? "ī��(��)�� ���� �Ϸ�Ǿ����ϴ�." : "����(��)�� ���� �Ϸ�Ǿ����ϴ�.");
		
		
	}
}

class Product{
	
	String pro_name;
	int pro_price;
	int pro_amount;
	
	Product(){}
	
	Product(String pro_name, int pro_price, int pro_amount){
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.pro_amount = pro_amount;
	}

	static void gross_price(int n1, int n2, int n3, int n4, int n5) {
		System.out.println("�� ���Ұ����� "+ (n1+n2+n3+n4+n5) +"�Դϴ�.\n");
	}
	
	int each_price() {
		/*this.pro_amount = pro_amount;
		this.pro_price = pro_price;*/
		return(pro_price*pro_amount);
	}
	void print() {
		System.out.println(pro_name+" : "+
				pro_price+" * "+
				pro_amount+" = "+
				each_price());
	}
	
}
