package com.example.qsy_qr.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.qsy_qr.data.model.QrSaleRequest;
import com.example.qsy_qr.data.model.QrSaleResponse;
import com.example.qsy_qr.data.remote.RestAPI;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@HiltViewModel
public class MainViewModel extends ViewModel {
    private RestAPI restAPI;

    @Inject
    public MainViewModel(RestAPI restAPI) {
        this.restAPI = restAPI;
    }

    private MutableLiveData<QrSaleResponse> _qrSaleResponse = new MutableLiveData<QrSaleResponse>();
    public LiveData<QrSaleResponse> getQrSaleResponse() {
        return _qrSaleResponse;
    }

    public void getQrSale(QrSaleRequest qrSaleRequest) {
        restAPI.getQrSale(qrSaleRequest)
                .enqueue(new Callback<QrSaleResponse>() {
                    @Override
                    public void onResponse(Call<QrSaleResponse> call, Response<QrSaleResponse> response) {
                        _qrSaleResponse.setValue(response.body());
                    }

                    @Override
                    public void onFailure(Call<QrSaleResponse> call, Throwable t) {
                        _qrSaleResponse.setValue(null);
                    }
                });
    }
}