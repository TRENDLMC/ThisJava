package ch06.sec12.hyundai;

import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	ch06.sec12.hankook.Tire tire1=new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2=new ch06.sec12.kumho.Tire();
	//같은 이름의 class를 가져올떄는 구분을 확실하기 위해 정확한 경로를 기입해준다 
	ch06.sec12.hankook.SnowTire tire3=new ch06.sec12.hankook.SnowTire();
	//자세하게경로를 지정해주면 import를 하지않아도된다
	AllSeasonTire tire4=new AllSeasonTire();
}
