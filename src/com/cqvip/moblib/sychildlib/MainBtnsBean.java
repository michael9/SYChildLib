package com.cqvip.moblib.sychildlib;

public class MainBtnsBean{
	
	private int drwid;
	private String txt;
	
  public MainBtnsBean(int m_drwid,String m_txt)
  {
	  drwid=m_drwid;
	  txt=m_txt;
  }
	
  public int getdrwid()
  {
	  return drwid;
  }
  public String gettxt(){
	  return txt;
  }
}