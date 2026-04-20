package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
	
	
	//子クラスのインスタンスを作成する
	
	KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
	KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
	KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
	
	//setGivenNameメソッドを実行する
	taro.setGivenName();
	taro.execIntroduce();
	
	ichiro.setGivenName();
	ichiro.execIntroduce();
	
	hanako.setGivenName();
	hanako.execIntroduce();
	
	//execIntroduceメソッドを実行する
	
	
	}
}
