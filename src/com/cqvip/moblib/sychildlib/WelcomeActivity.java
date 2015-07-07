package com.cqvip.moblib.sychildlib;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.Map;

public class WelcomeActivity extends Activity {
    ImageView welcomeimg;
    private RequestQueue mQueue;
    private Response.ErrorListener el;
    private Map<String, String> gparams;


    private Handler handler = new Handler( );

    private Runnable runnable = new Runnable( ) {

        public void run ( ) {
            WelcomeActivity.this.finish();
            overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mQueue= Volley.newRequestQueue(this);
        welcomeimg=(ImageView)findViewById(R.id.welcome_img);
        ImageLoad();

        handler.postDelayed(runnable,2500);
    }
    void ImageLoad()
    {
        welcomeimg.setImageResource(R.drawable.welcome_def);
        requestVolley("http://weixin.mobcld.com/webcld/syse/htmls/welpage.php", backlistener,
                Request.Method.GET);
    }

    private void requestVolley(String addr, Response.Listener<String> bl, int method) {
        try {
            StringRequest mys = new StringRequest(method, addr, bl, el) {

                protected Map<String, String> getParams()
                        throws com.android.volley.AuthFailureError {
                    return gparams;
                };
            };
            mys.setRetryPolicy(HttpUtils.setTimeout());
            mQueue.add(mys);
            mQueue.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Response.Listener<String> backlistener = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {

            try {
                JSONObject mj=new JSONObject(response);
                ImageLoader imageLoader = new ImageLoader(mQueue, new BitmapCache(Tool.getCachSize()));
                ImageLoader.ImageListener listener = ImageLoader.getImageListener(welcomeimg,
                        R.drawable.welcome_def, R.drawable.welcome_def);
                imageLoader.get(mj.getString("imgadd"), listener);

            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
