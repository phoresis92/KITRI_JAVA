package chap15.java_20181102;
import java.util.ArrayList;
import java.util.List;

class SameSentence{
String[] compare(List<String> list1, List<String> list2){
	String[] result = new String[10];
	//���� ���ڿ� ���� ArrayList
	ArrayList<String> list3 = new ArrayList<String>();
	//1.�����Ͱ��� : size()
	if(list1.size() >= list2.size()) {
		for(int i = 0; i < list2.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				list3.add(list1.get(i));
			}
		}
	}
	result = new String[list3.size()];
	list3.toArray(result);//list3 ���ڿ� result ����
	return result;
}
}
public class SameSentenceTest {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("�ڹٴ� ��ü���� ����Դϴ�");
	list1.add("�츮�� ŰƮ������ �ڹٸ� ���� ���Դϴ�");
	list1.add("������ �÷��� �����ӿ�ũ�� �����! ");
	list1.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("�ڹٴ� ��ü���� ����Դϴ�");
	list2.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
	list2.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
	list2.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("�ڹٴ� ��ü���� ����Դϴ�");
	list3.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
	list3.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
	
	SameSentence ss = new SameSentence();
	String result1 [] = ss.compare(list1, list2);//2
	for(String s : result1) {
		System.out.println(s);
	}
	//list1, list2���� ���� ���� ���
	System.out.println("====================");
	String result2 [] = ss.compare(list1, list3);
	for(String s : result2) {
		System.out.println(s);
	}
	//1
	//list3�� ������ŭ�� ���� ���� ���	
	
}
}
