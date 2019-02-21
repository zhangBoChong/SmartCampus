package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DccharacterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DccharacterExample() {
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

        public Criteria andDccharacteridIsNull() {
            addCriterion("DCcharacterId is null");
            return (Criteria) this;
        }

        public Criteria andDccharacteridIsNotNull() {
            addCriterion("DCcharacterId is not null");
            return (Criteria) this;
        }

        public Criteria andDccharacteridEqualTo(Integer value) {
            addCriterion("DCcharacterId =", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridNotEqualTo(Integer value) {
            addCriterion("DCcharacterId <>", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridGreaterThan(Integer value) {
            addCriterion("DCcharacterId >", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCcharacterId >=", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridLessThan(Integer value) {
            addCriterion("DCcharacterId <", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridLessThanOrEqualTo(Integer value) {
            addCriterion("DCcharacterId <=", value, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridIn(List<Integer> values) {
            addCriterion("DCcharacterId in", values, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridNotIn(List<Integer> values) {
            addCriterion("DCcharacterId not in", values, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridBetween(Integer value1, Integer value2) {
            addCriterion("DCcharacterId between", value1, value2, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andDccharacteridNotBetween(Integer value1, Integer value2) {
            addCriterion("DCcharacterId not between", value1, value2, "dccharacterid");
            return (Criteria) this;
        }

        public Criteria andCharacternameIsNull() {
            addCriterion("characterName is null");
            return (Criteria) this;
        }

        public Criteria andCharacternameIsNotNull() {
            addCriterion("characterName is not null");
            return (Criteria) this;
        }

        public Criteria andCharacternameEqualTo(String value) {
            addCriterion("characterName =", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameNotEqualTo(String value) {
            addCriterion("characterName <>", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameGreaterThan(String value) {
            addCriterion("characterName >", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameGreaterThanOrEqualTo(String value) {
            addCriterion("characterName >=", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameLessThan(String value) {
            addCriterion("characterName <", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameLessThanOrEqualTo(String value) {
            addCriterion("characterName <=", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameLike(String value) {
            addCriterion("characterName like", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameNotLike(String value) {
            addCriterion("characterName not like", value, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameIn(List<String> values) {
            addCriterion("characterName in", values, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameNotIn(List<String> values) {
            addCriterion("characterName not in", values, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameBetween(String value1, String value2) {
            addCriterion("characterName between", value1, value2, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharacternameNotBetween(String value1, String value2) {
            addCriterion("characterName not between", value1, value2, "charactername");
            return (Criteria) this;
        }

        public Criteria andCharactergreadIsNull() {
            addCriterion("characterGread is null");
            return (Criteria) this;
        }

        public Criteria andCharactergreadIsNotNull() {
            addCriterion("characterGread is not null");
            return (Criteria) this;
        }

        public Criteria andCharactergreadEqualTo(Integer value) {
            addCriterion("characterGread =", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadNotEqualTo(Integer value) {
            addCriterion("characterGread <>", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadGreaterThan(Integer value) {
            addCriterion("characterGread >", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("characterGread >=", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadLessThan(Integer value) {
            addCriterion("characterGread <", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadLessThanOrEqualTo(Integer value) {
            addCriterion("characterGread <=", value, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadIn(List<Integer> values) {
            addCriterion("characterGread in", values, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadNotIn(List<Integer> values) {
            addCriterion("characterGread not in", values, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadBetween(Integer value1, Integer value2) {
            addCriterion("characterGread between", value1, value2, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharactergreadNotBetween(Integer value1, Integer value2) {
            addCriterion("characterGread not between", value1, value2, "charactergread");
            return (Criteria) this;
        }

        public Criteria andCharacterclassIsNull() {
            addCriterion("characterClass is null");
            return (Criteria) this;
        }

        public Criteria andCharacterclassIsNotNull() {
            addCriterion("characterClass is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterclassEqualTo(Integer value) {
            addCriterion("characterClass =", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassNotEqualTo(Integer value) {
            addCriterion("characterClass <>", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassGreaterThan(Integer value) {
            addCriterion("characterClass >", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("characterClass >=", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassLessThan(Integer value) {
            addCriterion("characterClass <", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassLessThanOrEqualTo(Integer value) {
            addCriterion("characterClass <=", value, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassIn(List<Integer> values) {
            addCriterion("characterClass in", values, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassNotIn(List<Integer> values) {
            addCriterion("characterClass not in", values, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassBetween(Integer value1, Integer value2) {
            addCriterion("characterClass between", value1, value2, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterclassNotBetween(Integer value1, Integer value2) {
            addCriterion("characterClass not between", value1, value2, "characterclass");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreIsNull() {
            addCriterion("characterScore is null");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreIsNotNull() {
            addCriterion("characterScore is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreEqualTo(Integer value) {
            addCriterion("characterScore =", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreNotEqualTo(Integer value) {
            addCriterion("characterScore <>", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreGreaterThan(Integer value) {
            addCriterion("characterScore >", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("characterScore >=", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreLessThan(Integer value) {
            addCriterion("characterScore <", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreLessThanOrEqualTo(Integer value) {
            addCriterion("characterScore <=", value, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreIn(List<Integer> values) {
            addCriterion("characterScore in", values, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreNotIn(List<Integer> values) {
            addCriterion("characterScore not in", values, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreBetween(Integer value1, Integer value2) {
            addCriterion("characterScore between", value1, value2, "characterscore");
            return (Criteria) this;
        }

        public Criteria andCharacterscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("characterScore not between", value1, value2, "characterscore");
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