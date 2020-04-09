package recursive;

/*
 * Program created to apply recursion.
 * Sum the elements of an array, and multiply it by the depth value. Every time there is an array inside
 * the array, the depth increase.
 * 
 * Complexity:
 * Time: O(N) -> N equivalent to each node from the arrays
 * Space: O(D) -> where D is equivalent to the number of depth
 */
public class Main {

	public static void main(String[] args) {
		
		Object[] array2 = {4,1};
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
				sum = sum + (int)element;
			}else 
			{
				sum = sum + sumArray(depth + 1, (Object[])element);
			}
		}
		
		return sum * depth;
	}
	
	
	
	
	

}
