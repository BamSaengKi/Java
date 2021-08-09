
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1 ;
		double b = 1;
		double b2 = (double) 1;  //명시적
		
		System.out.println(b);
		
		//int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		
		System.out.println(e);
		
		String f = Integer.toString(1);   // .to-- --타입으로 변환
		System.out.println(f.getClass()); // .getClass => 데이터타입 검사

	}

}
