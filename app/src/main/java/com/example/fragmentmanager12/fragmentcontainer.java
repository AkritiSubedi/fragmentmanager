package com.example.fragmentmanager12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class fragmentcontainer extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b)
    {
        View view = inflater.inflate(R.layout.fragmentcontainer, container, false);
        return view;
    }
}
