class Pattern2 
{
	public static void main(String[] args) 
	{
	int row=1;
	while (row<=6)
	{	
	int	col=1;
	while (col<=row)
	{
		System.out.print("*");
		col++;
	}
	System.out.println();
	row++;
	}
	}
}
