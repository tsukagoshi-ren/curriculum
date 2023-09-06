/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
       int[] data = {3, 1, 2, 7, 5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            // ここで31275が出力
        }

        System.out.println();
        // ここで改行
        
        // ↓ここからバブルソート
        for (int i = 0; i < data.length - 1; i++) {
        // iは0で、iが5より小さいと継続、iは1づつプラス
        // 3,1,2,7,5
            for (int j = data.length - 1; j > i; j--) {
            // ↑j=5で、jがiより大きいと継続で、jは1づつマイナス
            // 5,7,2,1,3
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[i] > data[j]){
                // iがjより大きい場合
                // data[i]にdata[j]の値を入れ、data[j]をdata[i]の値にしている
                  int box = data[i];
                  data[i] = data[j];
                  data[j] = box;
                }
            }
        }
        // バブルソート終わり
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            // 並び替えられたdata[i]を出力
        }
    }
}