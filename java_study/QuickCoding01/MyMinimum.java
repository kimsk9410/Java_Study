package QuickCoding01;

class MyMinimum implements MyValues{
	int min = Integer.MAX_VALUE;
	String str_result;
	
	public String getResult(){
		for(int i:values){
			if(i < min){
				min = i;
			}
		}

		str_result = Integer.toString(min);
		return str_result;
	}
}
