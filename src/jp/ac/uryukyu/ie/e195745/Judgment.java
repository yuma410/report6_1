package jp.ac.uryukyu.ie.e195745;

import java.util.List;

//結果を判定するクラス
public class Judgment {

	 //手札がバーストしているか判定するメソッド
    private static boolean isBusted(int point) {
        if (point <= 21) {
            return false;
        } else {
            return true;
        }
    }

    //現在の合計ポイントを計算するメソッド
    private static int sumPoint(List<Integer> list) {
    	int sum = 0;

        for(int i =0;i < list.size();i++) {
            sum = sum + toPoint(toNumber(list.get(i)));
        }

        return sum;
    }

}
