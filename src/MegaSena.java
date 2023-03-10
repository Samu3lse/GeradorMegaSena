import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {

        int n , i , j ;

        int [] mega = new int[6];

        Random r  = new Random();
        for (i = 0 ; i < mega.length ; i++){
            n = r.nextInt(60) + 1;

            for (j = 0 ; j < mega.length ; j++){

                if(n == mega[j] && j != i ){
                        n = r.nextInt(60) + 1;

                }else {
                    mega[i] = n;
                }
            }
        }

        for ( i = 0 ; i < mega.length ; i++) {
            for (j = i + 1 ; j < mega.length ; j++){
                if ( mega[i] > mega[j]){
                    n = mega[i];
                    mega[i] = mega[j];
                    mega[j] = n;
                }
            }
        }

        System.out.println("Numeros da Mega Sena");

        for ( i = 0 ; i < mega.length ; i++) {
            System.out.println(mega[i]);
        }
    }
}
