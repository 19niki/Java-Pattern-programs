/*
a1b2c
d3e4f
g5h6i
j7l8m
*/
class Pattern15
{
	public static void main(String[] args) 
	{
		 int i = 1;
		 char ch= 'a';
	   for(int row=4; row>=1;row--)
		{
		  
		   for(int col=5;col>=1;col--)
			{
			   if(col%2==0)
				{
			   System.out.print(i++);
				}
				else
					System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
