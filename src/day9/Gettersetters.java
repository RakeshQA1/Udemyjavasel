package day9;


public class Gettersetters {
private int account_no,account_bal;
private String accountname;

	
	public int getAccount_no() {
	return account_no;
}


public void setAccount_no(int account_no) {
	this.account_no = account_no;
}


public int getAccount_bal() {
	return account_bal;
}


public void setAccount_bal(int account_bal) {
	this.account_bal = account_bal;
}


public String getAccountname() {
	return accountname;
}


public void setAccountname(String accountname) {
	this.accountname = accountname;
}


	public static void main(String[] args) {
		Gettersetters gts = new Gettersetters();
		/*gts.setaccount_no(122345);
		System.out.println(gts.getaccount_no());
		gts.setaccountname("Thirumala");
		System.out.println(gts.getaccountname());
		gts.setaccount_bal(12000);
		System.out.println(gts.getaccount_bal());
		
		
		
		*/
	}
	
	
	
}

