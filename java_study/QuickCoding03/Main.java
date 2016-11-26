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
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(NumberFormatException nfe){
			System.out.println("�Է¹��� ���ڿ��� ���ڰ� �ƴմϴ�.");
		}catch(ThreeException te){
			System.out.println("3�ڸ��� �Ѿ����ϴ�,");
		}
		
	}

}
