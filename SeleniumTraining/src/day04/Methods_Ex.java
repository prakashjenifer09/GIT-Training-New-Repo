package day04;

import java.util.Scanner;

public class Methods_Ex {

	public static void main(String[] args) {
		Methods_Ex obj = new Methods_Ex();
		obj.gmailLogin();
		obj.gmailLogin();
		obj.gmailLogin();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String user = scan.nextLine();
		obj.userGmailLogin("Arthi@gmai.com","Testing");
		obj.userGmailLogin("Gopal@gmai.com","Testing");
		obj.userGmailLogin(user,"Testing");
		scan.close();
		int ticket = obj.bookTicket("Mathan", 34);
		obj.cancelTicket(ticket);
		obj.cancelTicket(obj.bookTicket("Arthi", 28));
	}
	
	public void gmailLogin() {
		String userName="Mathan@gmail.com";
		String sPass = "Testing123";
		System.out.println(userName+" Login is Successful");
	}
	
	public void userGmailLogin(String sUser,String sPass) {
		
		System.out.println(sUser+" Login is Successful");
	}
	
	public int bookTicket(String passName,int age) {
		System.out.println("Entered Passenger name is : "+passName);
		System.out.println("Entered Passenger age is : "+age);
		int ticekNo = 3030;
		return ticekNo;
	}
	
	public void cancelTicket(int ticekt_no) {
		System.out.println(ticekt_no+" is Cancellled Successfully");
	}
	
	
	
	
	

}
