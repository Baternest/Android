package com.example.listdemo3;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.SimpleAdapter;

public class ListDemo3 extends ListActivity {

	 ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
	 private SimpleAdapter adapter;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		 //���ƥ[�JArrayList��
		 for(int i=0; i<mPlaces.length; i++){
		 HashMap<String,String> item = new HashMap<String,String>();
		 item.put( "food", mFoods[i]);
		 item.put( "place",mPlaces[i] );
		 list.add( item );
		 }
		 
		 //�s�WSimpleAdapter
		 adapter = new SimpleAdapter( 
		 this, 
		 list,
		 android.R.layout.simple_list_item_2,
		 new String[] { "food","place" },
		 new int[] { android.R.id.text1, android.R.id.text2 } );
		 
		 //ListActivity�]�wadapter
		 setListAdapter( adapter );
		 
		 //�ҥΫ���L�o�\��A�o����Ƴ��|�i��L�o
		 getListView().setTextFilterEnabled(true);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	 private static final String[] mPlaces = new String[] {
		 "�x�_��", "�s�_��", "�x�n��", "������", "�]����",
		 "�x�_��", "�s�_��", "�x�n��", "������", "�]����",
		 "�x�_��", "�s�_��", "�x�n��", "������", "�]����",
		 "�x�_��", "�s�_��", "�x�n��", "������", "�]����",
		 "�x�_��", "�s�_��", "�x�n��", "������", "�]����",
		 "�x�_��", "�s�_��", "789", "cde", "abc"
		 };
		 
		 private static final String[] mFoods = new String[] {
		 "�j��]�p��", "�H�J��", "�F�s�n�Y", "�䨧�G", "���",
		 "����", "�C��U�J","�ަ�|", "�j�z�]�p�z", "�Ф���",
		 "�N���z","������","�ï]����","�жp��","�j����",
		 "������","�s�ަ�","��ͦB","��B","���G�B",
		 "�]�߯���","�ư��p","�F���{��","�����N","�פp��",
		 "aaa","abc","bbb","bcd","123"
		 };	
}
