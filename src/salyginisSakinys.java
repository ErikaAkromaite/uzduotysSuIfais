import java.util.Scanner;

public class salyginisSakinys {

    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("sk1 ");
        int x = skaitytuvas.nextInt();
        System.out.println("sk2 ");
        int y = skaitytuvas.nextInt();
        System.out.println(lyginisNelyginis  (x,y));
}
 public static int lyginisNelyginis (int x, int y){

    if (x % 2 == 0) {
        return x * y;
    }
    else if (y > 100) {
            return y - x;
        }
    else if (y < 100){
        return x - y;
    }
    else {
        return 0;
    }
  }
}
