class Monitor {
	private int workArea;
	private boolean available = false;

	public synchronized void dataPut(int price) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		workArea = price;
		available = true;
		notifyAll();
	}

	public synchronized void dataGet(float[] taxRates) {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		for (float taxRate : taxRates) {
			System.out.println("課税後価格は" + workArea * (1 + taxRate) + "円（消費税: " + (taxRate * 100) + "%）です。");
		}
		available = false;
		notifyAll();
	}
}
