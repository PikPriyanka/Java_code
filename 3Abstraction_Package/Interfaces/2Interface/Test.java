package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {   
	public static void main(String args[]){
	   Veena v = new Veena();
	   Saxophone s = new Saxophone();
	   Playable pv = new Veena();
	   Playable ps = new Saxophone();
	   
	   v.play();
	   s.play();
	   pv.play();
	   ps.play();
	}
}
