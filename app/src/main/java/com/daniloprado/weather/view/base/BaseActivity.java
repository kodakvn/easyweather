package com.daniloprado.weather.view.base;

import com.daniloprado.weather.MainApplication;
import com.daniloprado.weather.dagger.DiComponent;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private MainApplication getMainApplication() {
        return (MainApplication) getApplication();
    }

    protected DiComponent getDiComponent() {
        return getMainApplication().getDiComponent();
    }

}
