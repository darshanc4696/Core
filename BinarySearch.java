package corejava;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int k = 7;
		
		int res = binarySearch(a, k);
		System.out.println(res);
		

	}

	private static int binarySearch(int[] a, int k) 
	{
		int l=0, h=a.length-1, mid = 0;
		
		while(l<=h)
		{
			mid = (l+h)/2;
			
			if(a[mid] == k)
			{
				return a[mid];
			}
			else if(k < a[mid])
			{
				h = mid-1;
			}
			else
			{
				l = mid + 1;
			}
		}
		return -1;
	}

}


