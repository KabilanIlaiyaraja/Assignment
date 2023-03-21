package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size 27inch");
	}
	public static void main(String[] args) {
		
		Desktop system=new Desktop();
		system.desktopSize();
		system.computerModel();
		system.computerRAM();
		
	}

}
