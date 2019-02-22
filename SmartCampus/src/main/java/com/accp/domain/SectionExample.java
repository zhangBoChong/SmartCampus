package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
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

        public Criteria andSectionidIsNull() {
            addCriterion("sectionId is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionId is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Integer value) {
            addCriterion("sectionId =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Integer value) {
            addCriterion("sectionId <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Integer value) {
            addCriterion("sectionId >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionId >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Integer value) {
            addCriterion("sectionId <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("sectionId <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Integer> values) {
            addCriterion("sectionId in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Integer> values) {
            addCriterion("sectionId not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Integer value1, Integer value2) {
            addCriterion("sectionId between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionId not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionnameIsNull() {
            addCriterion("sectionName is null");
            return (Criteria) this;
        }

        public Criteria andSectionnameIsNotNull() {
            addCriterion("sectionName is not null");
            return (Criteria) this;
        }

        public Criteria andSectionnameEqualTo(String value) {
            addCriterion("sectionName =", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotEqualTo(String value) {
            addCriterion("sectionName <>", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThan(String value) {
            addCriterion("sectionName >", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThanOrEqualTo(String value) {
            addCriterion("sectionName >=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThan(String value) {
            addCriterion("sectionName <", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThanOrEqualTo(String value) {
            addCriterion("sectionName <=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLike(String value) {
            addCriterion("sectionName like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotLike(String value) {
            addCriterion("sectionName not like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameIn(List<String> values) {
            addCriterion("sectionName in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotIn(List<String> values) {
            addCriterion("sectionName not in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameBetween(String value1, String value2) {
            addCriterion("sectionName between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotBetween(String value1, String value2) {
            addCriterion("sectionName not between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(Integer value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(Integer value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(Integer value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(Integer value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(Integer value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<Integer> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<Integer> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(Integer value1, Integer value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
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

        public Criteria andCoursetimeIsNull() {
            addCriterion("courseTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNotNull() {
            addCriterion("courseTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeEqualTo(Integer value) {
            addCriterion("courseTime =", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotEqualTo(Integer value) {
            addCriterion("courseTime <>", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThan(Integer value) {
            addCriterion("courseTime >", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseTime >=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThan(Integer value) {
            addCriterion("courseTime <", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThanOrEqualTo(Integer value) {
            addCriterion("courseTime <=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIn(List<Integer> values) {
            addCriterion("courseTime in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotIn(List<Integer> values) {
            addCriterion("courseTime not in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeBetween(Integer value1, Integer value2) {
            addCriterion("courseTime between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("courseTime not between", value1, value2, "coursetime");
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