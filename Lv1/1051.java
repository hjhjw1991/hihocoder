import java.util.Scanner;
	
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
        	int cases = in.nextInt();
            int[] res = new int[cases];
        	while(cases>0){
                int n = in.nextInt();
                int m = in.nextInt();
                int[] ab = new int[n+2];
                ab[0]=0;
                ab[n+1]=101;
                int i=0,max=0;
                for(i=1;i<=n;i++){
                    ab[i] = in.nextInt();
                }
                if(m>=n){
                    res[cases-1]=100;
                    cases--;
                    continue;
                }
                for(i=0;i<n-m+1;i++){
                    max=max>ab[i+m+1]-ab[i]?max:ab[i+m+1]-ab[i];
                }
                res[cases-1]=max-1;
                cases--;
        	}
            for(int i=res.length-1;i>=0;i--){
                System.out.println(res[i]);
            }
        }
    }
}