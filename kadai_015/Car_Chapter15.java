package kadai_015;

public class Car_Chapter15 {

	//フィールド作成
	private int gear=1;//1速度から5速のギアを表す
	private int speed =10;//ギアチェンジ後の速度を表す
	//privateにして外部のクラスから勝手に使われないようにしている
	
	//コンストラクタ（初期化処理）
	//アクセス修飾子 クラス名( 引数1の宣言, 引数2の宣言,・・・) {
    //初期化処理;}
	
	public Car_Chapter15() {
		
		System.out.println("速度初期値："+ this.gear+"ギア");
		System.out.println("時速初期値："+this.speed+"km/h");
		//thisを使って初期化した値を表示している
	}
	
	
	//メソッドの作成
	//修飾子 戻り値の型 メソッド名(引数の宣言) {
    //処理内容;}
	
	public void changeGear(int afterGear) {

		this.gear=afterGear;
		//this.gesr(フィールドの内容をchangeGearメソッドに渡した引数の内容に書き換えている)
		System.out.println("ギア1から"+ this.gear+ "に切り替えました");
		//切り替えたことを表示
		
		this.speed = switch (this.gear) {
	    case 1 -> 10;
	    case 2 -> 20;
	    case 3 -> 30;
	    case 4 -> 40;
	    case 5 -> 50;
	    default -> 10;	};
	    //changeGearメソッドに渡した引数によって、this.speedの内容が変わるようにしている
	}
	
	public void run() {

		System.out.println("速度は時速"+this.speed+"kmです");
		//速度が切り替わった後のthis.speedの内容を表示
	}
	

}
