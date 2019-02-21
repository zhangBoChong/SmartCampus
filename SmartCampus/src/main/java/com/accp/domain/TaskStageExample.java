package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskStageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskStageExample() {
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

        public Criteria andStageidIsNull() {
            addCriterion("stageId is null");
            return (Criteria) this;
        }

        public Criteria andStageidIsNotNull() {
            addCriterion("stageId is not null");
            return (Criteria) this;
        }

        public Criteria andStageidEqualTo(Integer value) {
            addCriterion("stageId =", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidNotEqualTo(Integer value) {
            addCriterion("stageId <>", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidGreaterThan(Integer value) {
            addCriterion("stageId >", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stageId >=", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidLessThan(Integer value) {
            addCriterion("stageId <", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidLessThanOrEqualTo(Integer value) {
            addCriterion("stageId <=", value, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidIn(List<Integer> values) {
            addCriterion("stageId in", values, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidNotIn(List<Integer> values) {
            addCriterion("stageId not in", values, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidBetween(Integer value1, Integer value2) {
            addCriterion("stageId between", value1, value2, "stageid");
            return (Criteria) this;
        }

        public Criteria andStageidNotBetween(Integer value1, Integer value2) {
            addCriterion("stageId not between", value1, value2, "stageid");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeIsNull() {
            addCriterion("stageStartTime is null");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeIsNotNull() {
            addCriterion("stageStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeEqualTo(Date value) {
            addCriterion("stageStartTime =", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeNotEqualTo(Date value) {
            addCriterion("stageStartTime <>", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeGreaterThan(Date value) {
            addCriterion("stageStartTime >", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stageStartTime >=", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeLessThan(Date value) {
            addCriterion("stageStartTime <", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeLessThanOrEqualTo(Date value) {
            addCriterion("stageStartTime <=", value, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeIn(List<Date> values) {
            addCriterion("stageStartTime in", values, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeNotIn(List<Date> values) {
            addCriterion("stageStartTime not in", values, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeBetween(Date value1, Date value2) {
            addCriterion("stageStartTime between", value1, value2, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStagestarttimeNotBetween(Date value1, Date value2) {
            addCriterion("stageStartTime not between", value1, value2, "stagestarttime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeIsNull() {
            addCriterion("stageEndTime is null");
            return (Criteria) this;
        }

        public Criteria andStageendtimeIsNotNull() {
            addCriterion("stageEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andStageendtimeEqualTo(Date value) {
            addCriterion("stageEndTime =", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeNotEqualTo(Date value) {
            addCriterion("stageEndTime <>", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeGreaterThan(Date value) {
            addCriterion("stageEndTime >", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stageEndTime >=", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeLessThan(Date value) {
            addCriterion("stageEndTime <", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeLessThanOrEqualTo(Date value) {
            addCriterion("stageEndTime <=", value, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeIn(List<Date> values) {
            addCriterion("stageEndTime in", values, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeNotIn(List<Date> values) {
            addCriterion("stageEndTime not in", values, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeBetween(Date value1, Date value2) {
            addCriterion("stageEndTime between", value1, value2, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageendtimeNotBetween(Date value1, Date value2) {
            addCriterion("stageEndTime not between", value1, value2, "stageendtime");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesIsNull() {
            addCriterion("stageAccessories is null");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesIsNotNull() {
            addCriterion("stageAccessories is not null");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesEqualTo(String value) {
            addCriterion("stageAccessories =", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesNotEqualTo(String value) {
            addCriterion("stageAccessories <>", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesGreaterThan(String value) {
            addCriterion("stageAccessories >", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesGreaterThanOrEqualTo(String value) {
            addCriterion("stageAccessories >=", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesLessThan(String value) {
            addCriterion("stageAccessories <", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesLessThanOrEqualTo(String value) {
            addCriterion("stageAccessories <=", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesLike(String value) {
            addCriterion("stageAccessories like", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesNotLike(String value) {
            addCriterion("stageAccessories not like", value, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesIn(List<String> values) {
            addCriterion("stageAccessories in", values, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesNotIn(List<String> values) {
            addCriterion("stageAccessories not in", values, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesBetween(String value1, String value2) {
            addCriterion("stageAccessories between", value1, value2, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andStageaccessoriesNotBetween(String value1, String value2) {
            addCriterion("stageAccessories not between", value1, value2, "stageaccessories");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("delete is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("delete is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("delete =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("delete <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("delete >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("delete <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("delete <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("delete in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("delete not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("delete between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("delete not between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andK1IsNull() {
            addCriterion("K1 is null");
            return (Criteria) this;
        }

        public Criteria andK1IsNotNull() {
            addCriterion("K1 is not null");
            return (Criteria) this;
        }

        public Criteria andK1EqualTo(String value) {
            addCriterion("K1 =", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotEqualTo(String value) {
            addCriterion("K1 <>", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1GreaterThan(String value) {
            addCriterion("K1 >", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1GreaterThanOrEqualTo(String value) {
            addCriterion("K1 >=", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1LessThan(String value) {
            addCriterion("K1 <", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1LessThanOrEqualTo(String value) {
            addCriterion("K1 <=", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1Like(String value) {
            addCriterion("K1 like", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotLike(String value) {
            addCriterion("K1 not like", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1In(List<String> values) {
            addCriterion("K1 in", values, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotIn(List<String> values) {
            addCriterion("K1 not in", values, "k1");
            return (Criteria) this;
        }

        public Criteria andK1Between(String value1, String value2) {
            addCriterion("K1 between", value1, value2, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotBetween(String value1, String value2) {
            addCriterion("K1 not between", value1, value2, "k1");
            return (Criteria) this;
        }

        public Criteria andK2IsNull() {
            addCriterion("K2 is null");
            return (Criteria) this;
        }

        public Criteria andK2IsNotNull() {
            addCriterion("K2 is not null");
            return (Criteria) this;
        }

        public Criteria andK2EqualTo(String value) {
            addCriterion("K2 =", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotEqualTo(String value) {
            addCriterion("K2 <>", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2GreaterThan(String value) {
            addCriterion("K2 >", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2GreaterThanOrEqualTo(String value) {
            addCriterion("K2 >=", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2LessThan(String value) {
            addCriterion("K2 <", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2LessThanOrEqualTo(String value) {
            addCriterion("K2 <=", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2Like(String value) {
            addCriterion("K2 like", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotLike(String value) {
            addCriterion("K2 not like", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2In(List<String> values) {
            addCriterion("K2 in", values, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotIn(List<String> values) {
            addCriterion("K2 not in", values, "k2");
            return (Criteria) this;
        }

        public Criteria andK2Between(String value1, String value2) {
            addCriterion("K2 between", value1, value2, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotBetween(String value1, String value2) {
            addCriterion("K2 not between", value1, value2, "k2");
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