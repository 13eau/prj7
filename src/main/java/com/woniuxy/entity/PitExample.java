package com.woniuxy.entity;

import java.util.ArrayList;
import java.util.List;

public class PitExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public PitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
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
     * This method corresponds to the database table pit
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
     * This method corresponds to the database table pit
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pit
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
     * This class corresponds to the database table pit
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

        public Criteria andP2PidIsNull() {
            addCriterion("p2_pid is null");
            return (Criteria) this;
        }

        public Criteria andP2PidIsNotNull() {
            addCriterion("p2_pid is not null");
            return (Criteria) this;
        }

        public Criteria andP2PidEqualTo(Integer value) {
            addCriterion("p2_pid =", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidNotEqualTo(Integer value) {
            addCriterion("p2_pid <>", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidGreaterThan(Integer value) {
            addCriterion("p2_pid >", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2_pid >=", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidLessThan(Integer value) {
            addCriterion("p2_pid <", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidLessThanOrEqualTo(Integer value) {
            addCriterion("p2_pid <=", value, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidIn(List<Integer> values) {
            addCriterion("p2_pid in", values, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidNotIn(List<Integer> values) {
            addCriterion("p2_pid not in", values, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidBetween(Integer value1, Integer value2) {
            addCriterion("p2_pid between", value1, value2, "p2Pid");
            return (Criteria) this;
        }

        public Criteria andP2PidNotBetween(Integer value1, Integer value2) {
            addCriterion("p2_pid not between", value1, value2, "p2Pid");
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

        public Criteria andP2PnameIsNull() {
            addCriterion("p2_pname is null");
            return (Criteria) this;
        }

        public Criteria andP2PnameIsNotNull() {
            addCriterion("p2_pname is not null");
            return (Criteria) this;
        }

        public Criteria andP2PnameEqualTo(String value) {
            addCriterion("p2_pname =", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameNotEqualTo(String value) {
            addCriterion("p2_pname <>", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameGreaterThan(String value) {
            addCriterion("p2_pname >", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameGreaterThanOrEqualTo(String value) {
            addCriterion("p2_pname >=", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameLessThan(String value) {
            addCriterion("p2_pname <", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameLessThanOrEqualTo(String value) {
            addCriterion("p2_pname <=", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameLike(String value) {
            addCriterion("p2_pname like", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameNotLike(String value) {
            addCriterion("p2_pname not like", value, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameIn(List<String> values) {
            addCriterion("p2_pname in", values, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameNotIn(List<String> values) {
            addCriterion("p2_pname not in", values, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameBetween(String value1, String value2) {
            addCriterion("p2_pname between", value1, value2, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2PnameNotBetween(String value1, String value2) {
            addCriterion("p2_pname not between", value1, value2, "p2Pname");
            return (Criteria) this;
        }

        public Criteria andP2StatusIsNull() {
            addCriterion("p2_status is null");
            return (Criteria) this;
        }

        public Criteria andP2StatusIsNotNull() {
            addCriterion("p2_status is not null");
            return (Criteria) this;
        }

        public Criteria andP2StatusEqualTo(String value) {
            addCriterion("p2_status =", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusNotEqualTo(String value) {
            addCriterion("p2_status <>", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusGreaterThan(String value) {
            addCriterion("p2_status >", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusGreaterThanOrEqualTo(String value) {
            addCriterion("p2_status >=", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusLessThan(String value) {
            addCriterion("p2_status <", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusLessThanOrEqualTo(String value) {
            addCriterion("p2_status <=", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusLike(String value) {
            addCriterion("p2_status like", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusNotLike(String value) {
            addCriterion("p2_status not like", value, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusIn(List<String> values) {
            addCriterion("p2_status in", values, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusNotIn(List<String> values) {
            addCriterion("p2_status not in", values, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusBetween(String value1, String value2) {
            addCriterion("p2_status between", value1, value2, "p2Status");
            return (Criteria) this;
        }

        public Criteria andP2StatusNotBetween(String value1, String value2) {
            addCriterion("p2_status not between", value1, value2, "p2Status");
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
     * This class corresponds to the database table pit
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
     * This class corresponds to the database table pit
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