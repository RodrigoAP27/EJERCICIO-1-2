import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] datos=new int[5];
        datos[0]=sc.nextInt();
        datos[1]=sc.nextInt();
        datos[2]=sc.nextInt();
        datos[3]=sc.nextInt();
        datos[4]=sc.nextInt();

        for (int i=0;i<datos.length;i++){
            System.out.println((0+i)+ ":"+datos[i]);
        }
        System.out.println();
        System.out.println("la longitud de arrray es "+datos.length);
        System.out.println("el primer valor es "+ datos[0]);
        System.out.println("el ultimo valor es "+datos[4]);




    }
}





