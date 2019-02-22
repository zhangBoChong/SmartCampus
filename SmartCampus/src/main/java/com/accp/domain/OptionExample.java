package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptionExample() {
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

        public Criteria andOptionIdIsNull() {
            addCriterion("option_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNotNull() {
            addCriterion("option_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdEqualTo(Integer value) {
            addCriterion("option_id =", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotEqualTo(Integer value) {
            addCriterion("option_id <>", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThan(Integer value) {
            addCriterion("option_id >", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_id >=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThan(Integer value) {
            addCriterion("option_id <", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("option_id <=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIn(List<Integer> values) {
            addCriterion("option_id in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotIn(List<Integer> values) {
            addCriterion("option_id not in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("option_id between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("option_id not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionXxIsNull() {
            addCriterion("option_xx is null");
            return (Criteria) this;
        }

        public Criteria andOptionXxIsNotNull() {
            addCriterion("option_xx is not null");
            return (Criteria) this;
        }

        public Criteria andOptionXxEqualTo(String value) {
            addCriterion("option_xx =", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxNotEqualTo(String value) {
            addCriterion("option_xx <>", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxGreaterThan(String value) {
            addCriterion("option_xx >", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxGreaterThanOrEqualTo(String value) {
            addCriterion("option_xx >=", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxLessThan(String value) {
            addCriterion("option_xx <", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxLessThanOrEqualTo(String value) {
            addCriterion("option_xx <=", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxLike(String value) {
            addCriterion("option_xx like", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxNotLike(String value) {
            addCriterion("option_xx not like", value, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxIn(List<String> values) {
            addCriterion("option_xx in", values, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxNotIn(List<String> values) {
            addCriterion("option_xx not in", values, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxBetween(String value1, String value2) {
            addCriterion("option_xx between", value1, value2, "optionXx");
            return (Criteria) this;
        }

        public Criteria andOptionXxNotBetween(String value1, String value2) {
            addCriterion("option_xx not between", value1, value2, "optionXx");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andOptionPdIsNull() {
            addCriterion("option_pd is null");
            return (Criteria) this;
        }

        public Criteria andOptionPdIsNotNull() {
            addCriterion("option_pd is not null");
            return (Criteria) this;
        }

        public Criteria andOptionPdEqualTo(Integer value) {
            addCriterion("option_pd =", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdNotEqualTo(Integer value) {
            addCriterion("option_pd <>", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdGreaterThan(Integer value) {
            addCriterion("option_pd >", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_pd >=", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdLessThan(Integer value) {
            addCriterion("option_pd <", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdLessThanOrEqualTo(Integer value) {
            addCriterion("option_pd <=", value, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdIn(List<Integer> values) {
            addCriterion("option_pd in", values, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdNotIn(List<Integer> values) {
            addCriterion("option_pd not in", values, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdBetween(Integer value1, Integer value2) {
            addCriterion("option_pd between", value1, value2, "optionPd");
            return (Criteria) this;
        }

        public Criteria andOptionPdNotBetween(Integer value1, Integer value2) {
            addCriterion("option_pd not between", value1, value2, "optionPd");
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