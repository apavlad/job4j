package ru.job4j.pojo;

public class Sequence {

    public static int[] m = {1,2,2,3,4,4,4,4,5};
    public static int pCh[] = new int[m.length];
    public static int ts;
    public static int[] n = new int[m.length];

    public static void main(String[] args) {
        int k = 0, ch;
        for(ts = 0; ts<m.length; ts++){
            if (!povtor(ch=m[ts])){
                ch=m[ts];
                for(int ts2=0;ts2<m.length;ts2++)
                    if(m[ts2]==ch){
                        n[k]=ts2+1;
                        k++;
                    }
                if (k>2){
                    System.out.print("Последовательность одинаковых чисел более 3-х в позиции");
                    for(int a=0;a<k;a++) System.out.print(" "+n[a]);
                    System.out.println(": "+ch);
                }
                k=0;
                pCh[ts]=ch;
            }

        }
    }

    static boolean povtor(int x){
        for(int a = 0; a<ts;a++){
            if (pCh[a]==x) return true;
        }
        return false;
    }
}
