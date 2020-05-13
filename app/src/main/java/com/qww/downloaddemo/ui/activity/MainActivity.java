package com.qww.downloaddemo.ui.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.qww.downloaddemo.R;
import com.qww.downloaddemo.ui.adapter.PostJsonListAdapter;
import com.qww.downloaddemo.model.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean;
import com.qww.downloaddemo.presenter.impl.MainActivityPresenterImpl;
import com.qww.downloaddemo.view.IMainActivityCallback;

public class MainActivity extends AppCompatActivity implements IMainActivityCallback {

    private RecyclerView recyclerView;
    private PostJsonListAdapter mAdapter;
    private MainActivityPresenterImpl mainActivityPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPresenter();
        initView();

    }


    private void initPresenter() {
        mainActivityPresenter = new MainActivityPresenterImpl();
        mainActivityPresenter.registerCallback(this);
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

        loadData();
    }

    private void loadData() {
        mainActivityPresenter.requestData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mainActivityPresenter != null) {
            mainActivityPresenter.unRegisterCallback(this);
        }
    }

    @Override
    public void onDataLoaded(PagebeanBean pagebeanBean) {
        if (mAdapter != null) {
            mAdapter.setData(pagebeanBean);
        }
    }
}
