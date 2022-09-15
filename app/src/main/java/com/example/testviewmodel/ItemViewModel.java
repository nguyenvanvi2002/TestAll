package com.example.testviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItemViewModel extends ViewModel {
    private MutableLiveData<String> selectedItem = new MutableLiveData<>();

    public void setData(String item){
        selectedItem.setValue(item);
    }

    public LiveData<String> getSelectedItem(){
        return selectedItem;
    }
}
