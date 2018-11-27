package java_20181031;

public class ObjectTest {
	public static void main(String[] args) {
		
		Object obj = new Object();
		Class c =obj.getClass();
		c.getName();
		obj.getClass().getName();
	
		MyObject mo1 = new MyObject("java");
		MyObject mo2 = new MyObject("java");
		System.out.println(mo1);
		System.out.println(mo2);
		if(mo1 == mo2) {
			System.out.println("==�� ����"); //�ּҰ� �� �������̵� �Ұ�
		}else System.out.println("==�� �ٸ���");
		if(mo1.equals(mo2)) {
			System.out.println("equals�� ����"); //�������̵��Ͽ� ��ɺ��� ����
		}else System.out.println("equals�� �ٸ���");
		/*�ּ�(�������̵� �ٸ�...)
		1. mo2 MyObjectŸ���� ��ü���
		2. msg������ ��������
		3. 12��� ���� : true*/
	}
}

class MyObject extends Object {
	//toString(), equals() �޼ҵ� �ڵ� ����
	
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}
	
	public String toString() {
		return msg+": �������̵�";
	}

	public boolean equals(Object obj) {
	if(obj instanceof MyObject) {
		return msg.equals(((MyObject)obj).msg);
	}else return false;
}

/*�ּ�(�������̵� �ٸ�...)
1. mo2 MyObjectŸ���� ��ü���
2. msg������ ��������
3. 12��� ���� : true*/

	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyObject other = (MyObject) obj;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}*/

}
