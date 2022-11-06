package com.example.testviewmodel;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class HomeFragment extends Fragment{

    EditText editText;
    DataInterface dataInterface;
    AppCompatButton button;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof DataInterface) {
            dataInterface = (DataInterface) context;
        } else {
            throw new RuntimeException(context.toString() + "Can phai implement");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        editText = view.findViewById(R.id.text_1);
        button = view.findViewById(R.id.btn_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataInterface.getMessage(editText.getText().toString());
            }
        });


        return view;
    }
}