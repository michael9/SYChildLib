package com.cqvip.moblib.sychildlib;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainBtnsAdapter extends BaseAdapter {
	private Context context;
	private List<MainBtnsBean> list;

public MainBtnsAdapter(Context context,List<MainBtnsBean> mlist) {
		this.context = context;
		list=mlist;
	}

@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		convertView=LayoutInflater.from(context).inflate(
				R.layout.main_btn_item, null);
		ImageView mv=(ImageView)convertView.findViewById(R.id.item_img);
		TextView tv=(TextView)convertView.findViewById(R.id.item_txt);
		MainBtnsBean mb=(MainBtnsBean)list.get(position);
		mv.setImageResource(mb.getdrwid());
		tv.setText(mb.gettxt());
		return convertView;
	}
}