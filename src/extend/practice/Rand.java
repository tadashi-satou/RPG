package extend.practice;

import java.util.Random;

public class Rand {
	  private static Random r = new Random();

	  public static int get(int w) {
	    return r.nextInt(w);
	  }

}
