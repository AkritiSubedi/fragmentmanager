package com.example.fragmentmanager12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b)
    {
        View view = inflater.inflate(R.layout.fragment2, container,false);
        return view;
    }
}
