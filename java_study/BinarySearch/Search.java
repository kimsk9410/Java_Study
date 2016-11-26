package BinarySearch;

public class Search {

	int[] intArray;
	int result, first, mid, last;
	
	Search(int[] a){
		intArray = a;
		first = 0;
		mid = 0;
		last = intArray.length - 1;
	}
	
	public int search (int a){
		
		
		while( last > first ){
			
			if(a == intArray[first]){
				return first;
			}
			else if(a == intArray[last]){
				return last;
			}
			
			mid = ( first + last ) / 2;
			
			if(a == intArray[mid]){
				return mid;
			}
			else
			{
				if(a > intArray[mid]){
					first = mid + 1;
				}
				else{
					last = mid - 1;
				}
			}
			
		}
		
		return -1;
	}
}
