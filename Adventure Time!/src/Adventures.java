import java.util.Scanner;

public class Adventures {
			static int[][] Map = new int[10][10];

	
	public static void create(){
		for (int county =0; county < 10;county++ ){
			for(int countx =0; countx <10; countx++){
				Map[county][countx] = (int) Math.round(Math.random()*3);
				
				}
			}
		
		Map[(int)Math.round(Math.random()*9)][(int)Math.round(Math.random()*9)] = 5;
		
	}
	public static int findEndy(){
		int endy = 0;
		for (int county =0; county < 10;county++ ){
			for(int countx =0; countx <10; countx++){
			if(	Map[county][countx] == 5){
				endy = county;
			}
				
				}
			}
		return endy;
		
	}
	public static int findEndx(){
		int endx = 0;
		for (int county =0; county < 10;county++ ){
			for(int countx =0; countx <10; countx++){
			if(	Map[county][countx] == 5){
				endx = countx;
			}
				
				}
			}
		return endx;
		
	}

	public static String[] render(int Posx,int Posy){
		
		String [] render = new String[4]; 
		if (Posx == 0){ render[1] = "A void";}
		else{	
			switch (Map[Posy][Posx -1 ]){
		
		
			case 0 : render[0] = "A forest";break;
			case 1 : render[0] = "A swamp";break;
			case 2 : render[0] = "A hill";break;
			case 3 : render[0] = "A desert";break;
			case 5 : render[0] = "A door";break;
			default : render[0] = "The void";break;
			}
		}
		if (Posy == 0){ render[1] = "A void";}
		else{	
			switch (Map[Posy -1 ][Posx  ]){
				
		
			case 0 : render[1] = "A forest";break;
			case 1 : render[1] = "A swamp";break;
			case 2 : render[1] = "A hill";break;
			case 3 : render[1] = "A desert";break;
			case 5 : render[1] = "A door";break;
			default : render[1] = "The void";break;
			}
		}
		if (Posx == 9){ render[1] = "A void";}
		else{
			switch (Map[Posy][Posx +1 ]){
		
		
			case 0 : render[2] = "A forest";break;
			case 1 : render[2] = "A swamp";break;
			case 2 : render[2] = "A hill";break;
			case 3 : render[2] = "A desert";break;
			case 5 : render[2] = "A door";break;
			default : render[2] = "The void";break;
			}
		}
		if (Posy == 9){ render[1] = "A void";}
		else{
			switch (Map[Posy +1][Posx  ]){
		
		
		
			case 0 : render[3] = "A forest";break;
			case 1 : render[3] = "A swamp";break;
			case 2 : render[3] = "A hill";break;
			case 3 : render[3] = "A desert";break;
			case 5 : render[3] = "A door";break;
			default : render[3] = "The void";break;
			}
		}
		
				return render;
	}	
	public static void gamerun(){
		int playery =1;
		int playerx =1;
		int endy = Adventures.findEndy();
		int endx = Adventures.findEndx();
		boolean win = false;
		Scanner input = new Scanner(System.in);
		String[] description = new String[4];
		String Direction = new String();
		
		while(!win){
			
			description = Adventures.render(playery,playerx);
			
			System.out.println("To the west is " + description[0]+" To the north is " + description[1]+" To the east is " + description[2]+" To the south is " + description[3]);
			
			System.out.println("Which way would you like to go?.");
			
			Direction = input.next();
			if (Direction .equals( "west") && playerx > 0){
				playerx-=1;
			}else
			if (Direction .equals( "north") && playery > 0){
				playery-=1;
			}else
			if (Direction .equals( "east") && playerx < 9){
				playerx= playerx +1;
			}else
			if (Direction .equals( "south") && playery < 9){
				playery+=1;
			}else{System.out.println("you cant go that way");}
			
			
			
			if (playery == endy && playerx == endx){win = true;}
			
		}
	}
			
	public static void main(String[] args) {
		Adventures.create();
		
		Adventures.gamerun();
		
		System.out.println("You Win!");

	}
 
 
 
 }

