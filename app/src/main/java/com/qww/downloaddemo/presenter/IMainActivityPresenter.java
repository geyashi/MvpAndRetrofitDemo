package com.qww.downloaddemo.presenter;

import com.qww.downloaddemo.view.IMainActivityCallback;

public interface IMainActivityPresenter {
    //获取列表数据
    void requestData();

    void registerCallback(IMainActivityCallback callback);

    void unRegisterCallback(IMainActivityCallback callback);
}
