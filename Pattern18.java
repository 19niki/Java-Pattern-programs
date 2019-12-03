class Pattern18 
{
	public static void main(String[] args) 
	{
	     for(int row=5; row>=1; row--)
		{
			 int num=1;
			 char ch='a';
			 char sp='+';
			 for (int col=6;col>=1;col--)
			 {
				 if(row==3)
				 { 
                   System.out.print(sp);
				 }
				else if(row%2==0)
				 {
					 System.out.print(ch++); 
				 } 
				 else 
				 {
					 System.out.print(num++);
				 }
			 }
			 System.out.println();

			
		}
	}
}
