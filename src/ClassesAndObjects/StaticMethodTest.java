
package ClassesAndObjects;

public class StaticMethodTest {

	private int x = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= 100000; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
