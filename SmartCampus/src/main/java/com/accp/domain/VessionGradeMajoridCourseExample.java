package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VessionGradeMajoridCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VessionGradeMajoridCourseExample() {
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

        public Criteria andVgmidIsNull() {
            addCriterion("vgmId is null");
            return (Criteria) this;
        }

        public Criteria andVgmidIsNotNull() {
            addCriterion("vgmId is not null");
            return (Criteria) this;
        }

        public Criteria andVgmidEqualTo(Integer value) {
            addCriterion("vgmId =", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidNotEqualTo(Integer value) {
            addCriterion("vgmId <>", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidGreaterThan(Integer value) {
            addCriterion("vgmId >", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vgmId >=", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidLessThan(Integer value) {
            addCriterion("vgmId <", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidLessThanOrEqualTo(Integer value) {
            addCriterion("vgmId <=", value, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidIn(List<Integer> values) {
            addCriterion("vgmId in", values, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidNotIn(List<Integer> values) {
            addCriterion("vgmId not in", values, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidBetween(Integer value1, Integer value2) {
            addCriterion("vgmId between", value1, value2, "vgmid");
            return (Criteria) this;
        }

        public Criteria andVgmidNotBetween(Integer value1, Integer value2) {
            addCriterion("vgmId not between", value1, value2, "vgmid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
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