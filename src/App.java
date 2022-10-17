import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        List l = new List();
        /* int numeroDiTest = 100;
        int saltiTot = 0;
        for(int i = 0; i < numeroDiTest; i++){
            saltiTot += l.inserisciInMezzoContato((int)(Math.random() * 90));
        }
        double media = saltiTot / numeroDiTest;
        System.out.println(l.toString());
        System.out.println(media); */

        l.inserisciInMezzo(new int[]{1, 2, 3, 4, 5, 6});
        //l.rendiCircolare();
        System.out.println(l);
        
        
    }
}
