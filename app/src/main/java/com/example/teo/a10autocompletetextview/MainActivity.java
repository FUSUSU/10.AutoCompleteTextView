package com.example.teo.a10autocompletetextview;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    //Giá trị của tự động    đoán ngôn ngữ lập trình nhập vào
    String[] language = {"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the instance of ArrayAdapter containing list of language names
        //Tạo một ArrayAdapter để chứa danh sách tên các ngôn ngữ
        //Nhớ set language cho ArrayAdapter! That right!
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, language);
        //Getting the instance of AutoCompleteTextView
        //Ánh xạ AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        //Bắt đầu làm việc với kí tự đầu tiên nhập vào
        actv.setThreshold(1); //Will start working from first character
        //Thiết lập dữ liệu adapter cho AutoCompleteTextView
        actv.setAdapter(adapter); //Setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);//Thiết lập màu chữ cho AutoCompleteTextView
    }


    //Cài đặt menu item cho bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
