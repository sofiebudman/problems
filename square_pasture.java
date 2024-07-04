import java.io.*;
import java.util.StringTokenizer;
public class square_pasture {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());
        int width;
        int length;
        if(x1>x3){
            if(x2 > x4){
                width = x2-x3;
            }
            else{
                width = x4-x3;
            }

        }
        else {
            if(x2 > x4){
                width = x2-x1;
            }
            else{
                width = x4-x1;
            }

        }
        
        if(y1>y3){
            if(y2 > y4){
                length = x2-x3;
            }
            else{
                length = x4-x2;
            }

        }
        else{
            if(y2 > y4){
                length = y2-y1;
            }
            else{
                length = y4-y1;
            }


        }

        if(width >length){
            pw.print(Math.pow(width,2));
        }
        else{
            pw.print(Math.pow(width,2));

        }
        pw.close();
        
    }
    
}

//solution
/* 
import java.io.*;
import java.util.*;

public class Square {
	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio("square");
		int x1 = io.nextInt(), y1 = io.nextInt();
		int x2 = io.nextInt(), y2 = io.nextInt();
		int x3 = io.nextInt(), y3 = io.nextInt();
		int x4 = io.nextInt(), y4 = io.nextInt();
		// find the sides of the smallest rectangle covering both pastures
		int left = Math.min(x1, x3);
		int right = Math.max(x2, x4);
		int bottom = Math.min(y1, y3);
		int top = Math.max(y2, y4);
		
		 * the smallest square will need a side length
		 * that is the maximum of the side lengths of the rectangle
		 
		int side = Math.max(right - left, top - bottom);
		io.println(side * side);
		io.close();
	}

	Code Snippet: Kattio (Click to expand)
}
*/