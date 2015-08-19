import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static class TrieNode{
        Map<Character,TrieNode> children;
        int cnt;
        public TrieNode(){
            cnt=1;
            children=new HashMap<Character,TrieNode>();
        }
    }
    public static void main(String argv[]){
        TrieNode root=new TrieNode();
        TrieNode current,t;
        int wordnum,i,j;
        char c;
        String word=null;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            wordnum = in.nextInt();
            String[] trie=new String[wordnum];
            for(i=0;i<wordnum;i++){
                trie[i]=in.next();
            }
            wordnum = in.nextInt();
            String[] prefix=new String[wordnum];
            for(i=0;i<wordnum;i++){
                prefix[i]=in.next();
            }
            
            for(i=0;i<trie.length;i++){
                word=trie[i];
                current=root;
                for(j=0;j<word.length();j++){
                    c=word.charAt(j);
                    t=current.children.get(c);
                    if(t==null){
                        t=new TrieNode();
                        current.children.put(c,t);
                    }else{
                        t.cnt++;
                    }
                    current=t;
                }
            }
            int[] output=new int[prefix.length];
            for(i=0;i<prefix.length;i++){
                word=prefix[i];
                current=root;
                t=null;
                for(j=0;j<word.length();j++){
                    c=word.charAt(j);
                    t=current.children.get(c);
                    if(t==null){
                        output[i]=0;
                        break;
                    }
                    current=t;
                }
                if(t!=null){
                    output[i]=t.cnt;
                }
            }
            for(i=0;i<output.length;i++){
                System.out.println(output[i]);
            }
        }
    }
}