package com.example.qsy_qr.data.remote;

import com.example.qsy_qr.data.model.QrSaleRequest;
import com.example.qsy_qr.data.model.QrSaleResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RestAPI {
    @POST("get_qr_sale")
    @Headers({
            "X-IBM-Client-Id: d56a0277-2ee3-4ae5-97c8-467abeda984d",
            "X-IBM-Client-Secret: L7jT3xD5fA7uG1fC6hQ4fV4sE5fU5hG8xR6oH2mI6nE1cS0bV6",
    })
    public Call<QrSaleResponse> getQrSale(@Body QrSaleRequest qrSaleRequest);
}
