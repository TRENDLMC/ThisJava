package ch05.sec07;

public class Tset01 {
	public static void main(String[] args) {
	/*
	arr[0][0][0]=1;
	arr[0][0][1]=4;
	arr[0][1][0]=2;
	arr[0][1][1]=5;
	arr[0][2][0]=3;
	arr[0][2][1]=6;
	arr[1][0][0]=11;
	arr[1][0][1]=14;
	arr[1][1][0]=12;
	arr[1][1][1]=15;
	arr[1][2][0]=13;
	arr[1][2][1]=16;
	arr[2][0][0]=21;
	arr[2][0][1]=24;
	arr[2][1][0]=22;
	arr[2][1][1]=25;
	arr[2][2][0]=23;
	arr[2][2][1]=26;
	*/
	int[][][] arr= new int[3][3][2];
	int z=1;
	int x=0;
	for(int i=0; i<arr.length; i++) {
		for(int k=0; k<arr[i].length;k++) {
			for(int f=0; f<arr[i][k].length; f++) {
				arr[i][k][f] += z;
				z++;
				if( z ==7||z==17 ) {
					z +=4;}		
			}
		}
	}
	for(int i=0; i<arr.length; i++) {
		for(int k=0; k<arr[i].length;k++) {
			for(int f=0; f<arr[i][k].length; f++) {
				System.out.printf(" %2d", arr[i][k][f]);
				x++;
				if(x%3==0) {
					System.out.println();
				}
				if(x%6==0) {
					System.out.printf("--------\n");
					}
				}
			
			}
		}
	}
}

//System.out.println("배열["+i+"]["+k+"]["+f+"]="+arr[i][k][f]);
