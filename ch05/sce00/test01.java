package ch05.sce00;

public class test01 {
	public static void main(String[] args) {
		double result=Calculate(10,2.5 ,'+');
	}
		static double Calculate(double x,double y,char a) {
		double r=0;
		if(a=='*'){
			r=x*y;
		}else if(a=='+'){
			r=x+y;
		}else if(a=='/'){
			r=x/y;
		}else if(a=='-'){
			r=x-y;
		}else if(a=='%'){
			r=x%y;
		}else {
			System.out.println("연산자의기호가틀렸습니다.");
			return 0;
		}
		System.out.println(x+""+a+y+":값의은"+r+"입니다");
		return r;
	}
}