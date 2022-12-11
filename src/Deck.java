import java.util.Random;

public class Deck {

    String [] deck = new String[52];
    Deck() {


        String[] suits = {"♥", "♠", "♦", "♣"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"};

                for (int i =0; i<deck.length ; i++) {
                    deck[i] = ranks[i % 13] + suits[i/13];
                    System.out.println(deck[i]);


                }


    }
    void Shuffle(){
        Random random = new Random();
        for(int ilk = 0; ilk<deck.length; ilk++){
           int ikinci = random.nextInt(52);
             String temp = deck[ilk];
             deck[ikinci] = temp;


        }
        for(int u =0; u<deck.length ; u++){
            System.out.println(deck[u]);
        }
    }
    void CuttheDeck(){

        Random random = new Random();
        int k = random.nextInt(52);
        int temp = k;
        System.out.println(k);
        System.out.println("*********************************");
        System.out.println(k +"nıncı sıra");
        System.out.println("**********************************");
       String gecici;
       String gecici2;
        for( int a=k ; k<deck.length ;k++ ){
            gecici2=deck[k];
            System.out.println(gecici2);



        }
        for(int j = 0; j<temp; j++) { 
           gecici = deck[j];
            System.out.println(gecici);

        }







    }
}


