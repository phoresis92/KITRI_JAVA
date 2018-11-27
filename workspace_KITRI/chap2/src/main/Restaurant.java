package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import view.LoginView;
import view.MemberJoinView;
import view.MenuView;
import view.Orderview;
import view.ReserveView;
import vo.MemberVO;
import vo.MenuVO;

public class Restaurant {
	
	public static void main(String[] args) {
		HashMap<MemberVO, ArrayList<MenuVO>> login = null;
		ArrayList<MenuVO> basketlist = null;
		MemberVO mvo = null;
		
		
		
		
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �޴�����");
		System.out.println("2. �ֹ��ϱ�");
		System.out.println("3. �����ϱ�");
		System.out.println("4. ���� �Խ���");
		System.out.println("5. �α���");
		System.out.println("6. �α׾ƿ�");
		System.out.println("7. ȸ������"); //7.ȸ������ �޴� �߰��մϴ�.
		System.out.println("8. ������ �޴�");
		System.out.println("9. ����");
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		
		
		if(Static.isInt(menu)) {
			int select =  Integer.parseInt(menu);
			
			if(select == 9) {
				System.exit(0);
			}else if(select == 1) {
				MenuView mv = new MenuView(login, basketlist);
				basketlist = mv.menuSearch();
				try {
					login.put(mvo, basketlist);
				}catch(Exception e){
					
				}
			}else if(select == 2) {
				Orderview ov = new Orderview(login, basketlist);
				ov.pay();
				
			}else if(select == 3) {
				ReserveView rv = new ReserveView(login);
				//rv
			}else if(select == 4) {
				
			}else if(select == 5) {
				mvo = new LoginView().input();	
				login = new HashMap<MemberVO, ArrayList<MenuVO>>();
				basketlist = new ArrayList<MenuVO>();
				login.put(mvo, basketlist);
			}else if(select == 6) {
				login.clear();
				
			}else if(select == 7) {				
				new MemberJoinView().input();
			}else if(select == 8) {
				
				
				
			}
			
			
		}else {
			System.out.println("���ڸ� �Է����ּ���!");
		}
		
		}//while end
	
	}//main end
	
}
