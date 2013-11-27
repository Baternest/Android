package com.example.listdemo1;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*public class ListDemo1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_demo1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list_demo1, menu);
		return true;
	}

}*/

public class ListDemo1 extends ListActivity {
	// private ListView listView;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 注意：不能使用main中的layout，用了會出現錯誤
		// setContentView(R.layout.main);
		
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mStrings));

		// 啟用按鍵過濾功能
		getListView().setTextFilterEnabled(true);
	}

	private static final String[] mStrings = new String[] { "大餅包小餅", "蚵仔煎",
			"東山鴨頭", "臭豆腐", "潤餅", "豆花", "青蛙下蛋", "豬血糕", "大腸包小腸", "鹹水雞", "烤香腸",
			"車輪餅", "珍珠奶茶", "鹹酥雞", "大熱狗", "炸雞排", "山豬肉", "花生冰", "剉冰", "水果冰",
			"包心粉圓", "排骨酥", "沙茶魷魚", "章魚燒", "度小月", "aaa", "abc", "bbb", "bcd",
			"123" };
}