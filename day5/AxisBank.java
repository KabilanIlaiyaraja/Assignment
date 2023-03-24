package week5.day5;

public class AxisBank extends BankInfo{
	public void deposit() {
		super.deposit();
		System.out.println("Cash Deposit");

}
	public static void main(String[] args) {
		AxisBank bankDetails=new AxisBank();
		bankDetails.deposit();
		bankDetails.fixed();
		bankDetails.saving();
		
		
	}
}
