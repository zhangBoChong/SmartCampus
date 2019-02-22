package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExchangeidIsNull() {
            addCriterion("exchangeId is null");
            return (Criteria) this;
        }

        public Criteria andExchangeidIsNotNull() {
            addCriterion("exchangeId is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeidEqualTo(Integer value) {
            addCriterion("exchangeId =", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotEqualTo(Integer value) {
            addCriterion("exchangeId <>", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThan(Integer value) {
            addCriterion("exchangeId >", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeId >=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThan(Integer value) {
            addCriterion("exchangeId <", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeId <=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidIn(List<Integer> values) {
            addCriterion("exchangeId in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotIn(List<Integer> values) {
            addCriterion("exchangeId not in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidBetween(Integer value1, Integer value2) {
            addCriterion("exchangeId between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeId not between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andClazz1IsNull() {
            addCriterion("clazz1 is null");
            return (Criteria) this;
        }

        public Criteria andClazz1IsNotNull() {
            addCriterion("clazz1 is not null");
            return (Criteria) this;
        }

        public Criteria andClazz1EqualTo(Integer value) {
            addCriterion("clazz1 =", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1NotEqualTo(Integer value) {
            addCriterion("clazz1 <>", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1GreaterThan(Integer value) {
            addCriterion("clazz1 >", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1GreaterThanOrEqualTo(Integer value) {
            addCriterion("clazz1 >=", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1LessThan(Integer value) {
            addCriterion("clazz1 <", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1LessThanOrEqualTo(Integer value) {
            addCriterion("clazz1 <=", value, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1In(List<Integer> values) {
            addCriterion("clazz1 in", values, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1NotIn(List<Integer> values) {
            addCriterion("clazz1 not in", values, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1Between(Integer value1, Integer value2) {
            addCriterion("clazz1 between", value1, value2, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz1NotBetween(Integer value1, Integer value2) {
            addCriterion("clazz1 not between", value1, value2, "clazz1");
            return (Criteria) this;
        }

        public Criteria andClazz2IsNull() {
            addCriterion("clazz2 is null");
            return (Criteria) this;
        }

        public Criteria andClazz2IsNotNull() {
            addCriterion("clazz2 is not null");
            return (Criteria) this;
        }

        public Criteria andClazz2EqualTo(Integer value) {
            addCriterion("clazz2 =", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2NotEqualTo(Integer value) {
            addCriterion("clazz2 <>", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2GreaterThan(Integer value) {
            addCriterion("clazz2 >", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2GreaterThanOrEqualTo(Integer value) {
            addCriterion("clazz2 >=", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2LessThan(Integer value) {
            addCriterion("clazz2 <", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2LessThanOrEqualTo(Integer value) {
            addCriterion("clazz2 <=", value, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2In(List<Integer> values) {
            addCriterion("clazz2 in", values, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2NotIn(List<Integer> values) {
            addCriterion("clazz2 not in", values, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2Between(Integer value1, Integer value2) {
            addCriterion("clazz2 between", value1, value2, "clazz2");
            return (Criteria) this;
        }

        public Criteria andClazz2NotBetween(Integer value1, Integer value2) {
            addCriterion("clazz2 not between", value1, value2, "clazz2");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
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