

public class Adventures {
	static boolean win = false;
	static Map Mapname = new Map();
	static int playery =1;
	static int playerx =1;
	static String message = new String();
	
	public static String renderplace(int place, int place2){
		String placetype;
		switch (place){
		
		
		case 0 :  placetype = "forest";break;
		case 1 :  placetype = "swamp";break;
		case 2 :  placetype = "hill";break;
		case 3 :  placetype = "desert";break;
		case 5 :  placetype = "door";break;
		default : placetype = "The void";break;
		
		}
		placetype = "a"+ renderDescription(place2) + placetype;
		return placetype;
		
	}
	public static String renderDescription(int place){
		String Adjective;
		switch (place){
		
		
		case 0 :  Adjective = "n ancient ";break;
		case 1 :  Adjective = " beautiful ";break;
		case 2 :  Adjective = " compact ";break;
		case 3 :  Adjective = "n exciting ";break;
		case 4 :  Adjective = " fantastic ";break;
		case 5 :  Adjective = " fascinating ";break;
		case 6 :  Adjective = " huge ";break;
		case 7 :  Adjective = " picturesque ";break;
		case 8 :  Adjective = " foggy ";break;
		case 9 :  Adjective = " bright ";break;
		case 10 :  Adjective = " frozen ";break;
		
		default : Adjective = " endless ";break;
		
		}
		return Adjective;
		
	}
	
	public static String[] render(int Posx,int Posy){
		
		String [] render = new String[4]; 
		if (Posx == 0){ render[0] = "A void";}
		else{	
			render[0] = renderplace(Map.Map[Posy ][Posx -1 ][0],Map.Map[Posy ][Posx -1  ][1]); 
			
		}
		if (Posy == 0){ render[1] = "A void";}
		else{	
			render[1] = renderplace(Map.Map[Posy -1 ][Posx   ][0], Map.Map[Posy -1 ][Posx  ][1]); 
		}
		if (Posx == Map.xBegin-1){ render[2] = "A void";}
		else{
			render[2] = renderplace(Map.Map[Posy ][Posx +1  ][0],Map.Map[Posy ][Posx +1  ][1]); 
		}
		if (Posy == Map.yBegin-1){ render[3] = "A void";}
		else{
			render[3] = renderplace(Map.Map[Posy +1][Posx   ][0],Map.Map[Posy +1 ][Posx   ][1]); 
		}
		
				return render;
	}	
	public static String renderDisplay(){
		Adventures.render(playerx,playery);
	
		return message;
	}
	
	public static String gamerun(String Direction){
		
		int endy = Map.findEndy(Map.yBegin,Map.xBegin);
		int endx = Map.findEndx(Map.yBegin,Map.xBegin);
		
	
		String[] description = new String[4];
		
		
			
			
			
			
			
			
			Direction = Direction.toLowerCase();
			if (Direction .equals( "west") && playerx > 0){
				playerx--;
			}
			else if (Direction .equals( "north") && playery > 0){
				playery--;
			}
			else if (Direction .equals( "east") && playerx < Mapname.xBegin-1){
				playerx++;
			}
			else if (Direction .equals( "south") && playery < Mapname.yBegin-1){
				playery++;
			}
			else{
				Gui.input.setText("you cant go that way");}
			
			
			
			if (playery == endy && playerx == endx){
				win = true;
			Gui.input.setText("You Win! click enter to exit");
			
			}
description = Adventures.render(playerx,playery);
			
			message = "<html>To the west is " + description[0]+" To the north is <br>"+description[1] + " " + " To the east is " + description[2]+" To the south is " + description[3]+"</html>";
			
			Gui.outdisplay.setText(message);
		
		return message;
	}
	
 
 
 
 }

