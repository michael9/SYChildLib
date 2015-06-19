package com.cqvip.moblib.sychildlib;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends Activity {
	
//	GIFView gf;
 private List<MainBtnsBean> mm;
 private MainBtnsAdapter mma;
 private GridView gv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gv=(GridView)findViewById(R.id.main_btns_list);
		mm=new ArrayList();
		mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
		mm.add(new MainBtnsBean(R.drawable.gl,"开馆时间"));
		mm.add(new MainBtnsBean(R.drawable.zx,"馆内公告"));
		
		mm.add(new MainBtnsBean(R.drawable.yd,"馆藏查询"));
		mm.add(new MainBtnsBean(R.drawable.cx,"借阅管理"));		
		mm.add(new MainBtnsBean(R.drawable.zy,"电子资源"));
		
//		mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
//		mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
//		mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
		
		mma=new MainBtnsAdapter(MainActivity.this, mm);
		gv.setAdapter(mma);
//		gf=(GIFView)findViewById(R.id.gif);
//		gf.setMovieResource(R.drawable.g001);
//		gf.setScaleY(3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
