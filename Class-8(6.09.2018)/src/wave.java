public class wave {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int i;
		
		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		int row=a.length;
		int col=a[0].length;
		for(i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(a[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
			}
		}
		
		
		
	}

}
