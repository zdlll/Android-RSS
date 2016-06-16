package com.scnu.nita22.androidrss.gank;

import com.scnu.nita22.androidrss.BasePresenter;
import com.scnu.nita22.androidrss.BaseView;

/**
 * Created by nita22 on 2016/6/14.
 */

public interface GankContract {

    interface GankView extends BaseView<GankPresenter> {
        void showRecyclerView();
        void updateRecyclerView();
        void updateData(GankData.ResultsBean resultsBean);
        void showFinishedSnackBar();
        void showErrorSnackBar();
    }

    interface GankPresenter extends BasePresenter {
        @Override
        void getData();

        @Override
        void disconnect();
    }
}
