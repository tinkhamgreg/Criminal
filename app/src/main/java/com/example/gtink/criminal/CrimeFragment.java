package com.example.gtink.criminal;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class CrimeFragment extends android.support.v4.app.Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private static final String TAG = "CrimeActivity";
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);


        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {


           /**The OnTextChanged method is defined within the TextView class.
            *EditText objects have access to this method because EditText is a subclass
            of textview that configures the textview for editing.
            */
            @Override
            public void onTextChanged(
                    CharSequence c, int start, int before, int count) {
                    //mCrime.setTitle(c.toString());
                    Log.d(TAG, "onTextChanged() called");

            }

            public void beforeTextChanged(
                    CharSequence c, int start, int count, int after) {
                // This space intentionally left blank
            }

            public void afterTextChanged(Editable c) {
                // This one too
            }
        });
        mDateButton = (Button)v.findViewById(R.id.crime_date);
        mDateButton.setText(mCrime.getDate().toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Set the crime's solved property
                mCrime.setSolved(isChecked);
            }
        });
        return v;
    }

}
