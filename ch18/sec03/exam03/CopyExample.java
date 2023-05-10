package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
public static void main(String[] args)throws Exception {
	String originalFileName="C:/Temp/[오펜하이머] 메인 예고편 (HD).mp4";
	String targetFIleName="C:/Temp/[오펜하이머] 메인 예고편 (HD)2.mp4";
	
	InputStream is=new FileInputStream(originalFileName);
	OutputStream os=new FileOutputStream(targetFIleName);
	
	byte[] data=new byte[1024];
	 while(true) {
		 int num=is.read(data);
		 if(num==-1) {break;}
		 os.write(data,0,num);
	 }
	 os.flush();
	 os.close();
	 is.close();
	System.out.println("복사가 잘되었습니다");
	}
}
