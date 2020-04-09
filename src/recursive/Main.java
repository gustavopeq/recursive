package recursive;

public class Main {

	public static void main(String[] args) {

		Object[] array3 = {-10,-10};
		Object[] array2 = {4,1,array3};
		Object[] array = {1,4, array2 ,5};
		
		System.out.println(sumArray(1,array));
	}
	
	public static int sumArray(int depth, Object[] array) 
	{
		int sum = 0;
		for (Object element : array) 
		{ 
			if(element instanceof Integer) 
			{
				sum = sum + ((int)element*depth);
			}else 
			{
				sum = sum + sumArray(depth + 1, (Object[])element);
			}
		}
		
		return sum;
	}
	
	
	
	
	

}
