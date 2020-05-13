package com.qww.downloaddemo;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.qww.downloaddemo.adapter.PostJsonListAdapter;
import com.qww.downloaddemo.domain.PostWithParamsResult;
import com.qww.downloaddemo.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean;
import com.qww.downloaddemo.utils.RetrofitManager;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PostJsonListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sjsjocjizococ
        String SH = "hs"
        String SH = "hs"
        String SH = "hs"
        String SH = "hs"
        String SH = "hs"
        int i = 0;
        int i = 0;
        int i = 0;
        int i = 0;
        int i = 0;
        initView();
        if (i < 10) {

        }

    }

    private void initView() {
        recyclerView = this.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.top = 2;
                outRect.bottom = 2;
            }
        });
        mAdapter = new PostJsonListAdapter();
        recyclerView.setAdapter(mAdapter);
    }

    public void click(View view) {
        API api = RetrofitManager.getRetrofit().create(API.class);
        Call<PostWithParamsResult> task = api.postWithParam("206023",
                                "093d0688540b4c4fafd2567822dec6bf",
                                "20200512144439",
                                "0");
        task.enqueue(new Callback<PostWithParamsResult>() {
            @Override
            public void onResponse(Call<PostWithParamsResult> call, Response<PostWithParamsResult> response) {
                int code = response.code();
                Log.d("MainActivity", "code:" + code);
                if (code == HttpURLConnection.HTTP_OK) {
                    PostWithParamsResult postWithParamsResult = response.body();
                    PagebeanBean pagebean = postWithParamsResult.getShowapi_res_body().getPagebean();
                    if (postWithParamsResult != null) {
                        Log.d("MainActivity", postWithParamsResult.toString());
                        Log.d("MainActivity", pagebean.toString());
                        upDataList(pagebean);
                    }
                }
            }

            @Override
            public void onFailure(Call<PostWithParamsResult> call, Throwable t) {
                Log.d("MainActivity", t.toString());
            }
        });
    }

    private void upDataList(PagebeanBean pagebeanBean) {
        mAdapter.setData(pagebeanBean);
    }
}
