class PutData extends Thread {
	private Monitor monitor;
	private static int[] prices = { 100, 200, 300, 400, 500 };
	public static int numOfPrices = prices.length;

	public PutData(Monitor monitor) {
		this.monitor = monitor;
	}

	public void run() {
		for (int price : prices) {
			monitor.dataPut(price);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
