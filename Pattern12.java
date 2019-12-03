/*
11111
22222
33333
44444
*/

class Pattern12 
{
	public static void main(String[] args) 
	{ 
		int i=1;
		for(int row=4;row>=1;row--)
		{
			for(int col=5;col>1;col--)
			{
				System.out.print(i);
			}
			System.out.println();
			i++;
		}
	}
}
