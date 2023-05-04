package ch16.sec02.exam02;

public class ButtonExample {
	public static void main(String[] args) {
		Button button=new Button();
		
		button.setClickListener(()->{
			System.out.println("OK 버튼을 클릭했습니다");
		});
		// 익명객체 재정의 
		
		button.cl();
		//호출메소드
		Button btnCancel=new Button();
		
		btnCancel.setClickListener(()->{
			System.out.println("Cancel버튼을 클릭했습니다");
		});
		
		btnCancel.cl();
		
	}

}
