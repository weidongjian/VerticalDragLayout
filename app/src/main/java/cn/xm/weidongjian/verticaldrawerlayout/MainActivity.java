package cn.xm.weidongjian.verticaldrawerlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    String[] listItems = {"item 1", "item 2 ", "list", "android", "item 3", "foobar", "bar", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.contentView);
        listView.setAdapter(new ArrayAdapter(this,  android.R.layout.simple_list_item_1, listItems));
    }
}
