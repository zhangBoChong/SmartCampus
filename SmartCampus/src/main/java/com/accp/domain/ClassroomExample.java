package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andClassroomidIsNull() {
            addCriterion("classroomId is null");
            return (Criteria) this;
        }

        public Criteria andClassroomidIsNotNull() {
            addCriterion("classroomId is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomidEqualTo(Integer value) {
            addCriterion("classroomId =", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotEqualTo(Integer value) {
            addCriterion("classroomId <>", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThan(Integer value) {
            addCriterion("classroomId >", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroomId >=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThan(Integer value) {
            addCriterion("classroomId <", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThanOrEqualTo(Integer value) {
            addCriterion("classroomId <=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidIn(List<Integer> values) {
            addCriterion("classroomId in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotIn(List<Integer> values) {
            addCriterion("classroomId not in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidBetween(Integer value1, Integer value2) {
            addCriterion("classroomId between", value1, value2, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("classroomId not between", value1, value2, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIsNull() {
            addCriterion("classroomName is null");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIsNotNull() {
            addCriterion("classroomName is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomnameEqualTo(String value) {
            addCriterion("classroomName =", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotEqualTo(String value) {
            addCriterion("classroomName <>", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameGreaterThan(String value) {
            addCriterion("classroomName >", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameGreaterThanOrEqualTo(String value) {
            addCriterion("classroomName >=", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLessThan(String value) {
            addCriterion("classroomName <", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLessThanOrEqualTo(String value) {
            addCriterion("classroomName <=", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLike(String value) {
            addCriterion("classroomName like", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotLike(String value) {
            addCriterion("classroomName not like", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIn(List<String> values) {
            addCriterion("classroomName in", values, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotIn(List<String> values) {
            addCriterion("classroomName not in", values, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameBetween(String value1, String value2) {
            addCriterion("classroomName between", value1, value2, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotBetween(String value1, String value2) {
            addCriterion("classroomName not between", value1, value2, "classroomname");
            return (Criteria) this;
        }

        public Criteria andFlooridIsNull() {
            addCriterion("floorId is null");
            return (Criteria) this;
        }

        public Criteria andFlooridIsNotNull() {
            addCriterion("floorId is not null");
            return (Criteria) this;
        }

        public Criteria andFlooridEqualTo(Integer value) {
            addCriterion("floorId =", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotEqualTo(Integer value) {
            addCriterion("floorId <>", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridGreaterThan(Integer value) {
            addCriterion("floorId >", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridGreaterThanOrEqualTo(Integer value) {
            addCriterion("floorId >=", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridLessThan(Integer value) {
            addCriterion("floorId <", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridLessThanOrEqualTo(Integer value) {
            addCriterion("floorId <=", value, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridIn(List<Integer> values) {
            addCriterion("floorId in", values, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotIn(List<Integer> values) {
            addCriterion("floorId not in", values, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridBetween(Integer value1, Integer value2) {
            addCriterion("floorId between", value1, value2, "floorid");
            return (Criteria) this;
        }

        public Criteria andFlooridNotBetween(Integer value1, Integer value2) {
            addCriterion("floorId not between", value1, value2, "floorid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAccommodateIsNull() {
            addCriterion("accommodate is null");
            return (Criteria) this;
        }

        public Criteria andAccommodateIsNotNull() {
            addCriterion("accommodate is not null");
            return (Criteria) this;
        }

        public Criteria andAccommodateEqualTo(Integer value) {
            addCriterion("accommodate =", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateNotEqualTo(Integer value) {
            addCriterion("accommodate <>", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateGreaterThan(Integer value) {
            addCriterion("accommodate >", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateGreaterThanOrEqualTo(Integer value) {
            addCriterion("accommodate >=", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateLessThan(Integer value) {
            addCriterion("accommodate <", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateLessThanOrEqualTo(Integer value) {
            addCriterion("accommodate <=", value, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateIn(List<Integer> values) {
            addCriterion("accommodate in", values, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateNotIn(List<Integer> values) {
            addCriterion("accommodate not in", values, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateBetween(Integer value1, Integer value2) {
            addCriterion("accommodate between", value1, value2, "accommodate");
            return (Criteria) this;
        }

        public Criteria andAccommodateNotBetween(Integer value1, Integer value2) {
            addCriterion("accommodate not between", value1, value2, "accommodate");
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