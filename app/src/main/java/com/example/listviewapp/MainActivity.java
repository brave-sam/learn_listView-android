package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"this is","my book","u know","sarim","loves","areesha","will ","areesha","accept","marriage","proposal","of","sarim","is","she","misses","sarim","because","sarim","has","everything","in","the","name of her"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        //Using built in array adapter
//        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);


        //Using custom Adapter

        SamAdapter ad = new SamAdapter(this,R.layout.my_sam_layout,arr);
        listView.setAdapter(ad);

//        listener on in built adapter
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this,"You Clicked on : "+i,Toast.LENGTH_SHORT).show();
//            }
//        });

        // listener on custom adapter


    }
}