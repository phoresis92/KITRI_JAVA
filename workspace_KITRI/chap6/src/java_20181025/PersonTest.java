package java_20181025;

class Person {// ��� ��ü ǥ��

	String name;
	int age;
	static String nation = "���ѹα�";

	void introduce() {

		System.out.println(" ��ü�� �̸��� " + name + " �̰� ���̴� " + age + " �̸� ������ " + nation + " �Դϴ�.");
	}
	/*static void printNation(){
		System.out.println(nation+"�� ����");
	}*/

}

public class PersonTest {

	public static void main(String[] args) {

//		System.out.println(Person.nation);
		/*Person.printNation();*/

		Person p1 = new Person();

		p1.name = "ȫ�浿";
		p1.age = 25;

		p1.introduce();


		Person p2 = new Person();

		p2.name = "���ڹ�";
		p2.age = 35;

		p2.introduce();
		/*
		 * System.out.println("p2 ���� ��ü�� �̸��� " + p2.name + " �̰� ���̴� " + p2.age +
		 * " �̸� ������ " + p2.nation + " �Դϴ�.");
		 */

	}
}
