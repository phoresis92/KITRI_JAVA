package chap15.java_20181102;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Student {
	private int id;
	private String name;
	private int kor, eng, mat, sum, avg;

	public Student(int id, String name, int kor, int eng, int mat) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getId() {
		return id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		sum = kor + eng + mat;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		avg = sum / 3;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + sum;
	}

	// toString
	// hashCode
	// equals

}

public class StudentMapTest {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "������", 88, 67, 99);
		Student s2 = new Student(2000, "������", 100, 66, 99);
		Student s3 = new Student(3000, "���¸�", 89, 67, 82);
		Student s4 = new Student(3000, "���ڹ�", 56, 90, 82);
		// Ű Student��üid��, �� Student��ü�� ���� ����
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		// set/get �޼ҵ� ȣ�� ����
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		// map��ü�� kor, eng, mat ���Ͽ� sum , avg ���
		for (Integer k : map.keySet()) {
			map.get(k).setSum();
			map.get(k).setAvg();
			System.out.println(map.get(k));
		}
		// Map�����͸� list���� ����(key����, value)
		Collection<Student> col = map.values();
		ArrayList<Student> sort = new ArrayList<Student>(col);
		for (int i = 0; i < sort.size() - 1; i++) {
			for (int j = i + 1; j < sort.size(); j++) {
				int sum1 = sort.get(i).getSum();
				int sum2 = sort.get(j).getSum();
				if (sum1 < sum2) {
					Student temp = sort.get(i);
					sort.set(i, sort.get(j));
					sort.set(j, temp);
				}
			}
		}

		int cnt = 0;
		for (Student s : sort) {
			System.out.println(++cnt + "�� : " + s);
		}

		// Collection����Ÿ�� : Set , List, Map ���
		// sum ���� ������� ���� ������
		// 1�� : id : name : sum
		// 2�� :
		// 3�� :
	}
}