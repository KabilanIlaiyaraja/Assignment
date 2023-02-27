package week2.day1;

public class MyMobile {
	
	public void unLockScreen() {
		System.out.println("Unlock the Screen");
	}
	public void dialNumber() {
		System.out.println("Dial the Number");
	}
	public void sendText() {
		System.out.println("Send Text Message");
	}
	public void playSongs() {
		System.out.println("Play Songs");
	}
	public void playVideo() {
		System.out.println("Play Video");
	}
	public void openFaceBook() {
		System.out.println("Open Face Book");
	}
	public void openCamera() {
		System.out.println("Open the Camera");
	}
	
	public static void main(String[] args) {
		
		MyMobile mobile=new MyMobile();
		
		mobile.unLockScreen();
		mobile.dialNumber();
		mobile.openCamera();
		mobile.sendText();
		mobile.playSongs();
		mobile.playVideo();
		mobile.openFaceBook();
		
		
	}

}
