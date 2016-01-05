package com.iwan.usingfastjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.iwan.usingfastjson.bean.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Fast-json 的基本用法
 * https://api.douban.com/v2/book/1220562
 * <p/>
 * 导入gson.jar volley.jar fast-json.jar
 * 网络访问权限
 */
public class MainActivity extends AppCompatActivity {

    //url对象
    private String url = "https://api.douban.com/v2/book/1220562";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取json数据
        getData();
    }

    private void getData() {
        //请求数据
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {

                //输出请求结果
                Log.i("info",s);

                //开始数据解析
                dealData(s);


            }


        }, new Response.ErrorListener() {
            //请求失败回调
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        //把请求添加到volley的请求队列里面
        Volley.newRequestQueue(getApplicationContext()).add(request);


    }

    //开始解析
//    result: url返回的文本
    private void dealData(String result) {
        //单个book解析方式
        Book book = JSON.parseObject(result, Book.class);

        //输出结果
        Log.i("info",book.getTitle()+":"+book.getPublisher()+":"+book.getTags());

        /**
         *  book列表解析方式
         */

//        List<Book> books = JSON.parseObject(result,new TypeReference<List<Book>>(){
//
//        });


        /**
         * Book 实体解析成json数据
         */

//        Book book1 = new Book();
//        book1.setTitle("biaoti");
//
//        Book book2 = new Book();
//        book1.setTitle("biaoti");
//
//        Book book2 = new Book();
//        book1.setTitle("biaoti");
//
//        JSON.toJSON(book1);


        /**
         * 集合类转换成json数据
         */

//        List<Book> list = new ArrayList<Book>()；
//        list.add(book1);
//        list.add(book2);
//        list.add(book3);
//        JSON.toJSON(list);



    }
}
