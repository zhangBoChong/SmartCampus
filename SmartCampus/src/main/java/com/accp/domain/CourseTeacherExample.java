package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseTeacherExample() {
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

        public Criteria andCtidIsNull() {
            addCriterion("ctId is null");
            return (Criteria) this;
        }

        public Criteria andCtidIsNotNull() {
            addCriterion("ctId is not null");
            return (Criteria) this;
        }

        public Criteria andCtidEqualTo(Integer value) {
            addCriterion("ctId =", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotEqualTo(Integer value) {
            addCriterion("ctId <>", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThan(Integer value) {
            addCriterion("ctId >", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctId >=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThan(Integer value) {
            addCriterion("ctId <", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThanOrEqualTo(Integer value) {
            addCriterion("ctId <=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidIn(List<Integer> values) {
            addCriterion("ctId in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotIn(List<Integer> values) {
            addCriterion("ctId not in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidBetween(Integer value1, Integer value2) {
            addCriterion("ctId between", value1, value2, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ctId not between", value1, value2, "ctid");
            return (Criteria) this;
        }

        public Criteria andCvgmidIsNull() {
            addCriterion("cvgmId is null");
            return (Criteria) this;
        }

        public Criteria andCvgmidIsNotNull() {
            addCriterion("cvgmId is not null");
            return (Criteria) this;
        }

        public Criteria andCvgmidEqualTo(Integer value) {
            addCriterion("cvgmId =", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidNotEqualTo(Integer value) {
            addCriterion("cvgmId <>", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidGreaterThan(Integer value) {
            addCriterion("cvgmId >", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cvgmId >=", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidLessThan(Integer value) {
            addCriterion("cvgmId <", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidLessThanOrEqualTo(Integer value) {
            addCriterion("cvgmId <=", value, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidIn(List<Integer> values) {
            addCriterion("cvgmId in", values, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidNotIn(List<Integer> values) {
            addCriterion("cvgmId not in", values, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidBetween(Integer value1, Integer value2) {
            addCriterion("cvgmId between", value1, value2, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andCvgmidNotBetween(Integer value1, Integer value2) {
            addCriterion("cvgmId not between", value1, value2, "cvgmid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
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