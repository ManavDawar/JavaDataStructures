
public class maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze1 = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };
		int dir = 0;
		int r = 0;
		int c = 0;

		while (c >= 0 && c < maze1[0].length && r >= 0 && r < maze1.length) {

			dir = (dir+ maze1[r][c]) % 4;

			if (dir == 0) {
				c++;
			} else if (dir == 1) {
				r++;
			} else if (dir == 2) {
				c--;
			} else if (dir == 3) {
				r--;
			}

		}
		if(dir==0) {
			c--;
		}else if(dir==1) {
			r--;
		}else if(dir==2) {
			c++;
		}else {r++;}
		System.out.println(r + " " + c);
	}

}
