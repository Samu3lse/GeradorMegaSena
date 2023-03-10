#   MegaSena gerador de números

### Beginning
````
import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {

        int n , i , j ;

        int [] mega = new int[6];

````
###  Instanciação da classe Random para gerar os números.

````
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
````

### Loop responsável por organizar os números em ordem crescente.

````
 for ( i = 0 ; i < mega.length ; i++) {
            for (j = i + 1 ; j < mega.length ; j++){
                if ( mega[i] > mega[j]){
                    n = mega[i];
                    mega[i] = mega[j];
                    mega[j] = n;
                }
            }
        }
````

### Output dos números gerados.
````
       for ( i = 0 ; i < mega.length ; i++) {
            System.out.println(mega[i]);
        }
    }
}
````