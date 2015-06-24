package com.cqvip.moblib.sychildlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GuideActivity extends Activity {

	Button guide_btn01, guide_btn02, guide_btn03, guide_btn04;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
		guide_btn01 = (Button) findViewById(R.id.guide_btn01);
		guide_btn02 = (Button) findViewById(R.id.guide_btn02);
		guide_btn03 = (Button) findViewById(R.id.guide_btn03);
		guide_btn04 = (Button) findViewById(R.id.guide_btn04);

		guide_btn01.setOnClickListener(btnclick);
		guide_btn02.setOnClickListener(btnclick);
		guide_btn03.setOnClickListener(btnclick);
		guide_btn04.setOnClickListener(btnclick);
	}

	OnClickListener btnclick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(GuideActivity.this,WebActivity.class);
			
			switch (v.getId()) {
			case R.id.guide_btn01:
				intent.putExtra("urlstr", "http://weixin.mobcld.com/webcld/syse/htmls/syser_bgjj.html");
				GuideActivity.this.startActivity(intent);
				break;
			case R.id.guide_btn02:
				intent.putExtra("urlstr", "http://weixin.mobcld.com/webcld/syse/htmls/syser_fwxm.html");
				GuideActivity.this.startActivity(intent);
				break;
			case R.id.guide_btn03:
				intent.putExtra("urlstr", "http://weixin.mobcld.com/webcld/syse/htmls/syser_jyxz.html");
				GuideActivity.this.startActivity(intent);
				break;
			case R.id.guide_btn04:
				intent.putExtra("urlstr", "http://weixin.mobcld.com/webcld/syse/htmls/syser_gcfb.html");
				GuideActivity.this.startActivity(intent);
				break;

			default:
				break;
			}
		}
	};

}
