package ch06;
import java.util.Scanner;

public class BankApplication {
	
	static Account[] accountArray = new Account[100];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("        1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료        ");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(sc.nextLine());
			if(num==1) {
				createAccount();	 
			 }
			else if(num == 2) {
				showList();
			}
			else if(num == 3) {
				deposit();
			}
			else if(num == 4) {
				withdraw();
			}
			else if(num == 5) {
				 System.out.println("프로그램 종료");
				 break;
			}	
		}	
	}	
	
	
		
	
		// 계좌 생성
		public static void createAccount() {
			System.out.println("------------");
			System.out.println("   계좌생성   ");
			System.out.println("------------");
			System.out.print("계좌번호: ");
			String acnum = sc.nextLine();
			System.out.print("계좌주: ");
			String name = sc.nextLine();
			System.out.print("초기입금액: ");
			int balance = Integer.parseInt(sc.nextLine());
			
			Account account = new Account(acnum, name, balance);
			for(int i=0; i<accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = account;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
			
		}
		
		
		//계좌 목록 보기
		public static void showList() {
			System.out.println("------------");
			System.out.println("   계좌목록   ");
			System.out.println("------------");
			
			
			for (int i=0; i<accountArray.length ; i++) {
				Account account = accountArray[i];
				if(account!=null) {
					System.out.println(account.getAcnum() + " " + account.getName() + " " + account.getBalance());
				}
				
			}
		}
			
		//예금 
		private static void deposit() {
			System.out.print("계좌번호: ");
			String acnum = sc.nextLine();
			System.out.print("예금액: ");
			int money = Integer.parseInt(sc.nextLine());
			
			Account account = findAccount(acnum);
			if(account == null) {
				System.out.println("정보 없음");
				return;
			}	
			account.setBalance(account.getBalance()+money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		
		//출금
		private static void withdraw() {
			System.out.print("계좌번호: ");
			String acnum = sc.nextLine();
			System.out.print("출금액: ");
			int money = Integer.parseInt(sc.nextLine());
			Account account = findAccount(acnum);
			if(account == null) {
				System.out.println("정보 없음");
				return;
			}	
			account.setBalance(account.getBalance()-money);
			
			System.out.println("결과: 출금이 성공되었습니다.");
			
		}
		
		static Account findAccount(String acnum) {
			 Account account = null;
			 for(int i= 0; i<accountArray.length; i++) {
			 if(accountArray[i] != null) {
				 String dbAcnum = accountArray[i].getAcnum();
				 if(dbAcnum.equals(acnum)) {
					 account = accountArray[i];
					 break;
				 	}
			 	}
			 }
			 return account;
		}
		
}


