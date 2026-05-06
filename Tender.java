import java.util.*;

class T{
    String c; float cost;
    void i(Scanner s){ c=s.next(); cost=s.nextFloat(); }
}

public class Main{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        T[] t=new T[5];
        for(int i=0;i<5;i++){ t[i]=new T(); t[i].i(s); }

        int m=0;
        for(int i=1;i<5;i++)
            if(t[i].cost<t[m].cost) m=i;

        System.out.println(t[m].c+" "+t[m].cost);
    }
}