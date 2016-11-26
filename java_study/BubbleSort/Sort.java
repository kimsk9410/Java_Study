package BubbleSort;

public class Sort {
	
	int sortArray[] = {0};

	Sort(int[] a){
		sortArray = a;
	}
	
	public void sort(){
		for(int i = sortArray.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(sortArray[j] > sortArray[j+1]){
					int temp = sortArray[j];
					sortArray[j] = sortArray[j + 1];
					sortArray[j + 1] = temp;
				}
			}
		}
	}
	
	
	public void show(){
		System.out.print("{ ");
		for(int i = 0; i < sortArray.length; i++){
			System.out.print(sortArray[i]+" ");
		}
		System.out.print("}");
	}
	
}