package check;

import constants.Constants;

public class Main {

//課題①：フィールド変数firstNameとlastNameを宣言
private static String firstName = "蓮";
private static String lastName = "塚越";

//課題②：フィールド変数firstNameとlastNameを引数で受け取って、連結して表示させるメソッド「printName」を作成
	private void printName() {
		System.out.println(firstName + " " + lastName);	
	}
	
//課題③:【Main.java】にてPetクラスとRobotPetクラスをインスタンス化して出力
	public static void main(String[] args) {
		Main main = new Main();
		main.printName();
		
		// Petクラスのインスタンス化して出力
		//引数として定数（名前）からペットの名前を取得
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		// RobotPetクラスのインスタンス化して出力
		//引数として定数（名前）からロボットの名前を取得
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}
}
