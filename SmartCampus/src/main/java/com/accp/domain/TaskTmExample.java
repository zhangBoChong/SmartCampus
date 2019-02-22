package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskTmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskTmExample() {
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

        public Criteria andTaskTmIdIsNull() {
            addCriterion("task_tm_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdIsNotNull() {
            addCriterion("task_tm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdEqualTo(Integer value) {
            addCriterion("task_tm_id =", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdNotEqualTo(Integer value) {
            addCriterion("task_tm_id <>", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdGreaterThan(Integer value) {
            addCriterion("task_tm_id >", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_tm_id >=", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdLessThan(Integer value) {
            addCriterion("task_tm_id <", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_tm_id <=", value, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdIn(List<Integer> values) {
            addCriterion("task_tm_id in", values, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdNotIn(List<Integer> values) {
            addCriterion("task_tm_id not in", values, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_id between", value1, value2, "taskTmId");
            return (Criteria) this;
        }

        public Criteria andTaskTmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_id not between", value1, value2, "taskTmId");
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztIsNull() {
            addCriterion("task_tm_xzt is null");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztIsNotNull() {
            addCriterion("task_tm_xzt is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztEqualTo(Integer value) {
            addCriterion("task_tm_xzt =", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztNotEqualTo(Integer value) {
            addCriterion("task_tm_xzt <>", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztGreaterThan(Integer value) {
            addCriterion("task_tm_xzt >", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_tm_xzt >=", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztLessThan(Integer value) {
            addCriterion("task_tm_xzt <", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztLessThanOrEqualTo(Integer value) {
            addCriterion("task_tm_xzt <=", value, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztIn(List<Integer> values) {
            addCriterion("task_tm_xzt in", values, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztNotIn(List<Integer> values) {
            addCriterion("task_tm_xzt not in", values, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_xzt between", value1, value2, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmXztNotBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_xzt not between", value1, value2, "taskTmXzt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtIsNull() {
            addCriterion("task_tm_wdt is null");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtIsNotNull() {
            addCriterion("task_tm_wdt is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtEqualTo(Integer value) {
            addCriterion("task_tm_wdt =", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtNotEqualTo(Integer value) {
            addCriterion("task_tm_wdt <>", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtGreaterThan(Integer value) {
            addCriterion("task_tm_wdt >", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_tm_wdt >=", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtLessThan(Integer value) {
            addCriterion("task_tm_wdt <", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtLessThanOrEqualTo(Integer value) {
            addCriterion("task_tm_wdt <=", value, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtIn(List<Integer> values) {
            addCriterion("task_tm_wdt in", values, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtNotIn(List<Integer> values) {
            addCriterion("task_tm_wdt not in", values, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_wdt between", value1, value2, "taskTmWdt");
            return (Criteria) this;
        }

        public Criteria andTaskTmWdtNotBetween(Integer value1, Integer value2) {
            addCriterion("task_tm_wdt not between", value1, value2, "taskTmWdt");
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