
import static java.lang.System.exit;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Kumanda kumanda = new Kumanda();
        
        String menu ="Kanal eklemen için 1 e basınız\n"
                + "Kanal silmek için 2 ye basınız\n"
                + "Kanal sayisini öğrenmek için 3 e basınız\n"
                + "Kanalalrı bastirmak için 4 e basınız\n"
                + "Çıkış yapmak için q ya basınız.";
        
       
        while(true){
             System.out.println(menu);
            Scanner input = new Scanner(System.in);
            String deger = input.nextLine();
            switch(deger){
               case "1":
               System.out.print("Kanal ismi giriniz:");
               String kanal = input.nextLine();
               kumanda.kanalEkle(kanal);
                   System.out.println("Kanal başarıyla eklendi");
               break;
           
               case "2":
               System.out.print("Kanal ismi giriniz:");
               String kanal2 = input.nextLine();
               kumanda.kanalSil(kanal2);
               System.out.println("Kanal başarıyla Silindi");
               break;
           
               case "3":
               System.out.println("Kanal sayisi:"+kumanda.kanalSayisi());
               break;
               
               case "4":
               for(String s:kumanda){
                   System.out.println(s);
               }
               break;
               
               case "q":
                   System.out.println("Çıkış yapılıyor...");
               exit(0);
            }
           
        }
    }
    
}
