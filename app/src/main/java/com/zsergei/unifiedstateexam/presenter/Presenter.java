package com.zsergei.unifiedstateexam.presenter;

import com.zsergei.unifiedstateexam.model.IModel;
import com.zsergei.unifiedstateexam.model.Model;
import com.zsergei.unifiedstateexam.view.LearningView;

/**
 * Created by Sergei Zarochentsev on 27.11.2015.
 */
public class Presenter implements IPresenter {
    private LearningView learningView;
    private IModel model;

    public Presenter(LearningView view) {
        learningView = view;
        model = new Model(this);
    }

    @Override
    public void next() {

    }
}
