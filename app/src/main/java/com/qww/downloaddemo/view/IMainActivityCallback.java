package com.qww.downloaddemo.view;

import com.qww.downloaddemo.model.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean;

public interface IMainActivityCallback {

    void onDataLoaded(PagebeanBean pagebeanBean);
}
