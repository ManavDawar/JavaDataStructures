
public class spiraldisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 11, 12, 13, 14,15 }, { 21,22,23,24,25 }, { 31,32,33,34,35 } };

		int i,j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		 int c=0,r=0,er=a.length-1,ec=a[0].length-1;
		 int cntr=1;
		 int tne=a.length*a[0].length;
		 while(cntr<=tne) {
			 for(i=r;i<=er&&cntr<=tne;i++) {
				 System.out.print(a[i][c]+" ");
				 cntr++;
			 }
			 c++;
			 for(j=c;j<=ec&&cntr<=tne;j++) {
				 System.out.print(a[er][j]+" ");
				 cntr++;
			 }
			 er--;
			 
			 for(i=er;i>=r&&cntr<=tne;i--) {
				 System.out.print(a[i][ec]+" ");
				 cntr++;
			 }
			 ec--;
			 
			 for(j=ec;j>=c&&cntr<=tne;j--) {
				 System.out.print(a[r][j]+" ");
				 cntr++;
			 }
			 r++;
			 
		 }
		


	}

}
