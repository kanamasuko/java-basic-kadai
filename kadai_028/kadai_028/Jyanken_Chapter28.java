package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	
	String myhand;
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		//自分のじゃんけん手を入力する
		
			
		Scanner scanner=new Scanner(System.in);
		
		//正しいじゃんけんの手であるか判定する
		myhand = scanner.next();
		//入力した文字列が、r/s/pのうちのどれかに含まれているか確認する
			
			//正しいじゃんけんの手でない場合
			//エラーを出力し、再度自分のじゃんけんの手を選ぶ
					
				if(!(myhand.equals("r")||myhand.equals("s")||myhand.equals("p"))||myhand.isEmpty()) {
					throw new IllegalArgumentException("r(グー)/s(チョキ)/p(パー)の中から選択してください");
				}else {
			//正しいじゃんけんの場合
			//じゃんけんクラスを実行するクラスに自分の手を返す
							
					//System.out.println(myhand);
					return myhand;
				}				
			//自分のじゃんけんの手を入力する
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[]handarray= {"r","s","p"};
		
		//乱数で対戦相手のじゃんけんの手を選ぶ
		//取得した3未満の数をfloor()メソッドで切り捨てる
		int randhand =  (int) Math.floor(Math.random() * 3);
		
		String rivalhand = handarray[randhand];
		//System.out.println(rivalhand);
		return rivalhand;
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		
		 HashMap<String,String> humanMap = new HashMap<String,String>();

	      humanMap.put("r","グー");
	      humanMap.put("s","チョキ");
	      humanMap.put("p","パー");

	      String mario=humanMap.get(myhand);
	      String luigi=humanMap.get(getRandom());
	      
		//自分と対戦相手のじゃんけんを出力する
		 System.out.println("自分の手は"+ mario +"対戦相手の手は"+luigi);
		
		//HashMapのキーを使用する
		
		//自分と対戦相手のじゃんけんの手を比較する
		
	         
	      if(mario.equals(luigi)) {
	    	  	System.out.println("あいこです");
	      }else if((mario.equals("グー")&&luigi.equals("チョキ"))||(mario.equals("チョキ")&&luigi.equals("パー"))||(mario.equals("パー")&&luigi.equals("グー"))){
	    	  	System.out.println("勝ちです");
	      }else {
	    	  System.out.println("負けです");
	      }
	    	  
	}
}
