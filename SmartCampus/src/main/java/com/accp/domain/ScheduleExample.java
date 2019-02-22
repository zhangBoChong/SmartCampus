package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andScheduleidIsNull() {
            addCriterion("scheduleId is null");
            return (Criteria) this;
        }

        public Criteria andScheduleidIsNotNull() {
            addCriterion("scheduleId is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleidEqualTo(Integer value) {
            addCriterion("scheduleId =", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotEqualTo(Integer value) {
            addCriterion("scheduleId <>", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThan(Integer value) {
            addCriterion("scheduleId >", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduleId >=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThan(Integer value) {
            addCriterion("scheduleId <", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThanOrEqualTo(Integer value) {
            addCriterion("scheduleId <=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidIn(List<Integer> values) {
            addCriterion("scheduleId in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotIn(List<Integer> values) {
            addCriterion("scheduleId not in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidBetween(Integer value1, Integer value2) {
            addCriterion("scheduleId between", value1, value2, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduleId not between", value1, value2, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andDatestartIsNull() {
            addCriterion("datestart is null");
            return (Criteria) this;
        }

        public Criteria andDatestartIsNotNull() {
            addCriterion("datestart is not null");
            return (Criteria) this;
        }

        public Criteria andDatestartEqualTo(Date value) {
            addCriterionForJDBCDate("datestart =", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotEqualTo(Date value) {
            addCriterionForJDBCDate("datestart <>", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartGreaterThan(Date value) {
            addCriterionForJDBCDate("datestart >", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datestart >=", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartLessThan(Date value) {
            addCriterionForJDBCDate("datestart <", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datestart <=", value, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartIn(List<Date> values) {
            addCriterionForJDBCDate("datestart in", values, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotIn(List<Date> values) {
            addCriterionForJDBCDate("datestart not in", values, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datestart between", value1, value2, "datestart");
            return (Criteria) this;
        }

        public Criteria andDatestartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datestart not between", value1, value2, "datestart");
            return (Criteria) this;
        }

        public Criteria andDateendIsNull() {
            addCriterion("dateend is null");
            return (Criteria) this;
        }

        public Criteria andDateendIsNotNull() {
            addCriterion("dateend is not null");
            return (Criteria) this;
        }

        public Criteria andDateendEqualTo(Date value) {
            addCriterionForJDBCDate("dateend =", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendNotEqualTo(Date value) {
            addCriterionForJDBCDate("dateend <>", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendGreaterThan(Date value) {
            addCriterionForJDBCDate("dateend >", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateend >=", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendLessThan(Date value) {
            addCriterionForJDBCDate("dateend <", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateend <=", value, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendIn(List<Date> values) {
            addCriterionForJDBCDate("dateend in", values, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendNotIn(List<Date> values) {
            addCriterionForJDBCDate("dateend not in", values, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateend between", value1, value2, "dateend");
            return (Criteria) this;
        }

        public Criteria andDateendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateend not between", value1, value2, "dateend");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOutlineIsNull() {
            addCriterion("outline is null");
            return (Criteria) this;
        }

        public Criteria andOutlineIsNotNull() {
            addCriterion("outline is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineEqualTo(String value) {
            addCriterion("outline =", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotEqualTo(String value) {
            addCriterion("outline <>", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineGreaterThan(String value) {
            addCriterion("outline >", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("outline >=", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLessThan(String value) {
            addCriterion("outline <", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLessThanOrEqualTo(String value) {
            addCriterion("outline <=", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLike(String value) {
            addCriterion("outline like", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotLike(String value) {
            addCriterion("outline not like", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineIn(List<String> values) {
            addCriterion("outline in", values, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotIn(List<String> values) {
            addCriterion("outline not in", values, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineBetween(String value1, String value2) {
            addCriterion("outline between", value1, value2, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotBetween(String value1, String value2) {
            addCriterion("outline not between", value1, value2, "outline");
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