package com.woniuxy.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForemanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public ForemanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
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

        public Criteria andFmIdIsNull() {
            addCriterion("fm_id is null");
            return (Criteria) this;
        }

        public Criteria andFmIdIsNotNull() {
            addCriterion("fm_id is not null");
            return (Criteria) this;
        }

        public Criteria andFmIdEqualTo(Integer value) {
            addCriterion("fm_id =", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdNotEqualTo(Integer value) {
            addCriterion("fm_id <>", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdGreaterThan(Integer value) {
            addCriterion("fm_id >", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fm_id >=", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdLessThan(Integer value) {
            addCriterion("fm_id <", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdLessThanOrEqualTo(Integer value) {
            addCriterion("fm_id <=", value, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdIn(List<Integer> values) {
            addCriterion("fm_id in", values, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdNotIn(List<Integer> values) {
            addCriterion("fm_id not in", values, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdBetween(Integer value1, Integer value2) {
            addCriterion("fm_id between", value1, value2, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fm_id not between", value1, value2, "fmId");
            return (Criteria) this;
        }

        public Criteria andFmNameIsNull() {
            addCriterion("fm_name is null");
            return (Criteria) this;
        }

        public Criteria andFmNameIsNotNull() {
            addCriterion("fm_name is not null");
            return (Criteria) this;
        }

        public Criteria andFmNameEqualTo(String value) {
            addCriterion("fm_name =", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameNotEqualTo(String value) {
            addCriterion("fm_name <>", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameGreaterThan(String value) {
            addCriterion("fm_name >", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameGreaterThanOrEqualTo(String value) {
            addCriterion("fm_name >=", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameLessThan(String value) {
            addCriterion("fm_name <", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameLessThanOrEqualTo(String value) {
            addCriterion("fm_name <=", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameLike(String value) {
            addCriterion("fm_name like", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameNotLike(String value) {
            addCriterion("fm_name not like", value, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameIn(List<String> values) {
            addCriterion("fm_name in", values, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameNotIn(List<String> values) {
            addCriterion("fm_name not in", values, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameBetween(String value1, String value2) {
            addCriterion("fm_name between", value1, value2, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmNameNotBetween(String value1, String value2) {
            addCriterion("fm_name not between", value1, value2, "fmName");
            return (Criteria) this;
        }

        public Criteria andFmSexIsNull() {
            addCriterion("fm_sex is null");
            return (Criteria) this;
        }

        public Criteria andFmSexIsNotNull() {
            addCriterion("fm_sex is not null");
            return (Criteria) this;
        }

        public Criteria andFmSexEqualTo(String value) {
            addCriterion("fm_sex =", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexNotEqualTo(String value) {
            addCriterion("fm_sex <>", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexGreaterThan(String value) {
            addCriterion("fm_sex >", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexGreaterThanOrEqualTo(String value) {
            addCriterion("fm_sex >=", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexLessThan(String value) {
            addCriterion("fm_sex <", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexLessThanOrEqualTo(String value) {
            addCriterion("fm_sex <=", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexLike(String value) {
            addCriterion("fm_sex like", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexNotLike(String value) {
            addCriterion("fm_sex not like", value, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexIn(List<String> values) {
            addCriterion("fm_sex in", values, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexNotIn(List<String> values) {
            addCriterion("fm_sex not in", values, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexBetween(String value1, String value2) {
            addCriterion("fm_sex between", value1, value2, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmSexNotBetween(String value1, String value2) {
            addCriterion("fm_sex not between", value1, value2, "fmSex");
            return (Criteria) this;
        }

        public Criteria andFmAgeIsNull() {
            addCriterion("fm_age is null");
            return (Criteria) this;
        }

        public Criteria andFmAgeIsNotNull() {
            addCriterion("fm_age is not null");
            return (Criteria) this;
        }

        public Criteria andFmAgeEqualTo(Integer value) {
            addCriterion("fm_age =", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeNotEqualTo(Integer value) {
            addCriterion("fm_age <>", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeGreaterThan(Integer value) {
            addCriterion("fm_age >", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fm_age >=", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeLessThan(Integer value) {
            addCriterion("fm_age <", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeLessThanOrEqualTo(Integer value) {
            addCriterion("fm_age <=", value, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeIn(List<Integer> values) {
            addCriterion("fm_age in", values, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeNotIn(List<Integer> values) {
            addCriterion("fm_age not in", values, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeBetween(Integer value1, Integer value2) {
            addCriterion("fm_age between", value1, value2, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("fm_age not between", value1, value2, "fmAge");
            return (Criteria) this;
        }

        public Criteria andFmPhoneIsNull() {
            addCriterion("fm_phone is null");
            return (Criteria) this;
        }

        public Criteria andFmPhoneIsNotNull() {
            addCriterion("fm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFmPhoneEqualTo(Integer value) {
            addCriterion("fm_phone =", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneNotEqualTo(Integer value) {
            addCriterion("fm_phone <>", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneGreaterThan(Integer value) {
            addCriterion("fm_phone >", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("fm_phone >=", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneLessThan(Integer value) {
            addCriterion("fm_phone <", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("fm_phone <=", value, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneIn(List<Integer> values) {
            addCriterion("fm_phone in", values, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneNotIn(List<Integer> values) {
            addCriterion("fm_phone not in", values, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneBetween(Integer value1, Integer value2) {
            addCriterion("fm_phone between", value1, value2, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("fm_phone not between", value1, value2, "fmPhone");
            return (Criteria) this;
        }

        public Criteria andFmSalIsNull() {
            addCriterion("fm_sal is null");
            return (Criteria) this;
        }

        public Criteria andFmSalIsNotNull() {
            addCriterion("fm_sal is not null");
            return (Criteria) this;
        }

        public Criteria andFmSalEqualTo(BigDecimal value) {
            addCriterion("fm_sal =", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalNotEqualTo(BigDecimal value) {
            addCriterion("fm_sal <>", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalGreaterThan(BigDecimal value) {
            addCriterion("fm_sal >", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fm_sal >=", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalLessThan(BigDecimal value) {
            addCriterion("fm_sal <", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fm_sal <=", value, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalIn(List<BigDecimal> values) {
            addCriterion("fm_sal in", values, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalNotIn(List<BigDecimal> values) {
            addCriterion("fm_sal not in", values, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fm_sal between", value1, value2, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fm_sal not between", value1, value2, "fmSal");
            return (Criteria) this;
        }

        public Criteria andFmAddressIsNull() {
            addCriterion("fm_address is null");
            return (Criteria) this;
        }

        public Criteria andFmAddressIsNotNull() {
            addCriterion("fm_address is not null");
            return (Criteria) this;
        }

        public Criteria andFmAddressEqualTo(String value) {
            addCriterion("fm_address =", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressNotEqualTo(String value) {
            addCriterion("fm_address <>", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressGreaterThan(String value) {
            addCriterion("fm_address >", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("fm_address >=", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressLessThan(String value) {
            addCriterion("fm_address <", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressLessThanOrEqualTo(String value) {
            addCriterion("fm_address <=", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressLike(String value) {
            addCriterion("fm_address like", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressNotLike(String value) {
            addCriterion("fm_address not like", value, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressIn(List<String> values) {
            addCriterion("fm_address in", values, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressNotIn(List<String> values) {
            addCriterion("fm_address not in", values, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressBetween(String value1, String value2) {
            addCriterion("fm_address between", value1, value2, "fmAddress");
            return (Criteria) this;
        }

        public Criteria andFmAddressNotBetween(String value1, String value2) {
            addCriterion("fm_address not between", value1, value2, "fmAddress");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(Integer value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(Integer value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(Integer value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(Integer value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<Integer> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<Integer> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(Integer value1, Integer value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foreman
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 19 19:23:43 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
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