package com.example.qsy_qr.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.qsy_qr.data.model.QrSaleRequest;
import com.example.qsy_qr.data.model.QrSaleResponse;
import com.example.qsy_qr.databinding.ActivityMainBinding;
import com.example.qsy_qr.viewmodel.MainViewModel;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        setupListeners();
        setupObservers();

    }

    private void setupListeners() {
        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.getQrSale(new QrSaleRequest(100));
            }
        });
    }

    private void setupObservers() {
        mainViewModel.getQrSaleResponse().observe(this, new Observer<QrSaleResponse>() {
            @Override
            public void onChanged(QrSaleResponse qrSaleResponse) {
                Log.i("TEST", "Qr: " + qrSaleResponse.getQRdata());
            }
        });
    }
}