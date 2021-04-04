package com.example.qsy_qr.data.model;

import com.google.gson.annotations.SerializedName;

public class QrSaleRequest {

    @SerializedName("totalReceiptAmount")
    private Integer totalReceiptAmount;

    public QrSaleRequest(Integer totalReceiptAmount) {
        this.totalReceiptAmount = totalReceiptAmount;
    }

    public Integer getTotalReceiptAmount() {
        return totalReceiptAmount;
    }

    public void setTotalReceiptAmount(Integer totalReceiptAmount) {
        this.totalReceiptAmount = totalReceiptAmount;
    }
}
