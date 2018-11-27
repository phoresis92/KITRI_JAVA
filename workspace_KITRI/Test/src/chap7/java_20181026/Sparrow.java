package chap7.java_20181026;

public class Sparrow extends Bird {

	String friend ;
	
	Sparrow(String name, String friend, int legs, double length,String spec){
		super(legs, length, spec);
		this.name = name;
		this.friend = friend;
	}
	
	void makeFriend() {
		System.out.println(spec+"�� ģ���� "+friend+"�Դϴ�.");
	}
	
	void fly() {
		System.out.println(spec+name+"�� ���ƴٴմϴ�.");
	}
	void sing() {
		System.out.println(spec+name+"�� �Ҹ����� ��ϴ�.");
	}
	
}
