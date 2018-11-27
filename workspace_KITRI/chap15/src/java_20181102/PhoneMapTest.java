package java_20181102;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneMapTest {
   public static void main(String[] args) {
      Map<String,String[]> phones =
            new HashMap<String,String[]>();
      
      String [] p1 =
      {"010-222-3333", "02-2222-3333","java@mail.com"};
      String [] p2 =
         {"010-222-3544", "02-222-3353","031-2636-4743 ","jsp@mail.com"};
      String [] p3 =
         {"010-222-3425", "oracle@mail.com"};
   
      phones.put("���ڹ�",p1);
      phones.put("ȫ�浿",p2);
      phones.put("������",p3);
      phones.put("���ڹ�",p3);//Ű�� ����x : �ش� Ű �� ����
      phones.put("���ڹ�",p3);//�� ���� : ��� �߰�
      //phones.remove("���ڹ�");
      // map Ű ���� �Ǵ�
      //1.hashCode() ���� ���� 2> equals() true 
      System.out.println(phones.size());
      
      /*//args[0] : ���ڹ� Ű(�˻�)
      String[] result =phones.get(args[0]);
      for(String s : result) {
         System.out.println(args[0] + ":"+s);
      }*/

      //��� ��ȭ��ȣ�� ���
      //Map Ű �ߺ� ���x :Setó��
      //�ȵ���̵���: �ڹ� Map
      Set<String> keys = phones.keySet();
      for (String k : keys) {
         //System.out.println(k);
         String[] result = phones.get(k);
         System.out.print(k + " -- ");
         for(String s : result) {
            System.out.print(s + "/");
         }
         System.out.println();
      }
}
}
