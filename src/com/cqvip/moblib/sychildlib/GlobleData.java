package com.cqvip.moblib.sychildlib;

import java.util.HashMap;
import java.util.Map;

import android.os.Environment;

public class GlobleData {

	/**
	 * Ĭ�����ݿ�汾
	 */
	public final static int    defaultDBVersion = 1;
	/**
	 * Ĭ�����ݿ�����
	 */
	public final static String dbName = "moblelib.db";
	/**
	 * ʵ�������ڰ�0
	 */
	public final static String MODEL_PACKAGE = "com.cqvip.moblelib.entity";
	/**
	 * ��������ַ
	 * */
	public final static   String SERVER_URL = "http://mobile.cqvip.com";
//	public final static   String EPUB_HOME_URL = "http://222.180.195.154:2300/";
//	public final static   String EPUB_HOME_URL = "http://113.31.19.26:9093/";
	//public final static   String SERVER_URL = "http://192.168.20.61:8080";
	/**
	 * ��������ַ
	 * */
	//public final static   String SERVER_URL_ZJY = "http://192.168.20.61:8080";
	/**
	 * ͼ���id,2��������ְҵ����ѧԺͼ���
	 * */
	public final static   String LIBIRY_ID = "3";
	/**
	 * ��ְԺͼ���id 
	 * */
	public final static   String SZLG_LIB_ID = "044120";
	/**
	 * �鼮����id, 4�����п���5�������ڹݲ�ͼ��
	 */
	public final static int BOOK_ZK_TYPE = 4;
	/**
	 * �鼮����id, 4�����п���5�������ڹݲ�ͼ��/6,��������ְҵ����ѧԺ
	 */	
	//public final static int BOOK_SZ_TYPE = 5;
	public final static int BOOK_SZ_TYPE = 6;
	//��ѯ����,�ؼ��� 
	public final static String QUERY_KEY = "subject";
	//��ѯ����,isbn
	public final static String QUERY_ISBN = "isbn";
	//��ѯ����,�����
	public final static String QUERY_ALL = "all";
//	public final static String QUERY_ALL = "title";
	//��ѯ����,����
	public final static String QUERY_TITLE = "title";
	//��ѯ����,���� 
	public final static String QUERY_AUTHOR = "author";
	//��ѯ����,�����
	public final static String QUERY_CALSSNO = "classno";
	//��ѯ����,�����
	public final static String QUERY_CALLNO = "callno";
	//��ѯ����,������
	public final static String QUERY_PUBLISHER = "publisher";
	//��ѯ��
	public final static String QUERY_TABLE = "bibliosm";
	//
	public final static String IMAGE_CACHE_DIR = "bookimg";
	
	public static final int ANNAOUCETYPE_HOTBOOK = 3;//�����Ƽ�
	public static final int ANNAOUCETYPE_NEWBOOK = 4;//�����Ƽ�
	public static final int ANNAOUCETYPE_NEWS = 2 ;//���Ŷ�̬
	public static final int ANNAOUCETYPE_FREESPEECH = 1;//���潲��
	public static final int FAQ_QUESTION = 5;//���潲��
	public static final int PROBLEM_ANNAOUCE = 6;//����������ְԺ
	
	public static Map<String, Object> datas = new HashMap<String, Object>();
	
	public static final String SERVER = "service";
	
	public static String userid;
	public static String readerid;
	public static String cqvipid;
	public static String readername;
	
	
	//���ڹ��棬�ӿ�
	public static final int ANNO_NEWS = 7;//���Ŷ�̬
	public static final int ANNO_MESS = 8;//֪ͨ����
	public static final int ANNO_SUBJECT = 9;//ר�⽲��
	public static final int ANNO_PROFESSOR= 10;//ר�ҽ���
	public static final int SUG_NEWBOOK= 11;//ר�ҽ���
	
	
	//��¼��ʶ
	public static boolean islogin = false;
	//����http://mobile.cqvip.com/qk/classlist.aspx?classid=0��ȡ
	public static final int MEDIAL_TYPEID = 1;//ҽҩ����
	public static final int ENGINE_TYPEID = 63;//���̿�ѧ
	public static final int SOCIAL_TYPEID = 67;//�������
	public static final int NATURE_TYPEID = 64;//��Ȼ��ѧ
	public static final int FORESTS_TYPEID = 66;//ũ������
	
	public static final int BIG_PERPAGE = 500;//һ���Ի�ȡ500����¼
	
	
	public static final String FBReaderJapk=Environment.getExternalStorageDirectory()+"/fbreader.apk";
	
	
	
}