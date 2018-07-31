package com.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaptureRecordExample {
    /**
     * travel_capture_record
     */
    protected String orderByClause;

    /**
     * travel_capture_record
     */
    protected boolean distinct;

    /**
     * travel_capture_record
     */
    protected List<Criteria> oredCriteria;

    /**
     * travel_capture_record
     */
    protected Integer limitStart;

    /**
     * travel_capture_record
     */
    protected Integer limitEnd;

    /**
     *
     * @mbg.generated
     */
    public CaptureRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     *
     * @mbg.generated
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * travel_capture_record null
     */
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

        public Criteria andStrongPetIdIsNull() {
            addCriterion("strong_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdIsNotNull() {
            addCriterion("strong_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdEqualTo(Long value) {
            addCriterion("strong_pet_id =", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdNotEqualTo(Long value) {
            addCriterion("strong_pet_id <>", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdGreaterThan(Long value) {
            addCriterion("strong_pet_id >", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("strong_pet_id >=", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdLessThan(Long value) {
            addCriterion("strong_pet_id <", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdLessThanOrEqualTo(Long value) {
            addCriterion("strong_pet_id <=", value, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdIn(List<Long> values) {
            addCriterion("strong_pet_id in", values, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdNotIn(List<Long> values) {
            addCriterion("strong_pet_id not in", values, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdBetween(Long value1, Long value2) {
            addCriterion("strong_pet_id between", value1, value2, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andStrongPetIdNotBetween(Long value1, Long value2) {
            addCriterion("strong_pet_id not between", value1, value2, "strongPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdIsNull() {
            addCriterion("weak_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdIsNotNull() {
            addCriterion("weak_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdEqualTo(Long value) {
            addCriterion("weak_pet_id =", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdNotEqualTo(Long value) {
            addCriterion("weak_pet_id <>", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdGreaterThan(Long value) {
            addCriterion("weak_pet_id >", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("weak_pet_id >=", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdLessThan(Long value) {
            addCriterion("weak_pet_id <", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdLessThanOrEqualTo(Long value) {
            addCriterion("weak_pet_id <=", value, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdIn(List<Long> values) {
            addCriterion("weak_pet_id in", values, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdNotIn(List<Long> values) {
            addCriterion("weak_pet_id not in", values, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdBetween(Long value1, Long value2) {
            addCriterion("weak_pet_id between", value1, value2, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andWeakPetIdNotBetween(Long value1, Long value2) {
            addCriterion("weak_pet_id not between", value1, value2, "weakPetId");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNull() {
            addCriterion("address_uid is null");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNotNull() {
            addCriterion("address_uid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUidEqualTo(String value) {
            addCriterion("address_uid =", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotEqualTo(String value) {
            addCriterion("address_uid <>", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThan(String value) {
            addCriterion("address_uid >", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThanOrEqualTo(String value) {
            addCriterion("address_uid >=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThan(String value) {
            addCriterion("address_uid <", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThanOrEqualTo(String value) {
            addCriterion("address_uid <=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLike(String value) {
            addCriterion("address_uid like", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotLike(String value) {
            addCriterion("address_uid not like", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidIn(List<String> values) {
            addCriterion("address_uid in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotIn(List<String> values) {
            addCriterion("address_uid not in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidBetween(String value1, String value2) {
            addCriterion("address_uid between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotBetween(String value1, String value2) {
            addCriterion("address_uid not between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatedTmIsNull() {
            addCriterion("created_tm is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmIsNotNull() {
            addCriterion("created_tm is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmEqualTo(Date value) {
            addCriterion("created_tm =", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmNotEqualTo(Date value) {
            addCriterion("created_tm <>", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmGreaterThan(Date value) {
            addCriterion("created_tm >", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmGreaterThanOrEqualTo(Date value) {
            addCriterion("created_tm >=", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmLessThan(Date value) {
            addCriterion("created_tm <", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmLessThanOrEqualTo(Date value) {
            addCriterion("created_tm <=", value, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmIn(List<Date> values) {
            addCriterion("created_tm in", values, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmNotIn(List<Date> values) {
            addCriterion("created_tm not in", values, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmBetween(Date value1, Date value2) {
            addCriterion("created_tm between", value1, value2, "createdTm");
            return (Criteria) this;
        }

        public Criteria andCreatedTmNotBetween(Date value1, Date value2) {
            addCriterion("created_tm not between", value1, value2, "createdTm");
            return (Criteria) this;
        }
    }

    /**
     * travel_capture_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * travel_capture_record null
     */
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