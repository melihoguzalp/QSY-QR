package com.example.qsy_qr.data.model;

import com.google.gson.annotations.SerializedName;

public class QrSaleResponse {
    @SerializedName("returnCode")
    private Integer returnCode;

    @SerializedName("returnDesc")
    private String returnDesc;

    @SerializedName("QRdata")
    private String QRdata;

    public QrSaleResponse(Integer returnCode, String returnDesc, String QRdata) {
        this.returnCode = returnCode;
        this.returnDesc = returnDesc;
        this.QRdata = QRdata;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public String getQRdata() {
        return QRdata;
    }

    public void setQRdata(String QRdata) {
        this.QRdata = QRdata;
    }
}