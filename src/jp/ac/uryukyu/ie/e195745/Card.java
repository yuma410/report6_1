package jp.ac.uryukyu.ie.e195745;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card{

	 //空の山札を作成
    List <Integer> deck = new ArrayList<>(52);
    //山札をシャッフル
    void shuffleDeck(deck);

	 //プレイヤー・ディーラーの手札リストを生成
    List <Integer> player = new ArrayList<>();
    List <Integer> dealer = new ArrayList<>();

	//山札（deck）に値を入れ、シャッフルするメソッド
    private static void shuffleDeck(List<Integer> deck) {


       // リストに1-52の連番を代入
       for(int i = 1; i <= 52; i++){
           deck.add(i);
       }

       //山札をシャッフル
       Collections.shuffle(deck);

   }

	//トランプの数字を得点計算用のポイントに変換するメソッド.J/Q/Kは10とする
    private static int toPoint(int num) {
        if(num ==11||num == 12||num == 13) {
            num = 10;
        }

        return num;
    }

    //山札の数を（スート）の（ランク）の文字列に置き換えるメソッド
    private static String toDescription(int cardNumber) {
        String rank = toRank(toNumber(cardNumber));
        String suit = toSuit(cardNumber);

        return suit + "の" + rank;
    }

    //山札の数をカードの数に置き換えるメソッド
    private static int toNumber(int cardNumber) {
        int number = cardNumber % 13;
        if(number == 0) {
            number = 13;
        }

        return number;
    }

    //カード番号をランク（AやJ,Q,K）に変換するメソッド
    private static String toRank(int number) {
        switch(number) {
        case 1:
            return "A";
        case 11:
            return "J";
        case 12:
            return "Q";
        case 13:
            return "K";
       default:
           String str = String.valueOf(number);
           return str;
        }
    }

   //山札の数をスート（ハートやスペードなどのマーク）に置き換えるメソッド
    private static String toSuit(int cardNumber) {
        switch((cardNumber - 1)/13) {
        case 0:
            return "クラブ";
        case 1:
            return "ダイヤ";
        case 2:
            return "ハート";
        case 3:
            return "スペード";
       default:
           return "例外です";
        }
    }

}
