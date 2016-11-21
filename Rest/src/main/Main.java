package main;

public class Main {

	public static void main(String[] args) {
		new Main().doIt();
	}

	public void doIt() {
		GetRequests getRequests = new GetRequests();
		getRequests.getAllCountry();
		getRequests.hasCountry("MEX");
	}
}
