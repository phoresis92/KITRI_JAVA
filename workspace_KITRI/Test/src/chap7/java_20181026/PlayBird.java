package chap7.java_20181026;

public class PlayBird {
	
	public static void main(String[] args) {
		
		Duck duck = new Duck("�в���", 2, 2, 3.0, "����");
		duck.fly();
		duck.sing();
		duck.swim();
		duck.print();
		
		Sparrow spa = new Sparrow("±±", "����ƺ�", 2, 4.0, "����");
		spa.fly();
		spa.sing();
		spa.makeFriend();
		spa.print();
		
		
	}
}
