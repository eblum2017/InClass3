public class InClass3 
{
	public static void main(String[] args)
	{
		System.out.println(hasDigit("Eth54an"));
		System.out.println(isPalendromeRecursive("tacocat"));
		System.out.println(isPalendromeRecursive("tcat"));
		System.out.println(isPalendromeIterative("tacocat"));
		System.out.println(isPalendromeIterative("tacoat"));
		
	}
	
	public static boolean hasDigit(String s)
	{
		int index = 0;
		
		while (index < s.length())
		{
			int x = (int)(s.charAt(index));
			
			if (47 < x && x < 58)
			{
				return true;
			}
			else 
				index += 1;
		}
		return false;
	}
	
	public static boolean isPalendromeRecursive(String s)
	{
		int index = s.length() - 1;
		
		if (s.length() <= 1)
			return true;
		else if (s.charAt(0) == s.charAt(index))
			return isPalendromeRecursive(s.substring(1, index));
		else
			return false;
		
	}
	
	public static boolean isPalendromeIterative(String s)
	{
		int front = 0;
		int end = s.length() - 1;
		
		
		while (front != end)
		{
			if (s.charAt(front) == s.charAt(end))
			{
				front += 1;
				end -= 1;
			}
			else 
				return false;
		}
		return true;
	}
}