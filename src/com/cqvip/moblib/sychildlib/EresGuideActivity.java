package com.cqvip.moblib.sychildlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EresGuideActivity extends Activity {
	Button eres_guide_btn01,eres_guide_btn02,eres_guide_btn03;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eres_guide);
		eres_guide_btn01=(Button)findViewById(R.id.eres_guide_btn01);
		eres_guide_btn02=(Button)findViewById(R.id.eres_guide_btn02);
		eres_guide_btn03=(Button)findViewById(R.id.eres_guide_btn03);
		eres_guide_btn01.setOnClickListener(btnclick);
		eres_guide_btn02.setOnClickListener(btnclick);
		eres_guide_btn03.setOnClickListener(btnclick);
	}
	
	OnClickListener btnclick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(EresGuideActivity.this,WebActivity.class);
			
			switch (v.getId()) {
			case R.id.eres_guide_btn01:
				intent.putExtra("urlstr", "http://shaoer.wz.waplexiang.net");
				EresGuideActivity.this.startActivity(intent);
				break;
			case R.id.eres_guide_btn02:
				intent.putExtra("urlstr", "http://r.apabi.com/r2k/wx/b/cl/swhy");
				EresGuideActivity.this.startActivity(intent);
				break;
			case R.id.eres_guide_btn03:
				intent.putExtra("urlstr", "http://r.apabi.com/r2k/wx/p/pl/swhy");
				EresGuideActivity.this.startActivity(intent);
				break;
			

			default:
				break;
			}
		}
	};
}
