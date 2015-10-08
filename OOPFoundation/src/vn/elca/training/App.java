package vn.elca.training;

public class App {

	public App() {
		// constructor
	}

	public void runApp() {
		Mariti mariti1 = new Mariti();
		mariti1.setColor("Red");
		mariti1.setMaxspeed(1000);
		mariti1.CarInfo();
		mariti1.MarutiCar();
		
		Mariti mariti2 = new Mariti("Blue", 2000);
		mariti2.CarInfo();
		mariti2.MarutiCar();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App();
		a.runApp();
	}
}
