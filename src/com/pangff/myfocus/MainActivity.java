package com.pangff.myfocus;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

  ListView list;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    list = (ListView) findViewById(R.id.list);
    
    list.setAdapter(new MyAdapter());
  }

  
  public class MyAdapter extends BaseAdapter{

    @Override
    public int getCount() {
      // TODO Auto-generated method stub
      return 10;
    }

    @Override
    public Object getItem(int position) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public long getItemId(int position) {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      if(convertView==null){
        convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item, null);
      }
      return convertView;
    }
    
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
