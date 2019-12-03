/*
1
ab
123
abcd
*/

class Pattern20 
{
	public static void main(String[] args) 
	{    int n=4;
		for(int row=0; row<n; row++)
		{
			int k=1;
			char ch='a';
			for(int col=0; col<n; col++)
			{
				if(row>=col)
				{
				if(row%2==0)
				{
				System.out.print(k++);
				}
				else
					System.out.print(ch++);
			}
			}
			System.out.println(" ");
		}
	}
}
