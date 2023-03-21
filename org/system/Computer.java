package org.system;

public class Computer {
	public void computerModel() {
		System.out.println("VAIO E Series");
	}
	public void computerRAM() {
		System.out.println("Computer RAM 4GB");
	}
	public static void main(String[] args) {
		
		Computer sony=new Computer();
		
		sony.computerRAM();
		sony.computerModel();
		
	}

}
