
public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src ="A";
		String des ="B";
		String help="C";
		int n =3;
		hanoi(src,des,help,n);

	}
	public static void hanoi(String src, String des, String help ,int n ) {
		if(n==0) {
			return;
		}
		
		hanoi(src,help,des,n-1);
		System.out.println("move disk no "+ n +" from "+src+" to "+des);
		hanoi(help,des,src,n-1);
		
		
	}

}
