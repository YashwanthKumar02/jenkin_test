public class BigofThree{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int ans = (a>c)?(a>b?a:b) : (b>c?b:c);
		System.out.println(ans);
	}
}
