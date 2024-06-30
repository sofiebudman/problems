import java.io.*;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/231/A 
public class team {
    public static void main (String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] problems = new int[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(r.readLine());
            for (int j = 0; i <3 ; i++){
                if(Integer.parseInt(st.nextToken()) == 1){
                    problems[i] +=1;
                }

            }

        }
        int output = 0;
        for (int k = 0; k < n; k++){
            if(problems[k] >=2){
                output +=1;
            }
        }
        pw.print(output);
        pw.close();

    }
    
}
