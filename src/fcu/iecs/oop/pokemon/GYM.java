package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random ran = new Random();
       
        if(ran.nextInt(2)+1==1){
        	p1.setCp(500);
        	System.out.println("\"Winner is ["+p1.getName()+"].\"");
        }
        else{
        	p2.setCp(500);
        	System.out.println("\"Winner is ["+p2.getName()+"].\"");
        }
	}
}
