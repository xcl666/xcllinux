public class exercise7_12
{
public static void main(String[] args) {
    loop(10);
}

public static void loop(int n) {
    int i = n;
    System.out.println("Start[i]	End[i]");
    while(i>0) {
        System.out.print(i);
        if(i%2 == 0) {
            i = i / 2;
        } else{
            i = i + 1;
        }
        System.out.println("\tNow i is "+i);
    }
}
}
