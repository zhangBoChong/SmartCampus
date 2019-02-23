package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ButtonmiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ButtonmiddleExample() {
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

        public Criteria andBridIsNull() {
            addCriterion("brid is null");
            return (Criteria) this;
        }

        public Criteria andBridIsNotNull() {
            addCriterion("brid is not null");
            return (Criteria) this;
        }

        public Criteria andBridEqualTo(Integer value) {
            addCriterion("brid =", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotEqualTo(Integer value) {
            addCriterion("brid <>", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridGreaterThan(Integer value) {
            addCriterion("brid >", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridGreaterThanOrEqualTo(Integer value) {
            addCriterion("brid >=", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridLessThan(Integer value) {
            addCriterion("brid <", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridLessThanOrEqualTo(Integer value) {
            addCriterion("brid <=", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridIn(List<Integer> values) {
            addCriterion("brid in", values, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotIn(List<Integer> values) {
            addCriterion("brid not in", values, "brid");
            return (Criteria) this;
        }

        public Criteria andBridBetween(Integer value1, Integer value2) {
            addCriterion("brid between", value1, value2, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotBetween(Integer value1, Integer value2) {
            addCriterion("brid not between", value1, value2, "brid");
            return (Criteria) this;
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andButtonstatusIsNull() {
            addCriterion("buttonstatus is null");
            return (Criteria) this;
        }

        public Criteria andButtonstatusIsNotNull() {
            addCriterion("buttonstatus is not null");
            return (Criteria) this;
        }

        public Criteria andButtonstatusEqualTo(Integer value) {
            addCriterion("buttonstatus =", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusNotEqualTo(Integer value) {
            addCriterion("buttonstatus <>", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusGreaterThan(Integer value) {
            addCriterion("buttonstatus >", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("buttonstatus >=", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusLessThan(Integer value) {
            addCriterion("buttonstatus <", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusLessThanOrEqualTo(Integer value) {
            addCriterion("buttonstatus <=", value, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusIn(List<Integer> values) {
            addCriterion("buttonstatus in", values, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusNotIn(List<Integer> values) {
            addCriterion("buttonstatus not in", values, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusBetween(Integer value1, Integer value2) {
            addCriterion("buttonstatus between", value1, value2, "buttonstatus");
            return (Criteria) this;
        }

        public Criteria andButtonstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("buttonstatus not between", value1, value2, "buttonstatus");
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

        public Criteria andButtonmiddlereserveoneIsNull() {
            addCriterion("buttonmiddlereserveone is null");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneIsNotNull() {
            addCriterion("buttonmiddlereserveone is not null");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneEqualTo(String value) {
            addCriterion("buttonmiddlereserveone =", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneNotEqualTo(String value) {
            addCriterion("buttonmiddlereserveone <>", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneGreaterThan(String value) {
            addCriterion("buttonmiddlereserveone >", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneGreaterThanOrEqualTo(String value) {
            addCriterion("buttonmiddlereserveone >=", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneLessThan(String value) {
            addCriterion("buttonmiddlereserveone <", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneLessThanOrEqualTo(String value) {
            addCriterion("buttonmiddlereserveone <=", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneLike(String value) {
            addCriterion("buttonmiddlereserveone like", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneNotLike(String value) {
            addCriterion("buttonmiddlereserveone not like", value, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneIn(List<String> values) {
            addCriterion("buttonmiddlereserveone in", values, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneNotIn(List<String> values) {
            addCriterion("buttonmiddlereserveone not in", values, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneBetween(String value1, String value2) {
            addCriterion("buttonmiddlereserveone between", value1, value2, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereserveoneNotBetween(String value1, String value2) {
            addCriterion("buttonmiddlereserveone not between", value1, value2, "buttonmiddlereserveone");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoIsNull() {
            addCriterion("buttonmiddlereservetwo is null");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoIsNotNull() {
            addCriterion("buttonmiddlereservetwo is not null");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoEqualTo(String value) {
            addCriterion("buttonmiddlereservetwo =", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoNotEqualTo(String value) {
            addCriterion("buttonmiddlereservetwo <>", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoGreaterThan(String value) {
            addCriterion("buttonmiddlereservetwo >", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoGreaterThanOrEqualTo(String value) {
            addCriterion("buttonmiddlereservetwo >=", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoLessThan(String value) {
            addCriterion("buttonmiddlereservetwo <", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoLessThanOrEqualTo(String value) {
            addCriterion("buttonmiddlereservetwo <=", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoLike(String value) {
            addCriterion("buttonmiddlereservetwo like", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoNotLike(String value) {
            addCriterion("buttonmiddlereservetwo not like", value, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoIn(List<String> values) {
            addCriterion("buttonmiddlereservetwo in", values, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoNotIn(List<String> values) {
            addCriterion("buttonmiddlereservetwo not in", values, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoBetween(String value1, String value2) {
            addCriterion("buttonmiddlereservetwo between", value1, value2, "buttonmiddlereservetwo");
            return (Criteria) this;
        }

        public Criteria andButtonmiddlereservetwoNotBetween(String value1, String value2) {
            addCriterion("buttonmiddlereservetwo not between", value1, value2, "buttonmiddlereservetwo");
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