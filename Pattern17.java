/*
1 0 1 0
1 0 1 0
1 0 1 0
1 0 1 0
*/

class Pattern17
{
	public static void main(String[] args) 
	{   //int i=1,j=0;
	   for(int row=4; row>=1; row--)
		{
		   for(int col =4;col>=1;col--)
			{
                if(col%2==0)
				{
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
