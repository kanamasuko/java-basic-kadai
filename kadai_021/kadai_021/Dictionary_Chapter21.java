package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//HashMap<キーの型,値の型> 変数 = new HashMap<キーの型,値の型>();
	HashMap<String,String> dic = new HashMap<String,String>(); 

	//要素の追加		
	{
	dic.put("apple","りんご");
	dic.put("peach","桃");
	dic.put("banana","バナナ");
	dic.put("lemon","レモン");
	dic.put("pear","梨");
	dic.put("kiwi","キウィ");
	dic.put("strawberry","いちご");
	dic.put("grape","ぶどう");
	dic.put("muscat","マスカット");
	dic.put("cherry","さくらんぼ");
	}
	
	public void check(String word) {
		
		String wordexist = dic.get(word);
		
		if(wordexist !=null) {
			System.out.println(word+"の意味は"+dic.get(word));
		}else {
			System.out.println(word+"は辞書に存在しません");	
			
		}		
	}
}
