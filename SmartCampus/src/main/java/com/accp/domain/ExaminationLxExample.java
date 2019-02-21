package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ExaminationLxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationLxExample() {
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

        public Criteria andExaminationLxIdIsNull() {
            addCriterion("examination_lx_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdIsNotNull() {
            addCriterion("examination_lx_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdEqualTo(Integer value) {
            addCriterion("examination_lx_id =", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdNotEqualTo(Integer value) {
            addCriterion("examination_lx_id <>", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdGreaterThan(Integer value) {
            addCriterion("examination_lx_id >", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_lx_id >=", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdLessThan(Integer value) {
            addCriterion("examination_lx_id <", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_lx_id <=", value, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdIn(List<Integer> values) {
            addCriterion("examination_lx_id in", values, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdNotIn(List<Integer> values) {
            addCriterion("examination_lx_id not in", values, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_lx_id between", value1, value2, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_lx_id not between", value1, value2, "examinationLxId");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeIsNull() {
            addCriterion("examination_lx_type is null");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeIsNotNull() {
            addCriterion("examination_lx_type is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeEqualTo(String value) {
            addCriterion("examination_lx_type =", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeNotEqualTo(String value) {
            addCriterion("examination_lx_type <>", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeGreaterThan(String value) {
            addCriterion("examination_lx_type >", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("examination_lx_type >=", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeLessThan(String value) {
            addCriterion("examination_lx_type <", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeLessThanOrEqualTo(String value) {
            addCriterion("examination_lx_type <=", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeLike(String value) {
            addCriterion("examination_lx_type like", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeNotLike(String value) {
            addCriterion("examination_lx_type not like", value, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeIn(List<String> values) {
            addCriterion("examination_lx_type in", values, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeNotIn(List<String> values) {
            addCriterion("examination_lx_type not in", values, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeBetween(String value1, String value2) {
            addCriterion("examination_lx_type between", value1, value2, "examinationLxType");
            return (Criteria) this;
        }

        public Criteria andExaminationLxTypeNotBetween(String value1, String value2) {
            addCriterion("examination_lx_type not between", value1, value2, "examinationLxType");
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