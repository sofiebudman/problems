import java.io.*;
import java.util.StringTokenizer;
public class fencepainting {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
       
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(r.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        if(c>b || d<a){
            pw.print((b-a )+ (d-c));
        }
        else if(c>a){
            pw.print((b-a)+ (c-d) - (b-c));
        }
        else{
            pw.print((b-a)+ (d-c) - (d-a));
        }
        
    

        pw.close();
    }
    
}

//alternate solution
/*
 *import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("paint.in"));
		PrintWriter pw = new PrintWriter("paint.out");

		StringTokenizer st = new StringTokenizer(r.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(r.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int[] cover = new int[100];
		for (int i = a; i < b; i++) { cover[i] = 1; }
		for (int i = c; i < d; i++) { cover[i] = 1; }

		int ans = 0;
		for (int i = 0; i < cover.length; i++) { ans += cover[i]; }
		pw.println(ans);
	
		pw.close();
	}
} 
 *
 */