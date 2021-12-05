package com.vetfinder.animal_hospital_finder;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private List<String> list;
    private ListView listView;
    private EditText editSearch;
    private SearchAdapter adapter;
    private ArrayList<String> arraylist;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editSearch=(EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.search_list);

        list = new ArrayList<String>();

        settingList();

        arraylist = new ArrayList<String>();
        arraylist.addAll(list);

        adapter = new SearchAdapter(list, this);

        listView.setAdapter(adapter);


        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String text = editSearch.getText().toString();
                search(text);
            }
        });
        
    }

    public void search(String charText){

        list.clear();

        if(charText.length() == 0){
            list.addAll(arraylist);
        }

        else
        {
            for (int i =0; i <arraylist.size(); i++) {
                if (arraylist.get(i).toLowerCase().contains(charText)){
                    list.add(arraylist.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void settingList() {
        list.add(getResources().getString(R.string.parrot_info1));
        list.add(getResources().getString(R.string.parrot_info2));
        list.add(getResources().getString(R.string.parrot_info3));
        list.add(getResources().getString(R.string.parrot_info4));
        list.add(getResources().getString(R.string.parrot_info5));
        list.add(getResources().getString(R.string.parrot_info6));
        list.add(getResources().getString(R.string.parrot_info7));
        list.add(getResources().getString(R.string.parrot_info8));
        list.add(getResources().getString(R.string.parrot_info9));
        list.add(getResources().getString(R.string.parrot_info10));
        list.add(getResources().getString(R.string.parrot_info11));
        list.add(getResources().getString(R.string.parrot_info12));
        list.add(getResources().getString(R.string.parrot_info13));
        list.add(getResources().getString(R.string.parrot_info14));
        list.add(getResources().getString(R.string.parrot_info15));
        list.add(getResources().getString(R.string.parrot_info16));
        list.add(getResources().getString(R.string.parrot_info17));
        list.add(getResources().getString(R.string.parrot_info18));
        list.add(getResources().getString(R.string.parrot_info19));
        list.add(getResources().getString(R.string.parrot_info20));
        list.add(getResources().getString(R.string.parrot_info21));
        list.add(getResources().getString(R.string.parrot_info22));
        list.add(getResources().getString(R.string.parrot_info23));
        list.add(getResources().getString(R.string.parrot_info24));
        list.add(getResources().getString(R.string.parrot_info25));
        list.add(getResources().getString(R.string.parrot_info26));
        list.add(getResources().getString(R.string.reptile_info1));
        list.add(getResources().getString(R.string.reptile_info2));
        list.add(getResources().getString(R.string.reptile_info3));
        list.add(getResources().getString(R.string.reptile_info4));
        list.add(getResources().getString(R.string.reptile_info5));
        list.add(getResources().getString(R.string.reptile_info6));
        list.add(getResources().getString(R.string.reptile_info7));
        list.add(getResources().getString(R.string.reptile_info8));
        list.add(getResources().getString(R.string.reptile_info9));
        list.add(getResources().getString(R.string.reptile_info10));
        list.add(getResources().getString(R.string.reptile_info11));
        list.add(getResources().getString(R.string.reptile_info12));
        list.add(getResources().getString(R.string.reptile_info13));
        list.add(getResources().getString(R.string.reptile_info14));
        list.add(getResources().getString(R.string.reptile_info15));
        list.add(getResources().getString(R.string.reptile_info16));
        list.add(getResources().getString(R.string.reptile_info17));
        list.add(getResources().getString(R.string.reptile_info18));
        list.add(getResources().getString(R.string.rodent_info1));
        list.add(getResources().getString(R.string.rodent_info2));
        list.add(getResources().getString(R.string.rodent_info3));
        list.add(getResources().getString(R.string.rodent_info4));
        list.add(getResources().getString(R.string.rodent_info5));
        list.add(getResources().getString(R.string.rodent_info6));
        list.add(getResources().getString(R.string.rodent_info7));
        list.add(getResources().getString(R.string.rodent_info8));
        list.add(getResources().getString(R.string.rodent_info9));
        list.add(getResources().getString(R.string.reptile_info10));
        list.add(getResources().getString(R.string.reptile_info11));
        list.add(getResources().getString(R.string.reptile_info12));
        list.add(getResources().getString(R.string.rodent_info13));
        list.add(getResources().getString(R.string.rodent_info14));
        list.add(getResources().getString(R.string.rodent_info15));
        list.add(getResources().getString(R.string.rodent_info16));
        list.add(getResources().getString(R.string.rodent_info17));
        list.add(getResources().getString(R.string.rodent_info18));
        list.add(getResources().getString(R.string.rodent_info19));
        list.add(getResources().getString(R.string.rodent_info20));
    }
}