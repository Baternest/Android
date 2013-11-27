package com.example.listdemo2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListDemo2 extends Activity {

	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_demo2);

		 //找到listview組件
		listView = (ListView) findViewById(R.id.listView1);
		 
		 //listview物件使用setAdapter方法（比對ListActivity是用setListAdapter）
		listView.setAdapter(new ArrayAdapter<String>(this,
		 android.R.layout.simple_list_item_checked, mStrings));
		 
//		android.R.layout.simple_list_item_1：一行text
//		android.R.layout.simple_list_item_2：一行text較大，一行text較小
//		android.R.layout.simple_list_item_single_choice：單選
//		android.R.layout.simple_list_item_multiple_choice：多選按鈕
//		android.R.layout.simple_list_item_checked：勾選盒
		
		 //啟用按鍵過濾功能（直接用listview物件，不需要getListView方法）
		listView.setTextFilterEnabled(true);
		
//		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView arg0, View arg1, int arg2,
//					long arg3) { 
//				// TODO Auto-generated method stub
//				ListView listView = (ListView) arg0;
//				Toast.makeText(
//						ListDemo2.this,
//						"ID：" + arg3 +
//						"   選單文字："+ listView.getItemAtPosition(arg2).toString(),
//						Toast.LENGTH_LONG).show();
//
//			}
//		});		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list_demo2, menu);
		return true;
	}

	 private static final String[] mStrings = new String[] {
		 "大餅包小餅", "蚵仔煎", "東山鴨頭", "臭豆腐", "潤餅",
		 "豆花", "青蛙下蛋","豬血糕", "大腸包小腸", "鹹水雞",
		 "烤香腸","車輪餅","珍珠奶茶","鹹酥雞","大熱狗",
		 "炸雞排","山豬肉","花生冰","剉冰","水果冰",
		 "包心粉圓","排骨酥","沙茶魷魚","章魚燒","度小月",
		 "aaa","abc","bbb","bcd","123"
		 };	
}
