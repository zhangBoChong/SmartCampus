package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ClazzpositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClazzpositionExample() {
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

        public Criteria andClazzpositionidIsNull() {
            addCriterion("clazzPositionId is null");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidIsNotNull() {
            addCriterion("clazzPositionId is not null");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidEqualTo(Integer value) {
            addCriterion("clazzPositionId =", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidNotEqualTo(Integer value) {
            addCriterion("clazzPositionId <>", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidGreaterThan(Integer value) {
            addCriterion("clazzPositionId >", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clazzPositionId >=", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidLessThan(Integer value) {
            addCriterion("clazzPositionId <", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidLessThanOrEqualTo(Integer value) {
            addCriterion("clazzPositionId <=", value, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidIn(List<Integer> values) {
            addCriterion("clazzPositionId in", values, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidNotIn(List<Integer> values) {
            addCriterion("clazzPositionId not in", values, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidBetween(Integer value1, Integer value2) {
            addCriterion("clazzPositionId between", value1, value2, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("clazzPositionId not between", value1, value2, "clazzpositionid");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameIsNull() {
            addCriterion("clazzPositionName is null");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameIsNotNull() {
            addCriterion("clazzPositionName is not null");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameEqualTo(String value) {
            addCriterion("clazzPositionName =", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameNotEqualTo(String value) {
            addCriterion("clazzPositionName <>", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameGreaterThan(String value) {
            addCriterion("clazzPositionName >", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("clazzPositionName >=", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameLessThan(String value) {
            addCriterion("clazzPositionName <", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameLessThanOrEqualTo(String value) {
            addCriterion("clazzPositionName <=", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameLike(String value) {
            addCriterion("clazzPositionName like", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameNotLike(String value) {
            addCriterion("clazzPositionName not like", value, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameIn(List<String> values) {
            addCriterion("clazzPositionName in", values, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameNotIn(List<String> values) {
            addCriterion("clazzPositionName not in", values, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameBetween(String value1, String value2) {
            addCriterion("clazzPositionName between", value1, value2, "clazzpositionname");
            return (Criteria) this;
        }

        public Criteria andClazzpositionnameNotBetween(String value1, String value2) {
            addCriterion("clazzPositionName not between", value1, value2, "clazzpositionname");
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