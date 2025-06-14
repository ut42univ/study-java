class GetData extends Thread {
    private Monitor monitor;
    private float[] taxRates = { 0.05f, 0.08f, 0.10f };

    public GetData(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for (int i = 0; i < PutData.numOfPrices; i++) {
            monitor.dataGet(taxRates);
        }
    }
}
