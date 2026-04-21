package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String []checkword = {"apple","banana","grape","orange"};
		
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		
		for(int i=0;i<checkword.length;i++) {
		dic.check(checkword[i]);
		}
	}

}
