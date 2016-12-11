package BinarySearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[10];
		for(int i = 0; i < 10; i++){
			intArray[i] = i;
		}
		
		Search s = new Search(intArray);
		System.out.println(s.search(5));
		//geuntaek fork test		
	}

}
