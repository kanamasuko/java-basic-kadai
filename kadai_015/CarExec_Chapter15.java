package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ギアの切り替えデータを作成　インスタンスを作る
		Car_Chapter15 car = new Car_Chapter15();
		//これでインスタンスに対して引数を渡して実体を作れるようにしている
		
		//ギアを3に切り替える
		//インスタンス名.メソッド名(引数)
		car.changeGear(3);
		//changeGearメソッドに引数3を渡して実行
		car.run();
		//changeGearメソッドの結果を受けたrunメソッドの結果を表示
		
	}
		
	
}
