package java_20181031;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		//1 String split 
		//���鹮�� : \s => "\\s"
		
		String address1 = "����� ���α� ���ε� �ڿ��չ븮 5������ ŰƮ��";
		
		String[] add1 = address1.split("\\s");
		
		for(int i = 0 ; i<add1.length ; i++) {
			//System.out.println(add[i]);
		}
		//-------------------------------------------------
		String address2 = "�����-���α�/���ε�;�ڿ��չ븮:5������-ŰƮ��";
		
		String[] add2 = address2.split("[-/;:]");
		
		for(int i = 0 ; i<add2.length ; i++) {
			//System.out.println(add2[i]);
		}
		//----------------------------------------------------
		String address3 = "�����:-���α�:-���ε�:-�ڿ��չ븮:-5������:-ŰƮ��";
		
		String[] add3 = address3.split(":-");
		
		for(int i = 0 ; i<add3.length ; i++) {
			System.out.println(add3[i]);
		}
		
		//======================================================
		
		
		//2 StringTokenizer : ���ڿ� �и���ɸ�
		
		StringTokenizer st1 = new StringTokenizer(address1, " ");
		StringTokenizer st2 = new StringTokenizer(address2, "-:;/");
		StringTokenizer st3 = new StringTokenizer(address3, ":-");
		/*while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}*/
		/*int cnt = 0;
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
			cnt++;
		}
		System.out.println(cnt);*/
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello ");
		sb.append("world!");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.toString());
		
	}
	
}
