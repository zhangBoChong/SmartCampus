package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ExaminationFbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationFbExample() {
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

        public Criteria andExaminationFbIdIsNull() {
            addCriterion("examination_fb_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdIsNotNull() {
            addCriterion("examination_fb_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdEqualTo(Integer value) {
            addCriterion("examination_fb_id =", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdNotEqualTo(Integer value) {
            addCriterion("examination_fb_id <>", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdGreaterThan(Integer value) {
            addCriterion("examination_fb_id >", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_fb_id >=", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdLessThan(Integer value) {
            addCriterion("examination_fb_id <", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_fb_id <=", value, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdIn(List<Integer> values) {
            addCriterion("examination_fb_id in", values, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdNotIn(List<Integer> values) {
            addCriterion("examination_fb_id not in", values, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_fb_id between", value1, value2, "examinationFbId");
            return (Criteria) this;
        }

        public Criteria andExaminationFbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_fb_id not between", value1, value2, "examinationFbId");
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

        public Criteria andCsidIsNull() {
            addCriterion("csId is null");
            return (Criteria) this;
        }

        public Criteria andCsidIsNotNull() {
            addCriterion("csId is not null");
            return (Criteria) this;
        }

        public Criteria andCsidEqualTo(Integer value) {
            addCriterion("csId =", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotEqualTo(Integer value) {
            addCriterion("csId <>", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThan(Integer value) {
            addCriterion("csId >", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("csId >=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThan(Integer value) {
            addCriterion("csId <", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThanOrEqualTo(Integer value) {
            addCriterion("csId <=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidIn(List<Integer> values) {
            addCriterion("csId in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotIn(List<Integer> values) {
            addCriterion("csId not in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidBetween(Integer value1, Integer value2) {
            addCriterion("csId between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotBetween(Integer value1, Integer value2) {
            addCriterion("csId not between", value1, value2, "csid");
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