package cn.xm.weidongjian.verticaldrawerlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] listItems = {"item 1", "item 2 ", "list", "android", "item 3", "foobar", "bar", };
    private DragLayout mDragLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.contentView);
        listView.setAdapter(new ArrayAdapter(this,  android.R.layout.simple_list_item_1, listItems));

        mDragLayout = (DragLayout) findViewById(R.id.drawLayout);
        findViewById(R.id.open).setOnClickListener(this);
        findViewById(R.id.close).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.open:
                mDragLayout.smoothToTop();
                break;
            case R.id.close:
                mDragLayout.smoothToBottom();
                break;
        }
    }
}
