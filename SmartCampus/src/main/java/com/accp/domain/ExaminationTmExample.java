package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ExaminationTmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationTmExample() {
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

        public Criteria andExaminationTmIdIsNull() {
            addCriterion("examination_tm_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdIsNotNull() {
            addCriterion("examination_tm_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdEqualTo(Integer value) {
            addCriterion("examination_tm_id =", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdNotEqualTo(Integer value) {
            addCriterion("examination_tm_id <>", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdGreaterThan(Integer value) {
            addCriterion("examination_tm_id >", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_tm_id >=", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdLessThan(Integer value) {
            addCriterion("examination_tm_id <", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_tm_id <=", value, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdIn(List<Integer> values) {
            addCriterion("examination_tm_id in", values, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdNotIn(List<Integer> values) {
            addCriterion("examination_tm_id not in", values, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_tm_id between", value1, value2, "examinationTmId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_tm_id not between", value1, value2, "examinationTmId");
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

        public Criteria andExaminationIdIsNull() {
            addCriterion("examination_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIsNotNull() {
            addCriterion("examination_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdEqualTo(Integer value) {
            addCriterion("examination_id =", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotEqualTo(Integer value) {
            addCriterion("examination_id <>", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThan(Integer value) {
            addCriterion("examination_id >", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_id >=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThan(Integer value) {
            addCriterion("examination_id <", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_id <=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIn(List<Integer> values) {
            addCriterion("examination_id in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotIn(List<Integer> values) {
            addCriterion("examination_id not in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_id between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_id not between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztIsNull() {
            addCriterion("examination_tm_xzt is null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztIsNotNull() {
            addCriterion("examination_tm_xzt is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztEqualTo(Double value) {
            addCriterion("examination_tm_xzt =", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztNotEqualTo(Double value) {
            addCriterion("examination_tm_xzt <>", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztGreaterThan(Double value) {
            addCriterion("examination_tm_xzt >", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztGreaterThanOrEqualTo(Double value) {
            addCriterion("examination_tm_xzt >=", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztLessThan(Double value) {
            addCriterion("examination_tm_xzt <", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztLessThanOrEqualTo(Double value) {
            addCriterion("examination_tm_xzt <=", value, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztIn(List<Double> values) {
            addCriterion("examination_tm_xzt in", values, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztNotIn(List<Double> values) {
            addCriterion("examination_tm_xzt not in", values, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztBetween(Double value1, Double value2) {
            addCriterion("examination_tm_xzt between", value1, value2, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmXztNotBetween(Double value1, Double value2) {
            addCriterion("examination_tm_xzt not between", value1, value2, "examinationTmXzt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtIsNull() {
            addCriterion("examination_tm_wdt is null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtIsNotNull() {
            addCriterion("examination_tm_wdt is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtEqualTo(Double value) {
            addCriterion("examination_tm_wdt =", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtNotEqualTo(Double value) {
            addCriterion("examination_tm_wdt <>", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtGreaterThan(Double value) {
            addCriterion("examination_tm_wdt >", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtGreaterThanOrEqualTo(Double value) {
            addCriterion("examination_tm_wdt >=", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtLessThan(Double value) {
            addCriterion("examination_tm_wdt <", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtLessThanOrEqualTo(Double value) {
            addCriterion("examination_tm_wdt <=", value, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtIn(List<Double> values) {
            addCriterion("examination_tm_wdt in", values, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtNotIn(List<Double> values) {
            addCriterion("examination_tm_wdt not in", values, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtBetween(Double value1, Double value2) {
            addCriterion("examination_tm_wdt between", value1, value2, "examinationTmWdt");
            return (Criteria) this;
        }

        public Criteria andExaminationTmWdtNotBetween(Double value1, Double value2) {
            addCriterion("examination_tm_wdt not between", value1, value2, "examinationTmWdt");
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