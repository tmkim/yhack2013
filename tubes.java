import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class tubes {
    public static void main(String[] args) throws FileNotFoundException {
    	// set the scale of the drawing window
        StdDraw3D.setScale(-1,1);

        // draw a sphere of radius 1 centered at (0,0,0)
        //StdDraw3D.sphere(0, 0, 0, 1);
        //StdDraw3D.wireSphere(0, 0, 0, 1);
        
        Scanner scan = new Scanner(new File("hitae.txt"));
        //StdDraw3D.setPenColor(StdDraw3D.CYAN);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(scan.hasNext())
        	list.add(scan.nextInt());
        
        //draws the tubes for the graph
       for(int x = 0; x < 1500; x+=3)
    	   StdDraw3D.tube(list.get(x)/1000.0f, list.get(x+1)/1000.0f, list.get(x+2)/100.0f, list.get(x+3)/1000.0f, list.get(x+4)/1000.0f, list.get(x+5)/100.0f, 1/100.0f);	
        //StdDraw3D.tube(x1, y1, z1, x2, y2, z2, radius)

        // render to the drawing window
        StdDraw3D.finished();
    }
    
}
