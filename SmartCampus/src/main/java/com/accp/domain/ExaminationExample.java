package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationExample() {
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

        public Criteria andExaminationZfIsNull() {
            addCriterion("Examination_zf is null");
            return (Criteria) this;
        }

        public Criteria andExaminationZfIsNotNull() {
            addCriterion("Examination_zf is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationZfEqualTo(Double value) {
            addCriterion("Examination_zf =", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfNotEqualTo(Double value) {
            addCriterion("Examination_zf <>", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfGreaterThan(Double value) {
            addCriterion("Examination_zf >", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfGreaterThanOrEqualTo(Double value) {
            addCriterion("Examination_zf >=", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfLessThan(Double value) {
            addCriterion("Examination_zf <", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfLessThanOrEqualTo(Double value) {
            addCriterion("Examination_zf <=", value, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfIn(List<Double> values) {
            addCriterion("Examination_zf in", values, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfNotIn(List<Double> values) {
            addCriterion("Examination_zf not in", values, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfBetween(Double value1, Double value2) {
            addCriterion("Examination_zf between", value1, value2, "examinationZf");
            return (Criteria) this;
        }

        public Criteria andExaminationZfNotBetween(Double value1, Double value2) {
            addCriterion("Examination_zf not between", value1, value2, "examinationZf");
            return (Criteria) this;
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

        public Criteria andExaminationKstimeIsNull() {
            addCriterion("examination_kstime is null");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeIsNotNull() {
            addCriterion("examination_kstime is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeEqualTo(Date value) {
            addCriterion("examination_kstime =", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeNotEqualTo(Date value) {
            addCriterion("examination_kstime <>", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeGreaterThan(Date value) {
            addCriterion("examination_kstime >", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examination_kstime >=", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeLessThan(Date value) {
            addCriterion("examination_kstime <", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeLessThanOrEqualTo(Date value) {
            addCriterion("examination_kstime <=", value, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeIn(List<Date> values) {
            addCriterion("examination_kstime in", values, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeNotIn(List<Date> values) {
            addCriterion("examination_kstime not in", values, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeBetween(Date value1, Date value2) {
            addCriterion("examination_kstime between", value1, value2, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationKstimeNotBetween(Date value1, Date value2) {
            addCriterion("examination_kstime not between", value1, value2, "examinationKstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeIsNull() {
            addCriterion("examination_jstime is null");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeIsNotNull() {
            addCriterion("examination_jstime is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeEqualTo(Date value) {
            addCriterion("examination_jstime =", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeNotEqualTo(Date value) {
            addCriterion("examination_jstime <>", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeGreaterThan(Date value) {
            addCriterion("examination_jstime >", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examination_jstime >=", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeLessThan(Date value) {
            addCriterion("examination_jstime <", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeLessThanOrEqualTo(Date value) {
            addCriterion("examination_jstime <=", value, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeIn(List<Date> values) {
            addCriterion("examination_jstime in", values, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeNotIn(List<Date> values) {
            addCriterion("examination_jstime not in", values, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeBetween(Date value1, Date value2) {
            addCriterion("examination_jstime between", value1, value2, "examinationJstime");
            return (Criteria) this;
        }

        public Criteria andExaminationJstimeNotBetween(Date value1, Date value2) {
            addCriterion("examination_jstime not between", value1, value2, "examinationJstime");
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