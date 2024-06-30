import java.io.*;
import java.util.StringTokenizer;
//https://cses.fi/problemset/task/1068
public class weirdalgorithm {
    public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
		int number = Integer.parseInt(st.nextToken());
		while(number != 1){
			pw.print(number + " ");
			if (number %2 == 0){
				number/=2;
				
				
			}
			else{
				number = number*3;
				number = number +1;
				
			}
		}
		pw.close();
		
	}
    
    
}



//runtime: 0.13s, 