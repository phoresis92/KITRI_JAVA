package java_20181102;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoSetTest {

   public static void main(String[] args) {
   /*   //�������ߺ�����x,��������x
      Set<Integer> lotto = new HashSet<Integer>(); 
      lotto.add(500);
      lotto.add(100);
      lotto.add(200);
      lotto.add(300);
      lotto.add(100);
      System.out.println(lotto.size());
      
      //Set ��ȸ1 Iterator: add���� ������� Set ���� �����͵� ���� 
      Iterator<Integer> it = lotto.iterator();//�ݺ�
      while(it.hasNext()) {
         Integer obj =  it.next();
         //it.next();//�а� �Ѿ�� 
         System.out.println(obj);
      }
      //while(st.hasMoreTokens()) {st.nextToken();}
      
      
      //Set ��ȸ2 : for�ݺ���
      for(Integer num : lotto) {
         System.out.println(num);
      }
      
      
      */
      
      
      Set<Integer> mylotto =new HashSet<Integer>();


      //6�� mylotto���屸��
      while(true) {
         int number = (int)(Math.random()*45)+1;
         
         mylotto.add(number);
         if(mylotto.size()>5) {
      //System.out.println(number);
            break;
      }
         
         
      }
      for(Integer num : mylotto) {
         System.out.print(num+ "  ");
      }
            
            
      System.out.println();
      //System.out.println(mylotto.size());
   
      
      
      /*
      for() {
         mylotto.add((int)(Math.random()*45)+1));

      }
      */
      
   /*   for(int num ; mylotto.size(); num++) {
         System.out.println(num);
         
         if(mylotto.size()<6) {

         int num = ;
         
            
            
         }
         System.out.println(mylotto.size());
      
   
         
      }*/

            /*
      System.out.println();
      //Set ��ȸ2 : for�ݺ���
         if(mylotto.size()==6) {
            for(Integer num : mylotto) {
               System.out.println(num);
            }
         }else {
            System.out.println("�ٽý���");*/
            
         
      //lotto ���: �ߺ����� ���� 1-45 ���� 6�� ��� 

}
}