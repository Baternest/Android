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

		 //���listview�ե�
		listView = (ListView) findViewById(R.id.listView1);
		 
		 //listview����ϥ�setAdapter��k�]���ListActivity�O��setListAdapter�^
		listView.setAdapter(new ArrayAdapter<String>(this,
		 android.R.layout.simple_list_item_checked, mStrings));
		 
//		android.R.layout.simple_list_item_1�G�@��text
//		android.R.layout.simple_list_item_2�G�@��text���j�A�@��text���p
//		android.R.layout.simple_list_item_single_choice�G���
//		android.R.layout.simple_list_item_multiple_choice�G�h����s
//		android.R.layout.simple_list_item_checked�G�Ŀﲰ
		
		 //�ҥΫ���L�o�\��]������listview����A���ݭngetListView��k�^
		listView.setTextFilterEnabled(true);
		
//		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView arg0, View arg1, int arg2,
//					long arg3) { 
//				// TODO Auto-generated method stub
//				ListView listView = (ListView) arg0;
//				Toast.makeText(
//						ListDemo2.this,
//						"ID�G" + arg3 +
//						"   ����r�G"+ listView.getItemAtPosition(arg2).toString(),
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
		 "�j��]�p��", "�H�J��", "�F�s�n�Y", "�䨧�G", "���",
		 "����", "�C��U�J","�ަ�|", "�j�z�]�p�z", "�Ф���",
		 "�N���z","������","�ï]����","�жp��","�j����",
		 "������","�s�ަ�","��ͦB","��B","���G�B",
		 "�]�߯���","�ư��p","�F���{��","�����N","�פp��",
		 "aaa","abc","bbb","bcd","123"
		 };	
}
