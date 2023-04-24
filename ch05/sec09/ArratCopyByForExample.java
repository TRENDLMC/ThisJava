package ch05.sec09;

public class ArratCopyByForExample {

	public static void main(String[] args) {
		//int 배열 oldintarray를 길이3으로선언
	int [] oldIntArray= {1,2,3};
		//int 배열 newintarray를 길이5으로선언
	int[] newIntArray=new int[5];
	//배열복사
	for(int i=0; i<oldIntArray.length;i++)
	{
		newIntArray[i]=oldIntArray[i];
	}
	//배열출력
	for(int i=0;i<newIntArray.length;i++) {
		System.out.print(newIntArray[i]+",");
	}
	}

}
