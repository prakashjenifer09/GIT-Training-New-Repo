package day08;

public class EncapsulationBankAccont {
	
	private long iAccNo;
	private String sAccName;
	public String email;
	
		
	public void setAccNo(long accno) {
		iAccNo = accno;
	}
	
	public void setAccName(String name) {
		sAccName = name;
	}
	
	public long getAccNo() {
		return iAccNo;
	}
	
	public String getAccName() {
		return sAccName;
	}
	

}
