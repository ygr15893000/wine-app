package com.siran.mode;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/8/29.
 */
public class TOrder {
    private int id;
    private byte type;
    private String firstOrderNo;
    private String orderNo;
    private String outRefundNo;
    private Integer itemId;
    private int num;
    private BigDecimal amount;
    private BigDecimal realAmount;
    private BigDecimal firstPay;
    private BigDecimal endPay;
    private byte status;
    private String updateTime;
    private String shippingName;
    private String shippingCode;
    private String shippingNo;
    private int userId;
    private String prepayId;
    private Integer itemConfigAgioId;
    private Integer ifCommission;
    private String receiverName;
    private String receiverPhone;
    private String receiverMobile;
    private String receiverState;
    private String receiverCity;
    private String receiverRegion;
    private String receiverAddress;
    private String receiverZip;
    private String createTime;
    private String firstPaymentTime;
    private String paymenTime;
    private String refundTime;
    private String outRefundTime;
    private String consignTime;
    private String applyReturnsTime;
    private String returnsTime;
    private Byte receivedType;
    private String sellerReceivedTime;
    private String endTime;
    private String closeTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getFirstOrderNo() {
        return firstOrderNo;
    }

    public void setFirstOrderNo(String firstOrderNo) {
        this.firstOrderNo = firstOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getFirstPay() {
        return firstPay;
    }

    public void setFirstPay(BigDecimal firstPay) {
        this.firstPay = firstPay;
    }

    public BigDecimal getEndPay() {
        return endPay;
    }

    public void setEndPay(BigDecimal endPay) {
        this.endPay = endPay;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingNo() {
        return shippingNo;
    }

    public void setShippingNo(String shippingNo) {
        this.shippingNo = shippingNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public Integer getItemConfigAgioId() {
        return itemConfigAgioId;
    }

    public void setItemConfigAgioId(Integer itemConfigAgioId) {
        this.itemConfigAgioId = itemConfigAgioId;
    }

    public Integer getIfCommission() {
        return ifCommission;
    }

    public void setIfCommission(Integer ifCommission) {
        this.ifCommission = ifCommission;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFirstPaymentTime() {
        return firstPaymentTime;
    }

    public void setFirstPaymentTime(String firstPaymentTime) {
        this.firstPaymentTime = firstPaymentTime;
    }

    public String getPaymenTime() {
        return paymenTime;
    }

    public void setPaymenTime(String paymenTime) {
        this.paymenTime = paymenTime;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getOutRefundTime() {
        return outRefundTime;
    }

    public void setOutRefundTime(String outRefundTime) {
        this.outRefundTime = outRefundTime;
    }

    public String getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public String getApplyReturnsTime() {
        return applyReturnsTime;
    }

    public void setApplyReturnsTime(String applyReturnsTime) {
        this.applyReturnsTime = applyReturnsTime;
    }

    public String getReturnsTime() {
        return returnsTime;
    }

    public void setReturnsTime(String returnsTime) {
        this.returnsTime = returnsTime;
    }

    public Byte getReceivedType() {
        return receivedType;
    }

    public void setReceivedType(Byte receivedType) {
        this.receivedType = receivedType;
    }

    public String getSellerReceivedTime() {
        return sellerReceivedTime;
    }

    public void setSellerReceivedTime(String sellerReceivedTime) {
        this.sellerReceivedTime = sellerReceivedTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TOrder tOrder = (TOrder) o;

        if (id != tOrder.id) return false;
        if (type != tOrder.type) return false;
        if (num != tOrder.num) return false;
        if (status != tOrder.status) return false;
        if (userId != tOrder.userId) return false;
        if (firstOrderNo != null ? !firstOrderNo.equals(tOrder.firstOrderNo) : tOrder.firstOrderNo != null)
            return false;
        if (orderNo != null ? !orderNo.equals(tOrder.orderNo) : tOrder.orderNo != null) return false;
        if (outRefundNo != null ? !outRefundNo.equals(tOrder.outRefundNo) : tOrder.outRefundNo != null) return false;
        if (itemId != null ? !itemId.equals(tOrder.itemId) : tOrder.itemId != null) return false;
        if (amount != null ? !amount.equals(tOrder.amount) : tOrder.amount != null) return false;
        if (realAmount != null ? !realAmount.equals(tOrder.realAmount) : tOrder.realAmount != null) return false;
        if (firstPay != null ? !firstPay.equals(tOrder.firstPay) : tOrder.firstPay != null) return false;
        if (endPay != null ? !endPay.equals(tOrder.endPay) : tOrder.endPay != null) return false;
        if (updateTime != null ? !updateTime.equals(tOrder.updateTime) : tOrder.updateTime != null) return false;
        if (shippingName != null ? !shippingName.equals(tOrder.shippingName) : tOrder.shippingName != null)
            return false;
        if (shippingCode != null ? !shippingCode.equals(tOrder.shippingCode) : tOrder.shippingCode != null)
            return false;
        if (shippingNo != null ? !shippingNo.equals(tOrder.shippingNo) : tOrder.shippingNo != null) return false;
        if (prepayId != null ? !prepayId.equals(tOrder.prepayId) : tOrder.prepayId != null) return false;
        if (itemConfigAgioId != null ? !itemConfigAgioId.equals(tOrder.itemConfigAgioId) : tOrder.itemConfigAgioId != null)
            return false;
        if (ifCommission != null ? !ifCommission.equals(tOrder.ifCommission) : tOrder.ifCommission != null)
            return false;
        if (receiverName != null ? !receiverName.equals(tOrder.receiverName) : tOrder.receiverName != null)
            return false;
        if (receiverPhone != null ? !receiverPhone.equals(tOrder.receiverPhone) : tOrder.receiverPhone != null)
            return false;
        if (receiverMobile != null ? !receiverMobile.equals(tOrder.receiverMobile) : tOrder.receiverMobile != null)
            return false;
        if (receiverState != null ? !receiverState.equals(tOrder.receiverState) : tOrder.receiverState != null)
            return false;
        if (receiverCity != null ? !receiverCity.equals(tOrder.receiverCity) : tOrder.receiverCity != null)
            return false;
        if (receiverRegion != null ? !receiverRegion.equals(tOrder.receiverRegion) : tOrder.receiverRegion != null)
            return false;
        if (receiverAddress != null ? !receiverAddress.equals(tOrder.receiverAddress) : tOrder.receiverAddress != null)
            return false;
        if (receiverZip != null ? !receiverZip.equals(tOrder.receiverZip) : tOrder.receiverZip != null) return false;
        if (createTime != null ? !createTime.equals(tOrder.createTime) : tOrder.createTime != null) return false;
        if (firstPaymentTime != null ? !firstPaymentTime.equals(tOrder.firstPaymentTime) : tOrder.firstPaymentTime != null)
            return false;
        if (paymenTime != null ? !paymenTime.equals(tOrder.paymenTime) : tOrder.paymenTime != null) return false;
        if (refundTime != null ? !refundTime.equals(tOrder.refundTime) : tOrder.refundTime != null) return false;
        if (outRefundTime != null ? !outRefundTime.equals(tOrder.outRefundTime) : tOrder.outRefundTime != null)
            return false;
        if (consignTime != null ? !consignTime.equals(tOrder.consignTime) : tOrder.consignTime != null) return false;
        if (applyReturnsTime != null ? !applyReturnsTime.equals(tOrder.applyReturnsTime) : tOrder.applyReturnsTime != null)
            return false;
        if (returnsTime != null ? !returnsTime.equals(tOrder.returnsTime) : tOrder.returnsTime != null) return false;
        if (receivedType != null ? !receivedType.equals(tOrder.receivedType) : tOrder.receivedType != null)
            return false;
        if (sellerReceivedTime != null ? !sellerReceivedTime.equals(tOrder.sellerReceivedTime) : tOrder.sellerReceivedTime != null)
            return false;
        if (endTime != null ? !endTime.equals(tOrder.endTime) : tOrder.endTime != null) return false;
        if (closeTime != null ? !closeTime.equals(tOrder.closeTime) : tOrder.closeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) type;
        result = 31 * result + (firstOrderNo != null ? firstOrderNo.hashCode() : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        result = 31 * result + (outRefundNo != null ? outRefundNo.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (realAmount != null ? realAmount.hashCode() : 0);
        result = 31 * result + (firstPay != null ? firstPay.hashCode() : 0);
        result = 31 * result + (endPay != null ? endPay.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (shippingName != null ? shippingName.hashCode() : 0);
        result = 31 * result + (shippingCode != null ? shippingCode.hashCode() : 0);
        result = 31 * result + (shippingNo != null ? shippingNo.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + (prepayId != null ? prepayId.hashCode() : 0);
        result = 31 * result + (itemConfigAgioId != null ? itemConfigAgioId.hashCode() : 0);
        result = 31 * result + (ifCommission != null ? ifCommission.hashCode() : 0);
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (receiverMobile != null ? receiverMobile.hashCode() : 0);
        result = 31 * result + (receiverState != null ? receiverState.hashCode() : 0);
        result = 31 * result + (receiverCity != null ? receiverCity.hashCode() : 0);
        result = 31 * result + (receiverRegion != null ? receiverRegion.hashCode() : 0);
        result = 31 * result + (receiverAddress != null ? receiverAddress.hashCode() : 0);
        result = 31 * result + (receiverZip != null ? receiverZip.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (firstPaymentTime != null ? firstPaymentTime.hashCode() : 0);
        result = 31 * result + (paymenTime != null ? paymenTime.hashCode() : 0);
        result = 31 * result + (refundTime != null ? refundTime.hashCode() : 0);
        result = 31 * result + (outRefundTime != null ? outRefundTime.hashCode() : 0);
        result = 31 * result + (consignTime != null ? consignTime.hashCode() : 0);
        result = 31 * result + (applyReturnsTime != null ? applyReturnsTime.hashCode() : 0);
        result = 31 * result + (returnsTime != null ? returnsTime.hashCode() : 0);
        result = 31 * result + (receivedType != null ? receivedType.hashCode() : 0);
        result = 31 * result + (sellerReceivedTime != null ? sellerReceivedTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        return result;
    }
}
