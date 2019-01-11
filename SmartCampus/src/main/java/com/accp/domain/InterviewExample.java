package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andInterviewidIsNull() {
            addCriterion("interviewId is null");
            return (Criteria) this;
        }

        public Criteria andInterviewidIsNotNull() {
            addCriterion("interviewId is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewidEqualTo(Integer value) {
            addCriterion("interviewId =", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidNotEqualTo(Integer value) {
            addCriterion("interviewId <>", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidGreaterThan(Integer value) {
            addCriterion("interviewId >", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("interviewId >=", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidLessThan(Integer value) {
            addCriterion("interviewId <", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidLessThanOrEqualTo(Integer value) {
            addCriterion("interviewId <=", value, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidIn(List<Integer> values) {
            addCriterion("interviewId in", values, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidNotIn(List<Integer> values) {
            addCriterion("interviewId not in", values, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidBetween(Integer value1, Integer value2) {
            addCriterion("interviewId between", value1, value2, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("interviewId not between", value1, value2, "interviewid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridIsNull() {
            addCriterion("interviewteacherId is null");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridIsNotNull() {
            addCriterion("interviewteacherId is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridEqualTo(Integer value) {
            addCriterion("interviewteacherId =", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridNotEqualTo(Integer value) {
            addCriterion("interviewteacherId <>", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridGreaterThan(Integer value) {
            addCriterion("interviewteacherId >", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("interviewteacherId >=", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridLessThan(Integer value) {
            addCriterion("interviewteacherId <", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("interviewteacherId <=", value, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridIn(List<Integer> values) {
            addCriterion("interviewteacherId in", values, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridNotIn(List<Integer> values) {
            addCriterion("interviewteacherId not in", values, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridBetween(Integer value1, Integer value2) {
            addCriterion("interviewteacherId between", value1, value2, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("interviewteacherId not between", value1, value2, "interviewteacherid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidIsNull() {
            addCriterion("interviewStudentId is null");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidIsNotNull() {
            addCriterion("interviewStudentId is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidEqualTo(Integer value) {
            addCriterion("interviewStudentId =", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidNotEqualTo(Integer value) {
            addCriterion("interviewStudentId <>", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidGreaterThan(Integer value) {
            addCriterion("interviewStudentId >", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("interviewStudentId >=", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidLessThan(Integer value) {
            addCriterion("interviewStudentId <", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidLessThanOrEqualTo(Integer value) {
            addCriterion("interviewStudentId <=", value, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidIn(List<Integer> values) {
            addCriterion("interviewStudentId in", values, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidNotIn(List<Integer> values) {
            addCriterion("interviewStudentId not in", values, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidBetween(Integer value1, Integer value2) {
            addCriterion("interviewStudentId between", value1, value2, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewstudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("interviewStudentId not between", value1, value2, "interviewstudentid");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemIsNull() {
            addCriterion("interviewProblem is null");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemIsNotNull() {
            addCriterion("interviewProblem is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemEqualTo(String value) {
            addCriterion("interviewProblem =", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemNotEqualTo(String value) {
            addCriterion("interviewProblem <>", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemGreaterThan(String value) {
            addCriterion("interviewProblem >", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemGreaterThanOrEqualTo(String value) {
            addCriterion("interviewProblem >=", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemLessThan(String value) {
            addCriterion("interviewProblem <", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemLessThanOrEqualTo(String value) {
            addCriterion("interviewProblem <=", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemLike(String value) {
            addCriterion("interviewProblem like", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemNotLike(String value) {
            addCriterion("interviewProblem not like", value, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemIn(List<String> values) {
            addCriterion("interviewProblem in", values, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemNotIn(List<String> values) {
            addCriterion("interviewProblem not in", values, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemBetween(String value1, String value2) {
            addCriterion("interviewProblem between", value1, value2, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewproblemNotBetween(String value1, String value2) {
            addCriterion("interviewProblem not between", value1, value2, "interviewproblem");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackIsNull() {
            addCriterion("interviewFeedback is null");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackIsNotNull() {
            addCriterion("interviewFeedback is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackEqualTo(String value) {
            addCriterion("interviewFeedback =", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackNotEqualTo(String value) {
            addCriterion("interviewFeedback <>", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackGreaterThan(String value) {
            addCriterion("interviewFeedback >", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("interviewFeedback >=", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackLessThan(String value) {
            addCriterion("interviewFeedback <", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackLessThanOrEqualTo(String value) {
            addCriterion("interviewFeedback <=", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackLike(String value) {
            addCriterion("interviewFeedback like", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackNotLike(String value) {
            addCriterion("interviewFeedback not like", value, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackIn(List<String> values) {
            addCriterion("interviewFeedback in", values, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackNotIn(List<String> values) {
            addCriterion("interviewFeedback not in", values, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackBetween(String value1, String value2) {
            addCriterion("interviewFeedback between", value1, value2, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewfeedbackNotBetween(String value1, String value2) {
            addCriterion("interviewFeedback not between", value1, value2, "interviewfeedback");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNull() {
            addCriterion("interviewTime is null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNotNull() {
            addCriterion("interviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeEqualTo(Date value) {
            addCriterion("interviewTime =", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotEqualTo(Date value) {
            addCriterion("interviewTime <>", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThan(Date value) {
            addCriterion("interviewTime >", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interviewTime >=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThan(Date value) {
            addCriterion("interviewTime <", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("interviewTime <=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIn(List<Date> values) {
            addCriterion("interviewTime in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotIn(List<Date> values) {
            addCriterion("interviewTime not in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeBetween(Date value1, Date value2) {
            addCriterion("interviewTime between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("interviewTime not between", value1, value2, "interviewtime");
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