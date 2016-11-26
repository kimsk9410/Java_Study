package QuickCoding03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			String a,b;
			Scanner scan = new Scanner(System.in);
			int ia,ib,ic;
			
			a = scan.nextLine();
			b = scan.nextLine();
			
			ia = Integer.parseInt(a);
			ib = Integer.parseInt(b);
			
			if(ia > 999 || ib > 999){
				throw new ThreeException();
			}
			
			ic = ia/ib;
			System.out.println(ic);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NumberFormatException nfe){
			System.out.println("입력받은 문자열이 숫자가 아닙니다.");
		}catch(ThreeException te){
			System.out.println("3자리를 넘었습니다,");
		}
		
	}

}
