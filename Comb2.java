class Comb2 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0; i<n;i++)
		{ 
			int k=1;
			for(int j=0; j<n; j++)
			{
               if(i>=j)
				{
				   System.out.print(k++);
				}
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			int l = k-1;
			for(int j=0; j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(l++);
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
