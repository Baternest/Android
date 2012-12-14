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

		// �`�N�G����ϥ�main����layout�A�ΤF�|�X�{���~
		// setContentView(R.layout.main);
		
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mStrings));

		// �ҥΫ���L�o�\��
		getListView().setTextFilterEnabled(true);
	}

	private static final String[] mStrings = new String[] { "�j��]�p��", "�H�J��",
			"�F�s�n�Y", "�䨧�G", "���", "����", "�C��U�J", "�ަ�|", "�j�z�]�p�z", "�Ф���", "�N���z",
			"������", "�ï]����", "�жp��", "�j����", "������", "�s�ަ�", "��ͦB", "��B", "���G�B",
			"�]�߯���", "�ư��p", "�F���{��", "�����N", "�פp��", "aaa", "abc", "bbb", "bcd",
			"123" };
}