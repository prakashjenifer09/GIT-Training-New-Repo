package day08;

public class SavingAccont extends EncapsulationBankAccont{

	public static void main(String[] args) {
		SavingAccont karthi = new SavingAccont();
		karthi.setAccNo(123456);
		karthi.setAccName("Karthick C");
		System.out.println("Account Name is :  "+karthi.getAccName());
		System.out.println("Account Number is : "+karthi.getAccNo());
		
	}

}
