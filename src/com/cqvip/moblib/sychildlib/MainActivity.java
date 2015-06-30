package com.cqvip.moblib.sychildlib;

import java.util.ArrayList;
import java.util.List;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {

	// GIFView gf;
	private List<MainBtnsBean> mm;
	private MainBtnsAdapter mma;
	private GridView gv;
	private SharedPreferences localUsers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gv = (GridView) findViewById(R.id.main_btns_list);
		mm = new ArrayList();
		mm.add(new MainBtnsBean(R.drawable.zn, "入馆指南"));
		mm.add(new MainBtnsBean(R.drawable.gl, "开馆时间"));
		mm.add(new MainBtnsBean(R.drawable.zx, "馆内公告"));

		mm.add(new MainBtnsBean(R.drawable.yd, "馆藏查询"));
		mm.add(new MainBtnsBean(R.drawable.cx, "借阅管理"));
		mm.add(new MainBtnsBean(R.drawable.zy, "电子资源"));

		// mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
		// mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
		// mm.add(new MainBtnsBean(R.drawable.zn,"入馆指南"));
		localUsers = getSharedPreferences("mobliereader", MODE_PRIVATE);
		GlobleData.islogin=localUsers.getBoolean("islogin", false);
		if(GlobleData.islogin)
		{
		GlobleData.userid=localUsers.getString("userid", "");
		GlobleData.readername=localUsers.getString("name", "");
		}
		
		mma = new MainBtnsAdapter(MainActivity.this, mm);
		gv.setAdapter(mma);
		gv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				switch (arg2) {
				case 0:
					intent.setClass(MainActivity.this, GuideActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				case 1:
					intent.setClass(MainActivity.this, WebActivity.class);
					intent.putExtra("urlstr",
							"http://weixin.mobcld.com/webcld/syse/htmls/syser_kfsj.html");
					MainActivity.this.startActivity(intent);
					break;
				case 2:
					intent.setClass(MainActivity.this, WebActivity.class);
					intent.putExtra("urlstr",
							"http://weixin.mobcld.com/webcld/syse/htmls/syser_newslist.html");
					MainActivity.this.startActivity(intent);
					break;
					
				case 3:
					intent.setClass(MainActivity.this, BookSreachActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				case 4:
					if(GlobleData.islogin)
					{
						intent.setClass(MainActivity.this, BorrowActivity.class);
						MainActivity.this.startActivity(intent);
					}else
					{
					intent.setClass(MainActivity.this, ActivityDlg.class);
					intent.putExtra("ACTIONID", 8);
					MainActivity.this.startActivityForResult(intent,8);
					}
					break;
				case 5:
					intent.setClass(MainActivity.this, EresGuideActivity.class);
					MainActivity.this.startActivity(intent);
					break;



				default:
					break;
				}

			}
		});
		// gf=(GIFView)findViewById(R.id.gif);
		// gf.setMovieResource(R.drawable.g001);
		// gf.setScaleY(3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
	
			if (requestCode==8&&resultCode == 0 && GlobleData.islogin) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, BorrowActivity.class);
				startActivity(intent);
			}
			
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
