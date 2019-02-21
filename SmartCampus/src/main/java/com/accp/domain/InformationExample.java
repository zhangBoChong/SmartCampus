package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationExample() {
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

        public Criteria andInformationIdIsNull() {
            addCriterion("information_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("information_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(Integer value) {
            addCriterion("information_id =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(Integer value) {
            addCriterion("information_id <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(Integer value) {
            addCriterion("information_id >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_id >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(Integer value) {
            addCriterion("information_id <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("information_id <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<Integer> values) {
            addCriterion("information_id in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<Integer> values) {
            addCriterion("information_id not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("information_id between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("information_id not between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andInformationContentIsNull() {
            addCriterion("information_content is null");
            return (Criteria) this;
        }

        public Criteria andInformationContentIsNotNull() {
            addCriterion("information_content is not null");
            return (Criteria) this;
        }

        public Criteria andInformationContentEqualTo(String value) {
            addCriterion("information_content =", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentNotEqualTo(String value) {
            addCriterion("information_content <>", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentGreaterThan(String value) {
            addCriterion("information_content >", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentGreaterThanOrEqualTo(String value) {
            addCriterion("information_content >=", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentLessThan(String value) {
            addCriterion("information_content <", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentLessThanOrEqualTo(String value) {
            addCriterion("information_content <=", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentLike(String value) {
            addCriterion("information_content like", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentNotLike(String value) {
            addCriterion("information_content not like", value, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentIn(List<String> values) {
            addCriterion("information_content in", values, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentNotIn(List<String> values) {
            addCriterion("information_content not in", values, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentBetween(String value1, String value2) {
            addCriterion("information_content between", value1, value2, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationContentNotBetween(String value1, String value2) {
            addCriterion("information_content not between", value1, value2, "informationContent");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeIsNull() {
            addCriterion("information_sendee is null");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeIsNotNull() {
            addCriterion("information_sendee is not null");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeEqualTo(Integer value) {
            addCriterion("information_sendee =", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeNotEqualTo(Integer value) {
            addCriterion("information_sendee <>", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeGreaterThan(Integer value) {
            addCriterion("information_sendee >", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_sendee >=", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeLessThan(Integer value) {
            addCriterion("information_sendee <", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeLessThanOrEqualTo(Integer value) {
            addCriterion("information_sendee <=", value, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeIn(List<Integer> values) {
            addCriterion("information_sendee in", values, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeNotIn(List<Integer> values) {
            addCriterion("information_sendee not in", values, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeBetween(Integer value1, Integer value2) {
            addCriterion("information_sendee between", value1, value2, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationSendeeNotBetween(Integer value1, Integer value2) {
            addCriterion("information_sendee not between", value1, value2, "informationSendee");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIsNull() {
            addCriterion("information_time is null");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIsNotNull() {
            addCriterion("information_time is not null");
            return (Criteria) this;
        }

        public Criteria andInformationTimeEqualTo(Date value) {
            addCriterionForJDBCDate("information_time =", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("information_time <>", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("information_time >", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("information_time >=", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeLessThan(Date value) {
            addCriterionForJDBCDate("information_time <", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("information_time <=", value, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeIn(List<Date> values) {
            addCriterionForJDBCDate("information_time in", values, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("information_time not in", values, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("information_time between", value1, value2, "informationTime");
            return (Criteria) this;
        }

        public Criteria andInformationTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("information_time not between", value1, value2, "informationTime");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andInformationFetchIsNull() {
            addCriterion("information_fetch is null");
            return (Criteria) this;
        }

        public Criteria andInformationFetchIsNotNull() {
            addCriterion("information_fetch is not null");
            return (Criteria) this;
        }

        public Criteria andInformationFetchEqualTo(Integer value) {
            addCriterion("information_fetch =", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchNotEqualTo(Integer value) {
            addCriterion("information_fetch <>", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchGreaterThan(Integer value) {
            addCriterion("information_fetch >", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_fetch >=", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchLessThan(Integer value) {
            addCriterion("information_fetch <", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchLessThanOrEqualTo(Integer value) {
            addCriterion("information_fetch <=", value, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchIn(List<Integer> values) {
            addCriterion("information_fetch in", values, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchNotIn(List<Integer> values) {
            addCriterion("information_fetch not in", values, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchBetween(Integer value1, Integer value2) {
            addCriterion("information_fetch between", value1, value2, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationFetchNotBetween(Integer value1, Integer value2) {
            addCriterion("information_fetch not between", value1, value2, "informationFetch");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIsNull() {
            addCriterion("information_type is null");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIsNotNull() {
            addCriterion("information_type is not null");
            return (Criteria) this;
        }

        public Criteria andInformationTypeEqualTo(Integer value) {
            addCriterion("information_type =", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotEqualTo(Integer value) {
            addCriterion("information_type <>", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeGreaterThan(Integer value) {
            addCriterion("information_type >", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_type >=", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeLessThan(Integer value) {
            addCriterion("information_type <", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("information_type <=", value, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeIn(List<Integer> values) {
            addCriterion("information_type in", values, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotIn(List<Integer> values) {
            addCriterion("information_type not in", values, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeBetween(Integer value1, Integer value2) {
            addCriterion("information_type between", value1, value2, "informationType");
            return (Criteria) this;
        }

        public Criteria andInformationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("information_type not between", value1, value2, "informationType");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIsNull() {
            addCriterion("delete_id is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIsNotNull() {
            addCriterion("delete_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteIdEqualTo(Integer value) {
            addCriterion("delete_id =", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotEqualTo(Integer value) {
            addCriterion("delete_id <>", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdGreaterThan(Integer value) {
            addCriterion("delete_id >", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_id >=", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdLessThan(Integer value) {
            addCriterion("delete_id <", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdLessThanOrEqualTo(Integer value) {
            addCriterion("delete_id <=", value, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdIn(List<Integer> values) {
            addCriterion("delete_id in", values, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotIn(List<Integer> values) {
            addCriterion("delete_id not in", values, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdBetween(Integer value1, Integer value2) {
            addCriterion("delete_id between", value1, value2, "deleteId");
            return (Criteria) this;
        }

        public Criteria andDeleteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_id not between", value1, value2, "deleteId");
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