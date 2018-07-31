package com.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    /**
     * travel_user_info
     */
    protected String orderByClause;

    /**
     * travel_user_info
     */
    protected boolean distinct;

    /**
     * travel_user_info
     */
    protected List<Criteria> oredCriteria;

    /**
     * travel_user_info
     */
    protected Integer limitStart;

    /**
     * travel_user_info
     */
    protected Integer limitEnd;

    /**
     *
     * @mbg.generated
     */
    public UserInfoExample() {
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
     * travel_user_info null
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Byte value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Byte value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Byte value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Byte value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Byte value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Byte value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Byte> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Byte> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Byte value1, Byte value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("role not between", value1, value2, "role");
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

        public Criteria andUpdatedTmIsNull() {
            addCriterion("updated_tm is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmIsNotNull() {
            addCriterion("updated_tm is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmEqualTo(Date value) {
            addCriterion("updated_tm =", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmNotEqualTo(Date value) {
            addCriterion("updated_tm <>", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmGreaterThan(Date value) {
            addCriterion("updated_tm >", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_tm >=", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmLessThan(Date value) {
            addCriterion("updated_tm <", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmLessThanOrEqualTo(Date value) {
            addCriterion("updated_tm <=", value, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmIn(List<Date> values) {
            addCriterion("updated_tm in", values, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmNotIn(List<Date> values) {
            addCriterion("updated_tm not in", values, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmBetween(Date value1, Date value2) {
            addCriterion("updated_tm between", value1, value2, "updatedTm");
            return (Criteria) this;
        }

        public Criteria andUpdatedTmNotBetween(Date value1, Date value2) {
            addCriterion("updated_tm not between", value1, value2, "updatedTm");
            return (Criteria) this;
        }
    }

    /**
     * travel_user_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * travel_user_info null
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