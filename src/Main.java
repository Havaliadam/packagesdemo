import matematik.Dortislem;
import matematik.Logaritma;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("adınız:");
String isim=sc.nextLine();

System.out.println("merhaba:"+isim);
        Dortislem dortislem=new Dortislem();

        dortislem.topla(2,3);
        Logaritma logaritma=new Logaritma();

    }
}
