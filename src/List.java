public class List {
    private Node testa;
    private Node coda;

    public boolean vuota(){
        return testa == null;
    }

    private boolean ultimo(Node e){
        return e == testa;
    }
    
    public void inserisciInCoda(int val){
        if(vuota()) {
            inserisciInTesta(val);
            return;
        }
            
        
        Node tmp = testa;
        while(!ultimo(tmp.next)){
            tmp = tmp.next;
        }
        
        tmp.next = new Node(val);
    }

    public void inserisciInTesta(int val){
        if(vuota()){
            testa = new Node(val);
            testa.next = testa;
            return;
        }

        testa = new Node(val, testa);
        Node tmp = testa;
        while(!ultimo(tmp.next)){
            tmp = tmp.next;
        }
        tmp.next = testa;
        
    }

    public void inserisciInMezzo(int val) {
        if(vuota() || testa.inf > val){
            inserisciInTesta(val);
            return;
        }


        Node tmp = testa;
        while(!ultimo(tmp.next)){
            if(tmp.inf <= val && tmp.next.inf > val){
                tmp.next = new Node(val, tmp.next);
                return;
            }
            tmp = tmp.next;
        }

        inserisciInCoda(val);
     }
    
    //ricevi un vettore di interi e popola la lista con il vettore
    public void inserisciInMezzo(int[] val){
        for(int i = 0; i < val.length; i++){
            inserisciInMezzo(val[i]);
        }
    }

    public int inserisciInMezzoContato(int val) {
        if(vuota() || testa.inf > val){
            inserisciInTesta(val);
            return 1;
        }

        int salti = 1;

        Node tmp = testa;
        while(!ultimo(tmp.next)){
            if(tmp.inf <= val && tmp.next.inf > val){
                tmp.next = new Node(val, tmp.next);
                return salti;
            }
            salti++;
            tmp = tmp.next;
        }

        inserisciInCoda(val);
        return salti;
    }


    public void rendiCircolare() {
        if(vuota()) return;

        Node tmp = testa;
        while(!ultimo(tmp.next)){
            tmp = tmp.next;
        }
        tmp.next = testa;
    }

    

    @Override
    public String toString() {
        String s = "";
        Node tmp = testa;
        while(!ultimo(tmp)){
            s += tmp + " ";
            tmp = tmp.next;
        }
        return s;
    }

}
