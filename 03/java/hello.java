public class hello {
	public static void main(String[] args) {
		int l = (10); //NUMBER OF ITEMS BEING PUSHED
		DynamicArray a = new DynamicArray(2); //INITIAL STARTING SIZE
		for (int n = 0; n < l; n++) {
			a.push(n);
		}
		System.out.println(a.space());
	}
}
