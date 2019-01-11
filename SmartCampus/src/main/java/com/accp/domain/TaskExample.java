package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
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

        public Criteria andTaskZfIsNull() {
            addCriterion("task_zf is null");
            return (Criteria) this;
        }

        public Criteria andTaskZfIsNotNull() {
            addCriterion("task_zf is not null");
            return (Criteria) this;
        }

        public Criteria andTaskZfEqualTo(Double value) {
            addCriterion("task_zf =", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfNotEqualTo(Double value) {
            addCriterion("task_zf <>", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfGreaterThan(Double value) {
            addCriterion("task_zf >", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfGreaterThanOrEqualTo(Double value) {
            addCriterion("task_zf >=", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfLessThan(Double value) {
            addCriterion("task_zf <", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfLessThanOrEqualTo(Double value) {
            addCriterion("task_zf <=", value, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfIn(List<Double> values) {
            addCriterion("task_zf in", values, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfNotIn(List<Double> values) {
            addCriterion("task_zf not in", values, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfBetween(Double value1, Double value2) {
            addCriterion("task_zf between", value1, value2, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskZfNotBetween(Double value1, Double value2) {
            addCriterion("task_zf not between", value1, value2, "taskZf");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdIsNull() {
            addCriterion("task_lx_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdIsNotNull() {
            addCriterion("task_lx_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdEqualTo(Integer value) {
            addCriterion("task_lx_id =", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdNotEqualTo(Integer value) {
            addCriterion("task_lx_id <>", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdGreaterThan(Integer value) {
            addCriterion("task_lx_id >", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_lx_id >=", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdLessThan(Integer value) {
            addCriterion("task_lx_id <", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_lx_id <=", value, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdIn(List<Integer> values) {
            addCriterion("task_lx_id in", values, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdNotIn(List<Integer> values) {
            addCriterion("task_lx_id not in", values, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdBetween(Integer value1, Integer value2) {
            addCriterion("task_lx_id between", value1, value2, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskLxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_lx_id not between", value1, value2, "taskLxId");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeIsNull() {
            addCriterion("task_kstime is null");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeIsNotNull() {
            addCriterion("task_kstime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeEqualTo(Date value) {
            addCriterion("task_kstime =", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeNotEqualTo(Date value) {
            addCriterion("task_kstime <>", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeGreaterThan(Date value) {
            addCriterion("task_kstime >", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_kstime >=", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeLessThan(Date value) {
            addCriterion("task_kstime <", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeLessThanOrEqualTo(Date value) {
            addCriterion("task_kstime <=", value, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeIn(List<Date> values) {
            addCriterion("task_kstime in", values, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeNotIn(List<Date> values) {
            addCriterion("task_kstime not in", values, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeBetween(Date value1, Date value2) {
            addCriterion("task_kstime between", value1, value2, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskKstimeNotBetween(Date value1, Date value2) {
            addCriterion("task_kstime not between", value1, value2, "taskKstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeIsNull() {
            addCriterion("task_jstime is null");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeIsNotNull() {
            addCriterion("task_jstime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeEqualTo(Date value) {
            addCriterion("task_jstime =", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeNotEqualTo(Date value) {
            addCriterion("task_jstime <>", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeGreaterThan(Date value) {
            addCriterion("task_jstime >", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_jstime >=", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeLessThan(Date value) {
            addCriterion("task_jstime <", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeLessThanOrEqualTo(Date value) {
            addCriterion("task_jstime <=", value, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeIn(List<Date> values) {
            addCriterion("task_jstime in", values, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeNotIn(List<Date> values) {
            addCriterion("task_jstime not in", values, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeBetween(Date value1, Date value2) {
            addCriterion("task_jstime between", value1, value2, "taskJstime");
            return (Criteria) this;
        }

        public Criteria andTaskJstimeNotBetween(Date value1, Date value2) {
            addCriterion("task_jstime not between", value1, value2, "taskJstime");
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