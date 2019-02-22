package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AfficheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AfficheExample() {
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

        public Criteria andAfficheTitleIsNull() {
            addCriterion("affiche_title is null");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleIsNotNull() {
            addCriterion("affiche_title is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleEqualTo(String value) {
            addCriterion("affiche_title =", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleNotEqualTo(String value) {
            addCriterion("affiche_title <>", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleGreaterThan(String value) {
            addCriterion("affiche_title >", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleGreaterThanOrEqualTo(String value) {
            addCriterion("affiche_title >=", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleLessThan(String value) {
            addCriterion("affiche_title <", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleLessThanOrEqualTo(String value) {
            addCriterion("affiche_title <=", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleLike(String value) {
            addCriterion("affiche_title like", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleNotLike(String value) {
            addCriterion("affiche_title not like", value, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleIn(List<String> values) {
            addCriterion("affiche_title in", values, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleNotIn(List<String> values) {
            addCriterion("affiche_title not in", values, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleBetween(String value1, String value2) {
            addCriterion("affiche_title between", value1, value2, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheTitleNotBetween(String value1, String value2) {
            addCriterion("affiche_title not between", value1, value2, "afficheTitle");
            return (Criteria) this;
        }

        public Criteria andAfficheContentIsNull() {
            addCriterion("affiche_content is null");
            return (Criteria) this;
        }

        public Criteria andAfficheContentIsNotNull() {
            addCriterion("affiche_content is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheContentEqualTo(String value) {
            addCriterion("affiche_content =", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentNotEqualTo(String value) {
            addCriterion("affiche_content <>", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentGreaterThan(String value) {
            addCriterion("affiche_content >", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentGreaterThanOrEqualTo(String value) {
            addCriterion("affiche_content >=", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentLessThan(String value) {
            addCriterion("affiche_content <", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentLessThanOrEqualTo(String value) {
            addCriterion("affiche_content <=", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentLike(String value) {
            addCriterion("affiche_content like", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentNotLike(String value) {
            addCriterion("affiche_content not like", value, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentIn(List<String> values) {
            addCriterion("affiche_content in", values, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentNotIn(List<String> values) {
            addCriterion("affiche_content not in", values, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentBetween(String value1, String value2) {
            addCriterion("affiche_content between", value1, value2, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheContentNotBetween(String value1, String value2) {
            addCriterion("affiche_content not between", value1, value2, "afficheContent");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftIsNull() {
            addCriterion("affiche_draft is null");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftIsNotNull() {
            addCriterion("affiche_draft is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftEqualTo(Integer value) {
            addCriterion("affiche_draft =", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftNotEqualTo(Integer value) {
            addCriterion("affiche_draft <>", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftGreaterThan(Integer value) {
            addCriterion("affiche_draft >", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftGreaterThanOrEqualTo(Integer value) {
            addCriterion("affiche_draft >=", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftLessThan(Integer value) {
            addCriterion("affiche_draft <", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftLessThanOrEqualTo(Integer value) {
            addCriterion("affiche_draft <=", value, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftIn(List<Integer> values) {
            addCriterion("affiche_draft in", values, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftNotIn(List<Integer> values) {
            addCriterion("affiche_draft not in", values, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftBetween(Integer value1, Integer value2) {
            addCriterion("affiche_draft between", value1, value2, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheDraftNotBetween(Integer value1, Integer value2) {
            addCriterion("affiche_draft not between", value1, value2, "afficheDraft");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeIsNull() {
            addCriterion("affiche_time is null");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeIsNotNull() {
            addCriterion("affiche_time is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeEqualTo(Date value) {
            addCriterionForJDBCDate("affiche_time =", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("affiche_time <>", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("affiche_time >", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("affiche_time >=", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeLessThan(Date value) {
            addCriterionForJDBCDate("affiche_time <", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("affiche_time <=", value, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeIn(List<Date> values) {
            addCriterionForJDBCDate("affiche_time in", values, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("affiche_time not in", values, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("affiche_time between", value1, value2, "afficheTime");
            return (Criteria) this;
        }

        public Criteria andAfficheTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("affiche_time not between", value1, value2, "afficheTime");
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

        public Criteria andAfficheSendeeIsNull() {
            addCriterion("affiche_sendee is null");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeIsNotNull() {
            addCriterion("affiche_sendee is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeEqualTo(Integer value) {
            addCriterion("affiche_sendee =", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeNotEqualTo(Integer value) {
            addCriterion("affiche_sendee <>", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeGreaterThan(Integer value) {
            addCriterion("affiche_sendee >", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("affiche_sendee >=", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeLessThan(Integer value) {
            addCriterion("affiche_sendee <", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeLessThanOrEqualTo(Integer value) {
            addCriterion("affiche_sendee <=", value, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeIn(List<Integer> values) {
            addCriterion("affiche_sendee in", values, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeNotIn(List<Integer> values) {
            addCriterion("affiche_sendee not in", values, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeBetween(Integer value1, Integer value2) {
            addCriterion("affiche_sendee between", value1, value2, "afficheSendee");
            return (Criteria) this;
        }

        public Criteria andAfficheSendeeNotBetween(Integer value1, Integer value2) {
            addCriterion("affiche_sendee not between", value1, value2, "afficheSendee");
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