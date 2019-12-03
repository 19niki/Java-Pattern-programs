/*
12345
abcde
12345
abcde
12345
*/

class Pattern13
{
	public static void main(String[] args) 
	{
      for(int row=5;row>=1;row--)
		{
		  int i=1;
		  char c='a';
		  for(int col=5; col>=1;col--)
			{
			  if(row%2==0)
				{
				  System.out.print(c++);
				}
				else
					System.out.print(i++);
			}
			System.out.println();
		}
	}
}
