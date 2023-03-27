package week6.day1Assignment;

public class Automation extends  MultipleLanguage {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		
		Automation testing=new Automation();
		testing.java();
		testing.python();
		testing.ruby();
		testing.selenium();
	}
	

}
