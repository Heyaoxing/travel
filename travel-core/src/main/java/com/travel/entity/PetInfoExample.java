package com.travel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetInfoExample {
    /**
     * travel_pet_info
     */
    protected String orderByClause;

    /**
     * travel_pet_info
     */
    protected boolean distinct;

    /**
     * travel_pet_info
     */
    protected List<Criteria> oredCriteria;

    /**
     * travel_pet_info
     */
    protected Integer limitStart;

    /**
     * travel_pet_info
     */
    protected Integer limitEnd;

    /**
     *
     * @mbg.generated
     */
    public PetInfoExample() {
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
     * travel_pet_info null
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdIsNull() {
            addCriterion("parent_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andParentPetIdIsNotNull() {
            addCriterion("parent_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentPetIdEqualTo(Long value) {
            addCriterion("parent_pet_id =", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdNotEqualTo(Long value) {
            addCriterion("parent_pet_id <>", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdGreaterThan(Long value) {
            addCriterion("parent_pet_id >", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_pet_id >=", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdLessThan(Long value) {
            addCriterion("parent_pet_id <", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_pet_id <=", value, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdIn(List<Long> values) {
            addCriterion("parent_pet_id in", values, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdNotIn(List<Long> values) {
            addCriterion("parent_pet_id not in", values, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdBetween(Long value1, Long value2) {
            addCriterion("parent_pet_id between", value1, value2, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andParentPetIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_pet_id not between", value1, value2, "parentPetId");
            return (Criteria) this;
        }

        public Criteria andGenerationIsNull() {
            addCriterion("generation is null");
            return (Criteria) this;
        }

        public Criteria andGenerationIsNotNull() {
            addCriterion("generation is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationEqualTo(Integer value) {
            addCriterion("generation =", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotEqualTo(Integer value) {
            addCriterion("generation <>", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationGreaterThan(Integer value) {
            addCriterion("generation >", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationGreaterThanOrEqualTo(Integer value) {
            addCriterion("generation >=", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationLessThan(Integer value) {
            addCriterion("generation <", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationLessThanOrEqualTo(Integer value) {
            addCriterion("generation <=", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationIn(List<Integer> values) {
            addCriterion("generation in", values, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotIn(List<Integer> values) {
            addCriterion("generation not in", values, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationBetween(Integer value1, Integer value2) {
            addCriterion("generation between", value1, value2, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotBetween(Integer value1, Integer value2) {
            addCriterion("generation not between", value1, value2, "generation");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPetTypeIsNull() {
            addCriterion("pet_type is null");
            return (Criteria) this;
        }

        public Criteria andPetTypeIsNotNull() {
            addCriterion("pet_type is not null");
            return (Criteria) this;
        }

        public Criteria andPetTypeEqualTo(Byte value) {
            addCriterion("pet_type =", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotEqualTo(Byte value) {
            addCriterion("pet_type <>", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeGreaterThan(Byte value) {
            addCriterion("pet_type >", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pet_type >=", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeLessThan(Byte value) {
            addCriterion("pet_type <", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pet_type <=", value, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeIn(List<Byte> values) {
            addCriterion("pet_type in", values, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotIn(List<Byte> values) {
            addCriterion("pet_type not in", values, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeBetween(Byte value1, Byte value2) {
            addCriterion("pet_type between", value1, value2, "petType");
            return (Criteria) this;
        }

        public Criteria andPetTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pet_type not between", value1, value2, "petType");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumIsNull() {
            addCriterion("receive_rain_num is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumIsNotNull() {
            addCriterion("receive_rain_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumEqualTo(Integer value) {
            addCriterion("receive_rain_num =", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumNotEqualTo(Integer value) {
            addCriterion("receive_rain_num <>", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumGreaterThan(Integer value) {
            addCriterion("receive_rain_num >", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_rain_num >=", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumLessThan(Integer value) {
            addCriterion("receive_rain_num <", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumLessThanOrEqualTo(Integer value) {
            addCriterion("receive_rain_num <=", value, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumIn(List<Integer> values) {
            addCriterion("receive_rain_num in", values, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumNotIn(List<Integer> values) {
            addCriterion("receive_rain_num not in", values, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumBetween(Integer value1, Integer value2) {
            addCriterion("receive_rain_num between", value1, value2, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andReceiveRainNumNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_rain_num not between", value1, value2, "receiveRainNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalIsNull() {
            addCriterion("mousetrap_total is null");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalIsNotNull() {
            addCriterion("mousetrap_total is not null");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalEqualTo(Integer value) {
            addCriterion("mousetrap_total =", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalNotEqualTo(Integer value) {
            addCriterion("mousetrap_total <>", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalGreaterThan(Integer value) {
            addCriterion("mousetrap_total >", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("mousetrap_total >=", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalLessThan(Integer value) {
            addCriterion("mousetrap_total <", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalLessThanOrEqualTo(Integer value) {
            addCriterion("mousetrap_total <=", value, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalIn(List<Integer> values) {
            addCriterion("mousetrap_total in", values, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalNotIn(List<Integer> values) {
            addCriterion("mousetrap_total not in", values, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalBetween(Integer value1, Integer value2) {
            addCriterion("mousetrap_total between", value1, value2, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("mousetrap_total not between", value1, value2, "mousetrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalIsNull() {
            addCriterion("cattrap_total is null");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalIsNotNull() {
            addCriterion("cattrap_total is not null");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalEqualTo(Integer value) {
            addCriterion("cattrap_total =", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalNotEqualTo(Integer value) {
            addCriterion("cattrap_total <>", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalGreaterThan(Integer value) {
            addCriterion("cattrap_total >", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("cattrap_total >=", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalLessThan(Integer value) {
            addCriterion("cattrap_total <", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalLessThanOrEqualTo(Integer value) {
            addCriterion("cattrap_total <=", value, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalIn(List<Integer> values) {
            addCriterion("cattrap_total in", values, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalNotIn(List<Integer> values) {
            addCriterion("cattrap_total not in", values, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalBetween(Integer value1, Integer value2) {
            addCriterion("cattrap_total between", value1, value2, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andCattrapTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("cattrap_total not between", value1, value2, "cattrapTotal");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumIsNull() {
            addCriterion("mousetrap_num is null");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumIsNotNull() {
            addCriterion("mousetrap_num is not null");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumEqualTo(Integer value) {
            addCriterion("mousetrap_num =", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumNotEqualTo(Integer value) {
            addCriterion("mousetrap_num <>", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumGreaterThan(Integer value) {
            addCriterion("mousetrap_num >", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mousetrap_num >=", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumLessThan(Integer value) {
            addCriterion("mousetrap_num <", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumLessThanOrEqualTo(Integer value) {
            addCriterion("mousetrap_num <=", value, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumIn(List<Integer> values) {
            addCriterion("mousetrap_num in", values, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumNotIn(List<Integer> values) {
            addCriterion("mousetrap_num not in", values, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumBetween(Integer value1, Integer value2) {
            addCriterion("mousetrap_num between", value1, value2, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andMousetrapNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mousetrap_num not between", value1, value2, "mousetrapNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNull() {
            addCriterion("status_desc is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNotNull() {
            addCriterion("status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescEqualTo(String value) {
            addCriterion("status_desc =", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotEqualTo(String value) {
            addCriterion("status_desc <>", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThan(String value) {
            addCriterion("status_desc >", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("status_desc >=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThan(String value) {
            addCriterion("status_desc <", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThanOrEqualTo(String value) {
            addCriterion("status_desc <=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLike(String value) {
            addCriterion("status_desc like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotLike(String value) {
            addCriterion("status_desc not like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescIn(List<String> values) {
            addCriterion("status_desc in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotIn(List<String> values) {
            addCriterion("status_desc not in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescBetween(String value1, String value2) {
            addCriterion("status_desc between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotBetween(String value1, String value2) {
            addCriterion("status_desc not between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andIsArrestedIsNull() {
            addCriterion("is_arrested is null");
            return (Criteria) this;
        }

        public Criteria andIsArrestedIsNotNull() {
            addCriterion("is_arrested is not null");
            return (Criteria) this;
        }

        public Criteria andIsArrestedEqualTo(Boolean value) {
            addCriterion("is_arrested =", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedNotEqualTo(Boolean value) {
            addCriterion("is_arrested <>", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedGreaterThan(Boolean value) {
            addCriterion("is_arrested >", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_arrested >=", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedLessThan(Boolean value) {
            addCriterion("is_arrested <", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_arrested <=", value, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedIn(List<Boolean> values) {
            addCriterion("is_arrested in", values, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedNotIn(List<Boolean> values) {
            addCriterion("is_arrested not in", values, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arrested between", value1, value2, "isArrested");
            return (Criteria) this;
        }

        public Criteria andIsArrestedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arrested not between", value1, value2, "isArrested");
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
    }

    /**
     * travel_pet_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * travel_pet_info null
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