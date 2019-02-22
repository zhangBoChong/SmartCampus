package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNull() {
            addCriterion("topic_name is null");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNotNull() {
            addCriterion("topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualTo(String value) {
            addCriterion("topic_name =", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualTo(String value) {
            addCriterion("topic_name <>", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThan(String value) {
            addCriterion("topic_name >", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("topic_name >=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThan(String value) {
            addCriterion("topic_name <", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualTo(String value) {
            addCriterion("topic_name <=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLike(String value) {
            addCriterion("topic_name like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotLike(String value) {
            addCriterion("topic_name not like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameIn(List<String> values) {
            addCriterion("topic_name in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotIn(List<String> values) {
            addCriterion("topic_name not in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameBetween(String value1, String value2) {
            addCriterion("topic_name between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotBetween(String value1, String value2) {
            addCriterion("topic_name not between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdIsNull() {
            addCriterion("topic_lx_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdIsNotNull() {
            addCriterion("topic_lx_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdEqualTo(Integer value) {
            addCriterion("topic_lx_id =", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdNotEqualTo(Integer value) {
            addCriterion("topic_lx_id <>", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdGreaterThan(Integer value) {
            addCriterion("topic_lx_id >", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_lx_id >=", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdLessThan(Integer value) {
            addCriterion("topic_lx_id <", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_lx_id <=", value, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdIn(List<Integer> values) {
            addCriterion("topic_lx_id in", values, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdNotIn(List<Integer> values) {
            addCriterion("topic_lx_id not in", values, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_lx_id between", value1, value2, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_lx_id not between", value1, value2, "topicLxId");
            return (Criteria) this;
        }

        public Criteria andTopicLevelIsNull() {
            addCriterion("topic_level is null");
            return (Criteria) this;
        }

        public Criteria andTopicLevelIsNotNull() {
            addCriterion("topic_level is not null");
            return (Criteria) this;
        }

        public Criteria andTopicLevelEqualTo(String value) {
            addCriterion("topic_level =", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelNotEqualTo(String value) {
            addCriterion("topic_level <>", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelGreaterThan(String value) {
            addCriterion("topic_level >", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelGreaterThanOrEqualTo(String value) {
            addCriterion("topic_level >=", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelLessThan(String value) {
            addCriterion("topic_level <", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelLessThanOrEqualTo(String value) {
            addCriterion("topic_level <=", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelLike(String value) {
            addCriterion("topic_level like", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelNotLike(String value) {
            addCriterion("topic_level not like", value, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelIn(List<String> values) {
            addCriterion("topic_level in", values, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelNotIn(List<String> values) {
            addCriterion("topic_level not in", values, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelBetween(String value1, String value2) {
            addCriterion("topic_level between", value1, value2, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicLevelNotBetween(String value1, String value2) {
            addCriterion("topic_level not between", value1, value2, "topicLevel");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountIsNull() {
            addCriterion("topic_zqcount is null");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountIsNotNull() {
            addCriterion("topic_zqcount is not null");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountEqualTo(Integer value) {
            addCriterion("topic_zqcount =", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountNotEqualTo(Integer value) {
            addCriterion("topic_zqcount <>", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountGreaterThan(Integer value) {
            addCriterion("topic_zqcount >", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_zqcount >=", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountLessThan(Integer value) {
            addCriterion("topic_zqcount <", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountLessThanOrEqualTo(Integer value) {
            addCriterion("topic_zqcount <=", value, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountIn(List<Integer> values) {
            addCriterion("topic_zqcount in", values, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountNotIn(List<Integer> values) {
            addCriterion("topic_zqcount not in", values, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountBetween(Integer value1, Integer value2) {
            addCriterion("topic_zqcount between", value1, value2, "topicZqcount");
            return (Criteria) this;
        }

        public Criteria andTopicZqcountNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_zqcount not between", value1, value2, "topicZqcount");
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

        public Criteria andTopicCountIsNull() {
            addCriterion("topic_count is null");
            return (Criteria) this;
        }

        public Criteria andTopicCountIsNotNull() {
            addCriterion("topic_count is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCountEqualTo(Integer value) {
            addCriterion("topic_count =", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotEqualTo(Integer value) {
            addCriterion("topic_count <>", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountGreaterThan(Integer value) {
            addCriterion("topic_count >", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_count >=", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountLessThan(Integer value) {
            addCriterion("topic_count <", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountLessThanOrEqualTo(Integer value) {
            addCriterion("topic_count <=", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountIn(List<Integer> values) {
            addCriterion("topic_count in", values, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotIn(List<Integer> values) {
            addCriterion("topic_count not in", values, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountBetween(Integer value1, Integer value2) {
            addCriterion("topic_count between", value1, value2, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_count not between", value1, value2, "topicCount");
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