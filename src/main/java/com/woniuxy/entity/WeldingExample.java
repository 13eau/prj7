package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class WeldingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public WeldingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
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
     * This method corresponds to the database table welding
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
     * This method corresponds to the database table welding
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table welding
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
     * This class corresponds to the database table welding
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

        public Criteria andP5WidIsNull() {
            addCriterion("p5_wid is null");
            return (Criteria) this;
        }

        public Criteria andP5WidIsNotNull() {
            addCriterion("p5_wid is not null");
            return (Criteria) this;
        }

        public Criteria andP5WidEqualTo(Integer value) {
            addCriterion("p5_wid =", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidNotEqualTo(Integer value) {
            addCriterion("p5_wid <>", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidGreaterThan(Integer value) {
            addCriterion("p5_wid >", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p5_wid >=", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidLessThan(Integer value) {
            addCriterion("p5_wid <", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidLessThanOrEqualTo(Integer value) {
            addCriterion("p5_wid <=", value, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidIn(List<Integer> values) {
            addCriterion("p5_wid in", values, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidNotIn(List<Integer> values) {
            addCriterion("p5_wid not in", values, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidBetween(Integer value1, Integer value2) {
            addCriterion("p5_wid between", value1, value2, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andP5WidNotBetween(Integer value1, Integer value2) {
            addCriterion("p5_wid not between", value1, value2, "p5Wid");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andP5WnameIsNull() {
            addCriterion("p5_wname is null");
            return (Criteria) this;
        }

        public Criteria andP5WnameIsNotNull() {
            addCriterion("p5_wname is not null");
            return (Criteria) this;
        }

        public Criteria andP5WnameEqualTo(String value) {
            addCriterion("p5_wname =", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameNotEqualTo(String value) {
            addCriterion("p5_wname <>", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameGreaterThan(String value) {
            addCriterion("p5_wname >", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameGreaterThanOrEqualTo(String value) {
            addCriterion("p5_wname >=", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameLessThan(String value) {
            addCriterion("p5_wname <", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameLessThanOrEqualTo(String value) {
            addCriterion("p5_wname <=", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameLike(String value) {
            addCriterion("p5_wname like", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameNotLike(String value) {
            addCriterion("p5_wname not like", value, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameIn(List<String> values) {
            addCriterion("p5_wname in", values, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameNotIn(List<String> values) {
            addCriterion("p5_wname not in", values, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameBetween(String value1, String value2) {
            addCriterion("p5_wname between", value1, value2, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5WnameNotBetween(String value1, String value2) {
            addCriterion("p5_wname not between", value1, value2, "p5Wname");
            return (Criteria) this;
        }

        public Criteria andP5StatusIsNull() {
            addCriterion("p5_status is null");
            return (Criteria) this;
        }

        public Criteria andP5StatusIsNotNull() {
            addCriterion("p5_status is not null");
            return (Criteria) this;
        }

        public Criteria andP5StatusEqualTo(String value) {
            addCriterion("p5_status =", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusNotEqualTo(String value) {
            addCriterion("p5_status <>", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusGreaterThan(String value) {
            addCriterion("p5_status >", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusGreaterThanOrEqualTo(String value) {
            addCriterion("p5_status >=", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusLessThan(String value) {
            addCriterion("p5_status <", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusLessThanOrEqualTo(String value) {
            addCriterion("p5_status <=", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusLike(String value) {
            addCriterion("p5_status like", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusNotLike(String value) {
            addCriterion("p5_status not like", value, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusIn(List<String> values) {
            addCriterion("p5_status in", values, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusNotIn(List<String> values) {
            addCriterion("p5_status not in", values, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusBetween(String value1, String value2) {
            addCriterion("p5_status between", value1, value2, "p5Status");
            return (Criteria) this;
        }

        public Criteria andP5StatusNotBetween(String value1, String value2) {
            addCriterion("p5_status not between", value1, value2, "p5Status");
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
     * This class corresponds to the database table welding
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
     * This class corresponds to the database table welding
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