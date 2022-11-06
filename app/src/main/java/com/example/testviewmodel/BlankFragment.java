package com.example.testviewmodel;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragment extends Fragment{
    AppCompatButton button;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        button = view.findViewById(R.id.btn_1);
        editText = view.findViewById(R.id.text_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragment homeFragment = new HomeFragment();

                String text = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("text",text);
                homeFragment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.frame_layout1, homeFragment).commit();
            }
        });


        return view;
    }
}