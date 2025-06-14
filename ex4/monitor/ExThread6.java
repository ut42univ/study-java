public class ExThread6 {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();

		PutData pd = new PutData(monitor);
		GetData gd = new GetData(monitor);

		pd.start();
		gd.start();
	}
}
