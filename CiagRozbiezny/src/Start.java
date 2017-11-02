/**
 *
 * @author HelBlar
 */
import java.util.Scanner;// importowanie biblioteki do obsługi scanera
public class Start {
    public static void main(String[] args) {
       int i=0,iSuma=0;
       int iIloscWyrazowCiagu=1;
       Scanner scOdczyt = new Scanner(System.in);// utworzenie obiektu "odczyt" (typu Scanner) do wczytywania danych z klawiatury
       System.out.print("Podaj ilość elementów ciągu rozbieżnego (1-2+3-4...+n-m): ");
       iIloscWyrazowCiagu=scOdczyt.nextInt();
       
       for( i=0; i<=iIloscWyrazowCiagu ;i++){
           //
           if (i%2==0){
               iSuma-=i;
               
           }else{
               iSuma+=i;
           }
       }
       System.out.println("Suma "+iIloscWyrazowCiagu+" wyrazów ciągu wynosi: "+iSuma);
    }
    
}
