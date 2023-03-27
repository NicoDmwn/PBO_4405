
import java.util.Scanner;

public class Kondisional
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int nilai = inp.nextInt();
        char huruf=' ';

        if(nilai >= 85)
        {
          huruf = 'A';
        }
        else if(nilai >=70  && nilai<85)
        {
          huruf = 'B';
        }
        else if(nilai >=60 && nilai<70)
        {
          huruf = 'C';
        }
        else if(nilai >=40 && nilai<60)
        {
          huruf = 'D';
        }
        else {
          huruf = 'E';
        }
        
        System.out.println("Nilai huruf dari "+nilai+" adalah "+huruf);
        
    }
}