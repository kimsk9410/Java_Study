package QuickCoding01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str_result;
		
		/*MyAverage ma = new MyAverage();
		MyMinimum mm = new MyMinimum();*/
		
		MyValues mv;
		//mv = ma;
		mv = new MyAverage();
		str_result = mv.getResult();
		System.out.println(str_result);
		
		//mv = mm;
		mv = new MyMinimum();
		str_result = mv.getResult();
		System.out.println(str_result);
		
	}

}
