package com.example.todoapp;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Button button;
    View inputText;
    ListView listView;
    ArrayList<String> list;

    public void onClickAdd(View v){

        String text = String.valueOf(inputText.getTextDirection());

        if(!text.equals("")){
            list.add(text);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
            listView.setAdapter(adapter);
            inputText.setTextDirection(Integer.parseInt(""));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.addButton);
        inputText=findViewById(R.id.inputText);
        listView=findViewById(R.id.listView);
        list = new ArrayList<>();
    }
}