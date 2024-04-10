package com.example.olioprojekti;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class AddGroceryFragment extends Fragment {
    private EditText editGroceryName;
    private EditText editGroceryNote;
    private CheckBox checkImportant;
    private Button buttonAddGrocery;

    public AddGroceryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_grocery, container, false);

        editGroceryName = view.findViewById(R.id.editGroceryName);
        editGroceryNote = view.findViewById(R.id.editGroceryNote);
        checkImportant = view.findViewById(R.id.checkImportant);
        buttonAddGrocery = view.findViewById(R.id.buttonAddGrocery);

        buttonAddGrocery.setOnClickListener(v -> {
            String name = editGroceryName.getText().toString();
            String note = editGroceryNote.getText().toString();
            boolean important = checkImportant.isChecked();


            ListGrocery.getInstance().addGrocery(name, note, important);





            editGroceryName.setText("");
            editGroceryNote.setText("");
            checkImportant.setChecked(false);
        });

        return view;
    }


}

