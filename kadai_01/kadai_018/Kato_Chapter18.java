package kadai_018;

abstract public class Kato_Chapter18 {

	//親メソッド
	
	//フィールド入力
	public String familyName ="加藤";
	public String givenName ="";
	public String adress ="東京都中野区〇×";
	
	
	//メソッド入力
	public void commonIntroduce(){
		System.out.println("名前は"+this.familyName+this.givenName+"です");
		System.out.println("住所は"+this.adress+"です");
		
	};
	
	
	
	abstract public void eachIntroduce();
	
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	};
	
	
}
