import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Squarepoint {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in,pt1,pt2; //input line, point 1, point 2
		double xb1,xb2,yb1,yb2,x,y,minDist; //rectangle bounds, input point, answer
		
		HashMap<String,Double> xVals = new HashMap<String,Double>(); //store x coords by letter
		HashMap<String,Double> yVals = new HashMap<String,Double>(); //store y coords by letter
		xVals.put("A",2.0); 	xVals.put("B",11.0); 	xVals.put("C",7.0);
		xVals.put("D",1.0); 	xVals.put("E",5.0); 	xVals.put("F",5.0);
		xVals.put("G",0.0); 	xVals.put("H",9.0); 	xVals.put("I",7.0);
		
		yVals.put("A",3.0); 	yVals.put("B",6.0); 	yVals.put("C",11.0);
		yVals.put("D",10.0); 	yVals.put("E",16.0); 	yVals.put("F",6.0);
		yVals.put("G",40.0); 	yVals.put("H",9.0); 	yVals.put("I",0.0);
		
		while(true) {
			System.out.print("Enter the input:");
			in = br.readLine();
			in.trim();
			pt1 = in.substring(0,1);
			in = in.substring(2).trim();
			pt2 = in.substring(0,1);
			in = in.substring(2).trim();
			x = Double.parseDouble(in.substring(0,in.indexOf(",")));
			in = in.substring(in.indexOf(",")+1).trim();
			y = Double.parseDouble(in); //get data
			
			minDist = Double.MAX_VALUE;
			xb1 = Math.min(xVals.get(pt1),xVals.get(pt2));
			xb2 = Math.max(xVals.get(pt1),xVals.get(pt2));
			yb1 = Math.min(yVals.get(pt1),yVals.get(pt2));
			yb2 = Math.max(yVals.get(pt1),yVals.get(pt2)); //initialize bounds
			
			//CHECK IF BOUNDED BY CORNERS
			if(x >= xb1 && x <= xb2) { //check x bounds
				minDist = Math.min(Math.abs(y - yb1), minDist);
				minDist = Math.min(Math.abs(y - yb2), minDist);
			} //end x bound check
			if(y >= yb1 && y <= yb2) { //check y bounds
				minDist = Math.min(Math.abs(x - xb1), minDist);
				minDist = Math.min(Math.abs(x - xb2), minDist);
			} //end y bound check

			//IF WAY AWAY FROM CORNERS
			if(minDist == Double.MAX_VALUE) { //if its not bounded either way (i.e., unchecked)
				if(x > xb2 && y > yb2) //Quadrant 1
					minDist = Math.sqrt(Math.pow(x - xb2,2) + Math.pow(y - yb2,2));
				else if(x < xb1 && y > yb2) //Quadrant 2
					minDist = Math.sqrt(Math.pow(x - xb1,2) + Math.pow(y - yb2,2));
				else if(x < xb1 && y < yb1) //Quadrant 3
					minDist = Math.sqrt(Math.pow(x - xb1,2) + Math.pow(y - yb1,2));
				else //Quadrant 4
					minDist = Math.sqrt(Math.pow(x - xb2,2) + Math.pow(y - yb1,2));
			}
			System.out.println(minDist);
		}
	}
}
