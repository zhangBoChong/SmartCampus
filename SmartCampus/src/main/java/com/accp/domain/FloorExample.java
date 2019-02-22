package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class FloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloorExample() {
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

        public Criteria andFlooridIsNull() {
            addCriterion("floorId is null");
            return (Criteria) this;
        }

        public Criteria andFlooridIsNotNull() {
            addCriterion("floorId is not null");
            return (Criteria) this;
        }

        public Criteria andFlooridEqualTo(Integer value) {
            addCriterion("floorId =", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotEqualTo(Integer value) {
            addCriterion("floorId <>", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridGreaterThan(Integer value) {
            addCriterion("floorId >", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridGreaterThanOrEqualTo(Integer value) {
            addCriterion("floorId >=", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridLessThan(Integer value) {
            addCriterion("floorId <", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridLessThanOrEqualTo(Integer value) {
            addCriterion("floorId <=", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridIn(List<Integer> values) {
            addCriterion("floorId in", values, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotIn(List<Integer> values) {
            addCriterion("floorId not in", values, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridBetween(Integer value1, Integer value2) {
            addCriterion("floorId between", value1, value2, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotBetween(Integer value1, Integer value2) {
            addCriterion("floorId not between", value1, value2, "floorid");
            return (Criteria) this;
        }

        public Criteria andFloornumberIsNull() {
            addCriterion("floorNumber is null");
            return (Criteria) this;
        }

        public Criteria andFloornumberIsNotNull() {
            addCriterion("floorNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFloornumberEqualTo(Integer value) {
            addCriterion("floorNumber =", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotEqualTo(Integer value) {
            addCriterion("floorNumber <>", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberGreaterThan(Integer value) {
            addCriterion("floorNumber >", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("floorNumber >=", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberLessThan(Integer value) {
            addCriterion("floorNumber <", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberLessThanOrEqualTo(Integer value) {
            addCriterion("floorNumber <=", value, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberIn(List<Integer> values) {
            addCriterion("floorNumber in", values, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotIn(List<Integer> values) {
            addCriterion("floorNumber not in", values, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberBetween(Integer value1, Integer value2) {
            addCriterion("floorNumber between", value1, value2, "floornumber");
            return (Criteria) this;
        }

        public Criteria andFloornumberNotBetween(Integer value1, Integer value2) {
            addCriterion("floorNumber not between", value1, value2, "floornumber");
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