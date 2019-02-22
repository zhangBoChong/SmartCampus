package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppendixExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppendixExample() {
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

        public Criteria andAppendixIdIsNull() {
            addCriterion("appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNotNull() {
            addCriterion("appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdEqualTo(Integer value) {
            addCriterion("appendix_id =", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotEqualTo(Integer value) {
            addCriterion("appendix_id <>", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThan(Integer value) {
            addCriterion("appendix_id >", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appendix_id >=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThan(Integer value) {
            addCriterion("appendix_id <", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThanOrEqualTo(Integer value) {
            addCriterion("appendix_id <=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIn(List<Integer> values) {
            addCriterion("appendix_id in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotIn(List<Integer> values) {
            addCriterion("appendix_id not in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdBetween(Integer value1, Integer value2) {
            addCriterion("appendix_id between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appendix_id not between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdIsNull() {
            addCriterion("affiche_id is null");
            return (Criteria) this;
        }

        public Criteria andAfficheIdIsNotNull() {
            addCriterion("affiche_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheIdEqualTo(Integer value) {
            addCriterion("affiche_id =", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdNotEqualTo(Integer value) {
            addCriterion("affiche_id <>", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdGreaterThan(Integer value) {
            addCriterion("affiche_id >", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("affiche_id >=", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdLessThan(Integer value) {
            addCriterion("affiche_id <", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdLessThanOrEqualTo(Integer value) {
            addCriterion("affiche_id <=", value, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdIn(List<Integer> values) {
            addCriterion("affiche_id in", values, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdNotIn(List<Integer> values) {
            addCriterion("affiche_id not in", values, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdBetween(Integer value1, Integer value2) {
            addCriterion("affiche_id between", value1, value2, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAfficheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("affiche_id not between", value1, value2, "afficheId");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleIsNull() {
            addCriterion("appendix_title is null");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleIsNotNull() {
            addCriterion("appendix_title is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleEqualTo(String value) {
            addCriterion("appendix_title =", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleNotEqualTo(String value) {
            addCriterion("appendix_title <>", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleGreaterThan(String value) {
            addCriterion("appendix_title >", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleGreaterThanOrEqualTo(String value) {
            addCriterion("appendix_title >=", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleLessThan(String value) {
            addCriterion("appendix_title <", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleLessThanOrEqualTo(String value) {
            addCriterion("appendix_title <=", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleLike(String value) {
            addCriterion("appendix_title like", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleNotLike(String value) {
            addCriterion("appendix_title not like", value, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleIn(List<String> values) {
            addCriterion("appendix_title in", values, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleNotIn(List<String> values) {
            addCriterion("appendix_title not in", values, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleBetween(String value1, String value2) {
            addCriterion("appendix_title between", value1, value2, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixTitleNotBetween(String value1, String value2) {
            addCriterion("appendix_title not between", value1, value2, "appendixTitle");
            return (Criteria) this;
        }

        public Criteria andAppendixContentIsNull() {
            addCriterion("appendix_content is null");
            return (Criteria) this;
        }

        public Criteria andAppendixContentIsNotNull() {
            addCriterion("appendix_content is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixContentEqualTo(String value) {
            addCriterion("appendix_content =", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentNotEqualTo(String value) {
            addCriterion("appendix_content <>", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentGreaterThan(String value) {
            addCriterion("appendix_content >", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentGreaterThanOrEqualTo(String value) {
            addCriterion("appendix_content >=", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentLessThan(String value) {
            addCriterion("appendix_content <", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentLessThanOrEqualTo(String value) {
            addCriterion("appendix_content <=", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentLike(String value) {
            addCriterion("appendix_content like", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentNotLike(String value) {
            addCriterion("appendix_content not like", value, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentIn(List<String> values) {
            addCriterion("appendix_content in", values, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentNotIn(List<String> values) {
            addCriterion("appendix_content not in", values, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentBetween(String value1, String value2) {
            addCriterion("appendix_content between", value1, value2, "appendixContent");
            return (Criteria) this;
        }

        public Criteria andAppendixContentNotBetween(String value1, String value2) {
            addCriterion("appendix_content not between", value1, value2, "appendixContent");
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

        public Criteria andAppendixTimeIsNull() {
            addCriterion("appendix_time is null");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeIsNotNull() {
            addCriterion("appendix_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeEqualTo(Date value) {
            addCriterionForJDBCDate("appendix_time =", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("appendix_time <>", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("appendix_time >", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appendix_time >=", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeLessThan(Date value) {
            addCriterionForJDBCDate("appendix_time <", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appendix_time <=", value, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeIn(List<Date> values) {
            addCriterionForJDBCDate("appendix_time in", values, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("appendix_time not in", values, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appendix_time between", value1, value2, "appendixTime");
            return (Criteria) this;
        }

        public Criteria andAppendixTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appendix_time not between", value1, value2, "appendixTime");
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

        public Criteria andAppendixSendeeIsNull() {
            addCriterion("appendix_sendee is null");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeIsNotNull() {
            addCriterion("appendix_sendee is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeEqualTo(Integer value) {
            addCriterion("appendix_sendee =", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeNotEqualTo(Integer value) {
            addCriterion("appendix_sendee <>", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeGreaterThan(Integer value) {
            addCriterion("appendix_sendee >", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("appendix_sendee >=", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeLessThan(Integer value) {
            addCriterion("appendix_sendee <", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeLessThanOrEqualTo(Integer value) {
            addCriterion("appendix_sendee <=", value, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeIn(List<Integer> values) {
            addCriterion("appendix_sendee in", values, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeNotIn(List<Integer> values) {
            addCriterion("appendix_sendee not in", values, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeBetween(Integer value1, Integer value2) {
            addCriterion("appendix_sendee between", value1, value2, "appendixSendee");
            return (Criteria) this;
        }

        public Criteria andAppendixSendeeNotBetween(Integer value1, Integer value2) {
            addCriterion("appendix_sendee not between", value1, value2, "appendixSendee");
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