package chap7.java_20181026;

public class Duck extends Bird {

	int web ;
	
	Duck(String name, int web, int legs, double length, String spec){
		super(legs, length, spec);
		this.name = name;
		this.web = web;
		
	}
	
	void swim() {
		System.out.println(spec+name+"�� "+web+"���� �������� �����մϴ�.");
	}
	
	void fly() {
		System.out.println(spec+name+"�� ���� �ʽ��ϴ�.");
	}
	
	void sing() {
		System.out.println(spec+name+"�� �Ҹ����� ��ϴ�.");
	}
	
}
