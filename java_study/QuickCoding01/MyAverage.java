package QuickCoding01;

class MyAverage implements MyValues{
	int sum = 0;
	String str_result;
	
	public String getResult(){
		for(int i:values){
			sum += i;
		}
		sum /= values.length;
		
		str_result = Integer.toString(sum);
		return str_result;
	}
}
