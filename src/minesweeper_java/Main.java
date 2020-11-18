package minesweeper_java;

public class Main implements Runnable {

	GUI gui = new GUI();
	
	public static void main(String[] args) {
		new Thread(new Main()).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			gui.update();
		}
	}
}
