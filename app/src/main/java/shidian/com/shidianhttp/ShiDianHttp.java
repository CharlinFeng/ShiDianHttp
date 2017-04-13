package shidian.com.shidianhttp;

import android.app.Application;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Charlin on 2017/4/13.
 */

public class ShiDianHttp {

    private static class SingletonHolder {
        private static final ShiDianHttp sdHttp = new ShiDianHttp();

    }

    private ShiDianHttp (){}

    public static final ShiDianHttp shareInstance() {

        return SingletonHolder.sdHttp;
    }

    private static RequestQueue queue = Volley.newRequestQueue(APPApplication.getContext());;

    //GET
    public static void GET(String url, HashMap<String, String> map, final ShiDianHttpDelegate delegate){

        StringBuilder url_full = new StringBuilder(url+"?");

        for(Map.Entry<String, String> entry:map.entrySet()){

            String key = entry.getKey();
            String value = entry.getValue();
            url_full.append(key+"="+value+"&");
        }

        url_full.deleteCharAt(url_full.length()-1);

        StringRequest request = new StringRequest(Request.Method.GET, url.toString(), new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                delegate.successBlock(response);
            }

        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                delegate.errorBlock(error.getLocalizedMessage());
            }

        });

        queue.add(request);

    }


    //POST
    public static void POST(String url, final HashMap<String, String> map, final ShiDianHttpDelegate delegate){

        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                delegate.successBlock(response);
            }

        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                delegate.errorBlock(error.getLocalizedMessage());
            }

        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }
        };;

        queue.add(request);

    }

}
