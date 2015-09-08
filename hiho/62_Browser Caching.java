import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Test {
    public static final boolean DEBUG = false;// I/O through console if debugging
    public static final boolean STDOUT = true;
    public static final boolean STDINPUT = false;
    private static String file;
    private static FileInputStream in;
    private static PrintStream out;
    private static InputStream keepin;
    private static PrintStream keepout;
    public static void main(String[] args){
        file="in";
        if(!DEBUG){
            try{
                redirectStream();
            }catch(Exception e){
                return;
            }
        }
        
        // below is related to concrete problems
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
            solve(sc);
        }
    }
    
    // solve is for solving a single case
    public static void solve(Scanner sc){
        int N=sc.nextInt();
        int M=sc.nextInt();
        HashMap<String, Integer> lastVisit = new HashMap<String, Integer>(M);
        String[] memIndex = new String[N];
        int start=0;
        int cacheCnt=0;
        for(int i=0;i<N;i++){
            memIndex[i] = sc.next();
        }
        for(int i=0;i<N;i++){
            if(lastVisit.containsKey(memIndex[i]) && lastVisit.get(memIndex[i])>=start){
                System.out.println("Cache");
            }else{
                cacheCnt++;
                if(cacheCnt > M){
                    start++;
                }
                System.out.println(cacheCnt);
                System.out.println("Internet");
            }
            lastVisit.put(memIndex[i], i);
            while(start!=lastVisit.get(memIndex[start])){
                start++;
            }
        }
    }
    
    public static void redirectStream() throws Exception{
        if(file != null){
            keepin = System.in;
            keepout = System.out;
            if(!STDINPUT){
                in = new FileInputStream(file+".in");
                System.setIn(in);
            }
            if(!STDOUT){
                out = new PrintStream(new FileOutputStream(file+".out"));
                System.setOut(out);
            }
        }
    }
    
    public static void resetStream(){
        if(keepin !=null && keepout != null){
            in = null;
            out = null;
            System.setIn(keepin);
            System.setOut(keepout);
        }
    }
    
    
    public static void print(double[] res){
        for(double i:res){
            System.out.print(i+",");
        }
        System.out.println();
    }
    public static void print(int[] res){
        for(int i:res){
            System.out.print(i+",");
        }
        System.out.println();
    }
    public static void print(int res){
         System.out.println(res);
    }
    public static void print(String res){
         System.out.println(res);
    }
    public static void print(List<List<String>> ll){
        int i=0;
        for(List<String> l:ll){
            System.out.println("case " + i++);
            for(String s:l){
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
//另附N皇后问题的构造解法 http://blog.sina.com.cn/s/blog_49f9e4fc0100c6n4.html