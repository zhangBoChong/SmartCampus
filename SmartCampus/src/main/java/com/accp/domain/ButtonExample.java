package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ButtonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ButtonExample() {
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

        public Criteria andButtonidIsNull() {
            addCriterion("buttonid is null");
            return (Criteria) this;
        }

        public Criteria andButtonidIsNotNull() {
            addCriterion("buttonid is not null");
            return (Criteria) this;
        }

        public Criteria andButtonidEqualTo(Integer value) {
            addCriterion("buttonid =", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotEqualTo(Integer value) {
            addCriterion("buttonid <>", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidGreaterThan(Integer value) {
            addCriterion("buttonid >", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buttonid >=", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidLessThan(Integer value) {
            addCriterion("buttonid <", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidLessThanOrEqualTo(Integer value) {
            addCriterion("buttonid <=", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidIn(List<Integer> values) {
            addCriterion("buttonid in", values, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotIn(List<Integer> values) {
            addCriterion("buttonid not in", values, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidBetween(Integer value1, Integer value2) {
            addCriterion("buttonid between", value1, value2, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotBetween(Integer value1, Integer value2) {
            addCriterion("buttonid not between", value1, value2, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonnameIsNull() {
            addCriterion("buttonname is null");
            return (Criteria) this;
        }

        public Criteria andButtonnameIsNotNull() {
            addCriterion("buttonname is not null");
            return (Criteria) this;
        }

        public Criteria andButtonnameEqualTo(String value) {
            addCriterion("buttonname =", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotEqualTo(String value) {
            addCriterion("buttonname <>", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameGreaterThan(String value) {
            addCriterion("buttonname >", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameGreaterThanOrEqualTo(String value) {
            addCriterion("buttonname >=", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLessThan(String value) {
            addCriterion("buttonname <", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLessThanOrEqualTo(String value) {
            addCriterion("buttonname <=", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLike(String value) {
            addCriterion("buttonname like", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotLike(String value) {
            addCriterion("buttonname not like", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameIn(List<String> values) {
            addCriterion("buttonname in", values, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotIn(List<String> values) {
            addCriterion("buttonname not in", values, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameBetween(String value1, String value2) {
            addCriterion("buttonname between", value1, value2, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotBetween(String value1, String value2) {
            addCriterion("buttonname not between", value1, value2, "buttonname");
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

        public Criteria andButtonreserveoneIsNull() {
            addCriterion("buttonreserveone is null");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneIsNotNull() {
            addCriterion("buttonreserveone is not null");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneEqualTo(String value) {
            addCriterion("buttonreserveone =", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneNotEqualTo(String value) {
            addCriterion("buttonreserveone <>", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneGreaterThan(String value) {
            addCriterion("buttonreserveone >", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneGreaterThanOrEqualTo(String value) {
            addCriterion("buttonreserveone >=", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneLessThan(String value) {
            addCriterion("buttonreserveone <", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneLessThanOrEqualTo(String value) {
            addCriterion("buttonreserveone <=", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneLike(String value) {
            addCriterion("buttonreserveone like", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneNotLike(String value) {
            addCriterion("buttonreserveone not like", value, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneIn(List<String> values) {
            addCriterion("buttonreserveone in", values, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneNotIn(List<String> values) {
            addCriterion("buttonreserveone not in", values, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneBetween(String value1, String value2) {
            addCriterion("buttonreserveone between", value1, value2, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreserveoneNotBetween(String value1, String value2) {
            addCriterion("buttonreserveone not between", value1, value2, "buttonreserveone");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoIsNull() {
            addCriterion("buttonreservetwo is null");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoIsNotNull() {
            addCriterion("buttonreservetwo is not null");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoEqualTo(String value) {
            addCriterion("buttonreservetwo =", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoNotEqualTo(String value) {
            addCriterion("buttonreservetwo <>", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoGreaterThan(String value) {
            addCriterion("buttonreservetwo >", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoGreaterThanOrEqualTo(String value) {
            addCriterion("buttonreservetwo >=", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoLessThan(String value) {
            addCriterion("buttonreservetwo <", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoLessThanOrEqualTo(String value) {
            addCriterion("buttonreservetwo <=", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoLike(String value) {
            addCriterion("buttonreservetwo like", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoNotLike(String value) {
            addCriterion("buttonreservetwo not like", value, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoIn(List<String> values) {
            addCriterion("buttonreservetwo in", values, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoNotIn(List<String> values) {
            addCriterion("buttonreservetwo not in", values, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoBetween(String value1, String value2) {
            addCriterion("buttonreservetwo between", value1, value2, "buttonreservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonreservetwoNotBetween(String value1, String value2) {
            addCriterion("buttonreservetwo not between", value1, value2, "buttonreservetwo");
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