package chap9.java_20181030;

public class CellPhone {
	
	String model;
	double battery;
	
	CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) throws IllegalArgumentException {
		
		if(time<0) {
			throw new IllegalArgumentException("��ȭ�ð� �Է¿���");
		}else {
			System.out.println("��ȭ�ð� : "+time+"��");
			battery-=time*0.5;
			if(battery<0) battery = 0;
		}
	}
	
	void charge(int time) throws IllegalArgumentException {
		if(time<0) {
			throw new IllegalArgumentException("�����ð� �Է¿���");
		}else {
			System.out.println("���� �ð� : "+time+"��");
			battery += time*3;
			if(battery>100) battery=100;
		}
	}
		
	void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
	
	boolean isSame(CellPhone other) {
		return model.equalsIgnoreCase(other.model);
	}
		
		
}


