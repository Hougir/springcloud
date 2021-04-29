package com.guoquan.promotion.dao.entity.single;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SingleActivityOrderGoods implements Serializable {
    private Long id;

    private String orderNo;

    private Long goodsId;

    private String goodsCode;

    private BigDecimal goodsPrice;

    private Byte goodsNumber;

    private Byte goodsDiscountNumber;

    private Byte goodsRefundNumber;

    private BigDecimal activityPrice;

    private BigDecimal disAmount;

    private Long activityId;

    private BigDecimal platformSubsidy;

    private BigDecimal shopSubsidy;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Byte getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Byte goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Byte getGoodsDiscountNumber() {
        return goodsDiscountNumber;
    }

    public void setGoodsDiscountNumber(Byte goodsDiscountNumber) {
        this.goodsDiscountNumber = goodsDiscountNumber;
    }

    public Byte getGoodsRefundNumber() {
        return goodsRefundNumber;
    }

    public void setGoodsRefundNumber(Byte goodsRefundNumber) {
        this.goodsRefundNumber = goodsRefundNumber;
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public BigDecimal getDisAmount() {
        return disAmount;
    }

    public void setDisAmount(BigDecimal disAmount) {
        this.disAmount = disAmount;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public BigDecimal getPlatformSubsidy() {
        return platformSubsidy;
    }

    public void setPlatformSubsidy(BigDecimal platformSubsidy) {
        this.platformSubsidy = platformSubsidy;
    }

    public BigDecimal getShopSubsidy() {
        return shopSubsidy;
    }

    public void setShopSubsidy(BigDecimal shopSubsidy) {
        this.shopSubsidy = shopSubsidy;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SingleActivityOrderGoods other = (SingleActivityOrderGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getGoodsDiscountNumber() == null ? other.getGoodsDiscountNumber() == null : this.getGoodsDiscountNumber().equals(other.getGoodsDiscountNumber()))
            && (this.getGoodsRefundNumber() == null ? other.getGoodsRefundNumber() == null : this.getGoodsRefundNumber().equals(other.getGoodsRefundNumber()))
            && (this.getActivityPrice() == null ? other.getActivityPrice() == null : this.getActivityPrice().equals(other.getActivityPrice()))
            && (this.getDisAmount() == null ? other.getDisAmount() == null : this.getDisAmount().equals(other.getDisAmount()))
            && (this.getActivityId() == null ? other.getActivityId() == null : this.getActivityId().equals(other.getActivityId()))
            && (this.getPlatformSubsidy() == null ? other.getPlatformSubsidy() == null : this.getPlatformSubsidy().equals(other.getPlatformSubsidy()))
            && (this.getShopSubsidy() == null ? other.getShopSubsidy() == null : this.getShopSubsidy().equals(other.getShopSubsidy()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getGoodsDiscountNumber() == null) ? 0 : getGoodsDiscountNumber().hashCode());
        result = prime * result + ((getGoodsRefundNumber() == null) ? 0 : getGoodsRefundNumber().hashCode());
        result = prime * result + ((getActivityPrice() == null) ? 0 : getActivityPrice().hashCode());
        result = prime * result + ((getDisAmount() == null) ? 0 : getDisAmount().hashCode());
        result = prime * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        result = prime * result + ((getPlatformSubsidy() == null) ? 0 : getPlatformSubsidy().hashCode());
        result = prime * result + ((getShopSubsidy() == null) ? 0 : getShopSubsidy().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsDiscountNumber=").append(goodsDiscountNumber);
        sb.append(", goodsRefundNumber=").append(goodsRefundNumber);
        sb.append(", activityPrice=").append(activityPrice);
        sb.append(", disAmount=").append(disAmount);
        sb.append(", activityId=").append(activityId);
        sb.append(", platformSubsidy=").append(platformSubsidy);
        sb.append(", shopSubsidy=").append(shopSubsidy);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}