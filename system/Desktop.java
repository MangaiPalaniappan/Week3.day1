package org.system;

public class Desktop extends Computer{
	
	public void DesktopSize() {
		System.out.println("Size of the desktop.");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.ComputerModer();
		desk.DesktopSize();

	}

}
