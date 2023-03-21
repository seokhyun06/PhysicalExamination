package sungil2023_03_16;

class PhysicalExamination {
	static final int VMAX = 21; // 시력의 분포(0.0부터 0.1 단위로 21개)	
	static class PhyscData {
		String name; // 이름
		int height; // 키
		double vision; // 시력
		
		//--- 생성자(Constructor) ---
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// --- 키의 평균값을 구함 --- //
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for(int i = 0; i < dat.length; i++)
			sum += dat[i].height;
		return sum / dat.length; 
	}
	
	// --- 시력의 분포를 구함 --- //
	static void disVision(PhyscData[] dat, int[] dist) {
		for(int j = 0; j < dist.length; j++)
			dist[j] = 0;
		for(int i = 0; i < dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision < VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	public static void main(String[] args) {

		PhyscData[] X = {
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("박준서", 175, 2.0),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("황지안", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX];
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름     키    시력");
		System.out.println("================");
		for(int i = 0; i < X.length; i++)
			System.out.printf("%-6s%3d%5.1f\n", X[i].name, X[i].height, X[i].vision);
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(X));
		
		disVision(X, vdist);
		System.out.println("\n시력 분포");
		for(int i = 0; i < VMAX; i++)
			System.out.printf("%3.1f ~ : %2d명\n", i / 10.0, vdist[i]);
	}

}
