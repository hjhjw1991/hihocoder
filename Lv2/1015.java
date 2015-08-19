import java.util.Scanner;
	
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
        	int n=in.nextInt();
        	while(n>0){
        	    String pattern = in.next();
        	    String original = in.next();
        	    System.out.println(isMatch(original,pattern));
        	    n--;
        	}
        }
    }
    public static int isMatch(String original, String pattern){
        int[] next = calNext(pattern);
        int count = 0;
        int q=0,p=0;
        while(p<original.length()){
            while(q>=0 && original.charAt(p) != pattern.charAt(q)){
                q=next[q];
            }
            p++;
            q++;
            if(q==pattern.length()){
                count+=1;
                q=next[q];
            }
        }
        return count;
    }
    public static int[] calNext(String pattern){
        int length = pattern.length();
        int[] next=new int[length+1];
        next[0]=-1;
        int p=0,q=-1;
        while(p<length){
            while(q>=0 && pattern.charAt(p)!=pattern.charAt(q)){
                q=next[q];
            }
            p++;
            q++;
            next[p]=q;
        }
        return next;
    }

}