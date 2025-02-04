package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class InterviewPractice {

	public static void main(String[] args) {
//		String inputString = "Tracxn";
//        int n = 1; // Change this to 1 to test the other case
//
//        String result = processString(inputString, n);
//        System.out.println(result);
		
//		System.out.print(missingNumber(new int[] {1,2,4,5}));
		
//		numPatternPrint(5);
//		diamondPattern(33);
//		System.out.println(transformString("Hello123!"));
//		System.out.println(KthLargest(new int[] {2,4,5,1,45,23}, 4));
//		System.out.println(substringIsPresent("sadbutbad", "bad"));
//		
//		int[] ar = new int[] {1,4,3,2,5,8,7};
//		for(int i : ar)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		mergeSort(ar, ar.length);
//		for(int i : ar)
//		{
//			System.out.print(i+" ");
//		}
		
//		System.out.println(candiesDistribution(new int[] {1,2,3,2}));
//		System.out.println(minPlatformsrequired(new int[] {900, 945, 955, 1100, 1500, 1800}, new int[] {920, 1130, 1150, 1200, 1900, 2000}));
		
		System.out.println(longestPalindromeSubstring("cbbd"));
    }
	
	private static String removeCharEvenTimes(String s)
	{
		String t = "";
		int count = 1;
		
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count%2 != 0)
				{
					for(int j=0; j<count; j++)
					{
						t += s.charAt(i);
					}
				}
				
				count = 1;
			}
		}
		
		if(count%2 != 0)
		{
			for(int j=0; j<count; j++)
			{
				t += s.charAt(s.length()-1);
			}
		}
		
		return t;
	}
	
	private static String removeDuplicates(String s)
	{
		String t = "";
		int count = 1;
		
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count == 1)
				{
					t += s.charAt(i);
				}
				
				count = 1;
			}
		}
		
		if(count == 1)
		{
			t += s.charAt(s.length()-1);
		}
		
		return t;
	}
	
	private static int missingNumber(int[] ar)
	{
		int n = ar.length+1;
		int absValue = n*(n+1)/2;
		int sum = 0;
		
		for(int i : ar)
		{
			sum += i;
		}
		
		return (absValue - sum);
	}
	
	private static void numPatternPrint(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	private static void diamondPattern(int n)
	{
		if(n%2 == 0)
		{
			System.out.println("not possible");
			return;
		}
		
		int i = (n/2)+1, j = (n/2)+1;
		for(int x=1; x<=n; x++)
		{
			for(int y=1; y<=n; y++)
			{
				if(y == i || y == j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(x < (n/2)+1)
			{
				i--; j++;
			}
			else
			{
				i++; j--;
			}
		}
	}
	
	private static String transformString(String s)
	{
		String t = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				int ascii = (int)ch;
				if(ascii == 122)
				{
					t += Character.toString((char)(ascii-25));
				}
				else
				{
					t += Character.toString((char)(ascii+1));
				}
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				int ascii = (int)ch;
				if(ascii == 65)
				{
					t += Character.toString((char)(ascii+25));
				}
				else
				{
					t += Character.toString((char)(ascii-1));
				}
			}
			else if(ch >= '1' && ch <= '9')
			{
				int ascii = (int)ch;
				if(ascii == (int)'9')
				{
					t += Character.toString((char)(ascii-9));
				}
				else
				{
					t += Character.toString((char)(ascii+1));
				}
			}
			else
			{
				int ascii = (int)ch;
				t += Character.toString((char)(ascii+1));
			}
			
		}
		return t;
	}
	
	private static int KthLargest(int[] ar, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
		
		for(int i : ar)
		{
			if(pq.size() < k)
			{
				pq.add(i);
			}
			else
			{
				if(i > pq.peek())
				{
					pq.poll();
					pq.add(i);
				}
			}
		}
		
		
		return pq.peek();
	}
	
	private static int KthSmallest(int[] ar, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, Collections.reverseOrder());
		
		for(int i : ar)
		{
			if(pq.size() < k)
			{
				pq.add(i);
			}
			else
			{
				if(i < pq.peek())
				{
					pq.poll();
					pq.add(i);
				}
			}
		}
		
		
		return pq.peek();
	}
	
	private static int substringIsPresent(String s, String t)
	{
		
		for(int i=0; i<=s.length()-t.length(); i++)
		{
			if(s.charAt(i) == t.charAt(0))
			{
				if(s.substring(i, i+t.length()).equals(t))
				{
					return i;
				}
			}
		}
		
		return -1;
	}
	
	private static void bubbleSort(int[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length-1; j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					
				}
			}
		}
	}
	
	private static void mergeSort(int[] ar, int numLength)
	{
		if(numLength < 2)
		{
			return;
		}
		
		int mid = (numLength/2);
		int[] leftar = new int[mid];
		int[] rightar = new int[numLength - mid];
		
		for(int i=0; i<mid; i++)
		{
			leftar[i] = ar[i];
		}
		
		for(int i=mid; i<ar.length; i++)
		{
			rightar[i-mid] = ar[i];
		}
		
		mergeSort(leftar, leftar.length);
		
		mergeSort(rightar, rightar.length);
		
		merge(ar, leftar, rightar, mid, numLength-mid);
	}
	
    private static void merge(int[] ar, int[] leftar, int[] rightar, int left, int right) 
    {	
    	int i = 0, j=0, k=0;
    	
    	while(i<left && j<right)
    	{
    		if(leftar[i] < rightar[j])
    		{
    			ar[k++] = leftar[i++];
    		}
    		else
    		{
    			ar[k++] = rightar[j++];
    		}
    	}
    	
    	while(i < left)
    	{
    		ar[k++] = leftar[i++];
    	}
    	
    	while(j < right)
    	{
    		ar[k++] = rightar[j++];
    	}
	}
    
    private static int candiesDistribution(int[] ar)
    {
    	int[] left = new int[ar.length];
    	int[] right = new int[ar.length];
    	int res = 0;
    	
    	left[0] = 1;
    	
    	for(int i=1; i<ar.length; i++)
    	{
    		if(ar[i] > ar[i-1])
    		{
    			left[i] = left[i-1] + 1;
    		}
    		else
    		{
    			left[i] = 1;
    		}
    	}
    	
    	right[ar.length-1] = 1;
    	
    	for(int i=ar.length-2; i>=0; i--)
    	{
    		if(ar[i] > ar[i+1])
    		{
    			right[i] = right[i+1] + 1;
    		}
    		else
    		{
    			right[i] = 1;
    		}
    	}
    	
    	for(int i=0; i<ar.length; i++)
    	{
    		if(left[i] > right[i])
    		{
    			res += left[i];
    		}
    		else
    		{
    			res += right[i];
    		}
    	}
    	
    	return res;
    	
    }
    
    private static int minPlatformsrequired(int[] ar, int[] dep)
    {
//    	Arrays.sort(ar); 
    	Arrays.sort(dep);
    	
    	int i = 0, j=0, count = 0, maxCount = 0;
    	
    	while(i < ar.length && j < dep.length)
    	{
    		if(ar[i] < dep[j])
    		{
    			count++;
    			i++;
    		}
    		else
    		{
    			count--;
    			j++;
    		}
    		
    		maxCount = Math.max(maxCount, count);
    	}
    	
    	return maxCount;
    }
    
    private static String longestPalindromeSubstring(String s)
    {
    	
    	for(int size= s.length(); size >=1; size--)
    	{
    		for(int i=0; i<=s.length()-size;  i++)
    		{
    			
    			if(isPlaindrome(s.substring(i, i+size)))
    			{
    				return s.substring(i, i+size);
    			}
    		}
    	}
    	
    	return "no";
    }

	private static boolean isPlaindrome(String t) {
		
		int i=0, j=t.length()-1;
		
		while( i<j)
		{
			if(t.charAt(i) == t.charAt(j))
			{
				i++; j--;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	public static String processString(String inputString, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            // If n is 0, pick even-indexed characters; if n is 1, pick odd-indexed characters
            if (n == 0 && i % 2 == 0) {
                result.append(inputString.charAt(i));
            } else if (n == 1 && i % 2 != 0) {
                result.append(inputString.charAt(i));
            }
        }

        return result.toString();
    }


}
