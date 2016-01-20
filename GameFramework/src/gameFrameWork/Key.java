package gameFrameWork;

public class Key {

	public static Key up = new Key();
	   public static Key down = new Key();
	   public static Key left = new Key();
	   public static Key right = new Key();
	   public static Key special = new Key();

	   /* toggles the keys current state*/
	   public void toggle(){
	       isDown =  !isDown;
	   }

	   public boolean isDown;
	   
}
//credit to Shaun Wild 