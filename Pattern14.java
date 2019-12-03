/*
edcba
54321
edcba
54321
edcba
*/


class Pattern14 
{
	public static void main(String[] args) 
	{
	  for( int row=5; row>=1; row--)
		{
		  char ch='e';
		  int num= 5;
		  for(int col=5;col>=1;col--)
			{
			  if(row%2==0)
				{
				  System.out.print(ch--);
				}
				else
					System.out.print(num--);
			}
			System.out.println();
		}
	}
}
