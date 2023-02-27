package week2.day1;

public class Car {
	
	public void unLock() {
		System.out.println("Unlock the Car");
	}
	public void openDoor() {
		System.out.println("Open the Door");
	}
	public void switchIgnition() {
		System.out.println("Start the Car");
	}
	
	public void applyBreak() {
		System.out.println("Apply Break");
	}
public void applyGear() {
	System.out.println("Apply Gear");
}
public void switchOnAc() {
	System.out.println("Switch ON AC");
}
public void applyAccelerator() {
	System.out.println("Apply Accelerator");
}
public void pressSoundHorn() {
	System.out.println("Press Sound Horn");
}
public void openWindows() {
	System.out.println("Open the Windows");
}

public void switchWipper() {
	System.out.println("Switch On Wipers");
}

public static void main(String[] args) {
	Car volvo=new Car();
	volvo.unLock();
	volvo.openDoor();
	volvo.switchIgnition();
	volvo.applyGear();
	volvo.applyAccelerator();
	volvo.applyBreak();
	volvo.pressSoundHorn();
	volvo.openWindows();
	volvo.switchOnAc();
	volvo.switchWipper();
	
	
}



}
