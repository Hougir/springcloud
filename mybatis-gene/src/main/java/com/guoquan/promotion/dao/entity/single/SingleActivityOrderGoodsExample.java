package com.guoquan.promotion.dao.entity.single;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingleActivityOrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingleActivityOrderGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Byte value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Byte value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Byte value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Byte value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Byte value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Byte> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Byte> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Byte value1, Byte value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberIsNull() {
            addCriterion("goods_discount_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberIsNotNull() {
            addCriterion("goods_discount_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberEqualTo(Byte value) {
            addCriterion("goods_discount_number =", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberNotEqualTo(Byte value) {
            addCriterion("goods_discount_number <>", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberGreaterThan(Byte value) {
            addCriterion("goods_discount_number >", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_discount_number >=", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberLessThan(Byte value) {
            addCriterion("goods_discount_number <", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberLessThanOrEqualTo(Byte value) {
            addCriterion("goods_discount_number <=", value, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberIn(List<Byte> values) {
            addCriterion("goods_discount_number in", values, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberNotIn(List<Byte> values) {
            addCriterion("goods_discount_number not in", values, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberBetween(Byte value1, Byte value2) {
            addCriterion("goods_discount_number between", value1, value2, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_discount_number not between", value1, value2, "goodsDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberIsNull() {
            addCriterion("goods_refund_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberIsNotNull() {
            addCriterion("goods_refund_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberEqualTo(Byte value) {
            addCriterion("goods_refund_number =", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberNotEqualTo(Byte value) {
            addCriterion("goods_refund_number <>", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberGreaterThan(Byte value) {
            addCriterion("goods_refund_number >", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_refund_number >=", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberLessThan(Byte value) {
            addCriterion("goods_refund_number <", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberLessThanOrEqualTo(Byte value) {
            addCriterion("goods_refund_number <=", value, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberIn(List<Byte> values) {
            addCriterion("goods_refund_number in", values, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberNotIn(List<Byte> values) {
            addCriterion("goods_refund_number not in", values, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberBetween(Byte value1, Byte value2) {
            addCriterion("goods_refund_number between", value1, value2, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsRefundNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_refund_number not between", value1, value2, "goodsRefundNumber");
            return (Criteria) this;
        }

        public Criteria andActivityPriceIsNull() {
            addCriterion("activity_price is null");
            return (Criteria) this;
        }

        public Criteria andActivityPriceIsNotNull() {
            addCriterion("activity_price is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPriceEqualTo(BigDecimal value) {
            addCriterion("activity_price =", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotEqualTo(BigDecimal value) {
            addCriterion("activity_price <>", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceGreaterThan(BigDecimal value) {
            addCriterion("activity_price >", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_price >=", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceLessThan(BigDecimal value) {
            addCriterion("activity_price <", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_price <=", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceIn(List<BigDecimal> values) {
            addCriterion("activity_price in", values, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotIn(List<BigDecimal> values) {
            addCriterion("activity_price not in", values, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_price between", value1, value2, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_price not between", value1, value2, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andDisAmountIsNull() {
            addCriterion("dis_amount is null");
            return (Criteria) this;
        }

        public Criteria andDisAmountIsNotNull() {
            addCriterion("dis_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDisAmountEqualTo(BigDecimal value) {
            addCriterion("dis_amount =", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotEqualTo(BigDecimal value) {
            addCriterion("dis_amount <>", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountGreaterThan(BigDecimal value) {
            addCriterion("dis_amount >", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_amount >=", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountLessThan(BigDecimal value) {
            addCriterion("dis_amount <", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_amount <=", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountIn(List<BigDecimal> values) {
            addCriterion("dis_amount in", values, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotIn(List<BigDecimal> values) {
            addCriterion("dis_amount not in", values, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_amount between", value1, value2, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_amount not between", value1, value2, "disAmount");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyIsNull() {
            addCriterion("platform_subsidy is null");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyIsNotNull() {
            addCriterion("platform_subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyEqualTo(BigDecimal value) {
            addCriterion("platform_subsidy =", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyNotEqualTo(BigDecimal value) {
            addCriterion("platform_subsidy <>", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyGreaterThan(BigDecimal value) {
            addCriterion("platform_subsidy >", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_subsidy >=", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyLessThan(BigDecimal value) {
            addCriterion("platform_subsidy <", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_subsidy <=", value, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyIn(List<BigDecimal> values) {
            addCriterion("platform_subsidy in", values, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyNotIn(List<BigDecimal> values) {
            addCriterion("platform_subsidy not in", values, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_subsidy between", value1, value2, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andPlatformSubsidyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_subsidy not between", value1, value2, "platformSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyIsNull() {
            addCriterion("shop_subsidy is null");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyIsNotNull() {
            addCriterion("shop_subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyEqualTo(BigDecimal value) {
            addCriterion("shop_subsidy =", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyNotEqualTo(BigDecimal value) {
            addCriterion("shop_subsidy <>", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyGreaterThan(BigDecimal value) {
            addCriterion("shop_subsidy >", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_subsidy >=", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyLessThan(BigDecimal value) {
            addCriterion("shop_subsidy <", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_subsidy <=", value, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyIn(List<BigDecimal> values) {
            addCriterion("shop_subsidy in", values, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyNotIn(List<BigDecimal> values) {
            addCriterion("shop_subsidy not in", values, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_subsidy between", value1, value2, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andShopSubsidyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_subsidy not between", value1, value2, "shopSubsidy");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}