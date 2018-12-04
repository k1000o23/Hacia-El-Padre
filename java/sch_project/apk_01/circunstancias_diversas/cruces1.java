package sch_project.apk_01.circunstancias_diversas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sch_project.apk_01.R;

public class cruces1 extends Fragment {
    private boolean favoritos = false;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.cruces_consideracion, container, false);
    }

}
