
public class Map {
	static int yBegin = (int) Math.round(Math.random()*8)+2;
	 static int xBegin = (int) Math.round(Math.random()*8)+2;
		static int[][][] Map = new int[yBegin][xBegin][2];

	
	public Map(){
		
		
	}
	
	public static void create(){
		for (int county =0; county < yBegin;county++ ){
			System.out.println();
			for(int countx =0; countx < xBegin; countx++){
				Map[county][countx][0] = (int) Math.round(Math.random()*3);
				Map[county][countx][1] = (int) Math.round(Math.random()*10);
				
				
				}
			}
		
		Map[(int)Math.round(Math.random()*yBegin-1)][(int)Math.round(Math.random()*xBegin-1)][0] = 5;
		
				
				
			
		
	}
	public static int findEndy(int countyEnd, int countxEnd){
		int endy = 0;
		for (int county =0; county < countyEnd;county++ ){
			for(int countx =0; countx <countxEnd; countx++){
			if(	Map[county][countx][0] == 5){
				endy = county;
			}
				
				}
			}
		return endy;
		
	}
	public static int findEndx(int countyEnd, int countxEnd){
		int endx = 0;
		for (int county =0; county < countyEnd;county++ ){
			for(int countx =0; countx <countxEnd; countx++){
			if(	Map[county][countx][0] == 5){
				endx = countx;
			}
				
				}
			}
		return endx;
		
	}


}
