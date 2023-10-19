// 問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。
// 問2:以下の要件を満たすように実装してください。
// 【要件】
// ・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
// ・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する

let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓

class Car{
    constructor(num){
        this.num = num;
    }
    isEven() {
        console.log(this.num + 'は偶数です');
    }
    getNumGas(gas){
        console.log('ガソリンは' + gas + 'です。ナンバーは${this.num}です');
    }
}

for(let i=0; i < numbers.length; i++){
    if(numbers[i] % 2 === 0){
        let even = new Car(numbers[i]);
        even.isEven();
        even.getNumGas(100);
    }
}
