import java.util.Calendar;


public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar base = Calendar.getInstance();
		Calendar later5ms = (Calendar) base.clone();
		later5ms.add(Calendar.MILLISECOND, 5);
		System.out.println(base.getTimeInMillis());
		System.out.println(later5ms.getTimeInMillis());
		System.out.println(later5ms.compareTo(base));
	}
}
