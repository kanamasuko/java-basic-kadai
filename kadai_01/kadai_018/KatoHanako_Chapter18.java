package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{

	//継承先でオーバーライドするときの入力
	//public void output(int 任意の引数名, double 任意の引数名){
	//   任意の処理
	//}	
	
	public void setGivenName() {
		super.givenName = "花子";	
	}
	
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	
	

}
