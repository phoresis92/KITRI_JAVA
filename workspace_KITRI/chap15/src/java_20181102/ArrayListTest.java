package java_20181102;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Employee{
   int id;
   String name;
   double pay;
   
   public Employee(int id, String name, double pay) {
      this.id = id;
      this.name = name;
      this.pay = pay;
   }

   @Override
   public String toString() {
      return "ȸ�����ü:"+id+":"+name+":"+pay;
   }
   
      
}

public class ArrayListTest {
   public static void main(String[] args) {
      //1. Ÿ�� ����x �ڹ� ���/Ư�� Ÿ�� ��ü, ũ�� 5��+5
      //List list = new Vector(5,3);
      //ArrayList list =new  ArrayList(5);
      //List<Integer> list =new ArrayList<Employee>(5);
      List<Employee> list =new ArrayList<Employee>(5);
      //List list =new  LinkedList();
      
      //list.add("java");//String
      //list.add(100);//int=Integer
      //list.add(3.14);//Double
      Employee e1 = new Employee(100,"�̻��",45000.77);
      Employee e2 = new Employee(200,"��븮",45000.99);
      Employee e3 = new Employee(300,"�ڰ���",65000.77);
      list.add(e1);
      list.add(e2);
      list.add(e3);//5�� �� ũ�� ����
      //list.set(1,"����Ʈ");
      //list.remove(1);
      //list.add(1,"�߰�");
      System.out.println(list.size());
      
      for(int i= 0; i < list.size();i++) {
         //id:name:pay
         System.out.println(list.get(i));
      }
      //����� �Ű����� : java : ����Ʈ ���� 
      //System.out.println(list.contains(args[0]));
      
      //����� �Ű����� : 100 �Է�
      //����Ʈ ���� ��� 100 Employee ��ü ����
      
      for(int i= 0; i < list.size();i++) {
         //if(list.get(i) instanceof Employee) {
         boolean result =
         list.get(i).id == Integer.parseInt(args[0]);
         //((Employee)list.get(i)).id == Integer.parseInt(args[0]);
         System.out.println(result);
         //}
      }
      //ArrayList --> �迭 ����
      Object[] o =list.toArray();
      
      //ArrayList list =new ArrayList(5);
      //ArrayList list =new ArrayList();
            
}
}