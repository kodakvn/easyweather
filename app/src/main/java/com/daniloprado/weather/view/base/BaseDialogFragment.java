package com.daniloprado.weather.view.base;

import android.os.Bundle;
import android.view.View;

import com.daniloprado.weather.MainApplication;
import com.daniloprado.weather.dagger.DiComponent;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import butterknife.ButterKnife;

public abstract class BaseDialogFragment extends DialogFragment {

    private MainApplication getMainApplication() {
        return (MainApplication) getActivity().getApplication();
    }

    protected DiComponent getDiComponent() {
        return getMainApplication().getDiComponent();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }
}
