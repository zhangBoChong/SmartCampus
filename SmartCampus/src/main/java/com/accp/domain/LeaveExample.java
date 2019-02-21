package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        public Criteria andLeaveidIsNull() {
            addCriterion("leaveId is null");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNotNull() {
            addCriterion("leaveId is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveidEqualTo(Integer value) {
            addCriterion("leaveId =", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotEqualTo(Integer value) {
            addCriterion("leaveId <>", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThan(Integer value) {
            addCriterion("leaveId >", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveId >=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThan(Integer value) {
            addCriterion("leaveId <", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThanOrEqualTo(Integer value) {
            addCriterion("leaveId <=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIn(List<Integer> values) {
            addCriterion("leaveId in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotIn(List<Integer> values) {
            addCriterion("leaveId not in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidBetween(Integer value1, Integer value2) {
            addCriterion("leaveId between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveId not between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentgreadIsNull() {
            addCriterion("studentGread is null");
            return (Criteria) this;
        }

        public Criteria andStudentgreadIsNotNull() {
            addCriterion("studentGread is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgreadEqualTo(Integer value) {
            addCriterion("studentGread =", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadNotEqualTo(Integer value) {
            addCriterion("studentGread <>", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadGreaterThan(Integer value) {
            addCriterion("studentGread >", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentGread >=", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadLessThan(Integer value) {
            addCriterion("studentGread <", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadLessThanOrEqualTo(Integer value) {
            addCriterion("studentGread <=", value, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadIn(List<Integer> values) {
            addCriterion("studentGread in", values, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadNotIn(List<Integer> values) {
            addCriterion("studentGread not in", values, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadBetween(Integer value1, Integer value2) {
            addCriterion("studentGread between", value1, value2, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentgreadNotBetween(Integer value1, Integer value2) {
            addCriterion("studentGread not between", value1, value2, "studentgread");
            return (Criteria) this;
        }

        public Criteria andStudentclassIsNull() {
            addCriterion("studentClass is null");
            return (Criteria) this;
        }

        public Criteria andStudentclassIsNotNull() {
            addCriterion("studentClass is not null");
            return (Criteria) this;
        }

        public Criteria andStudentclassEqualTo(Integer value) {
            addCriterion("studentClass =", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotEqualTo(Integer value) {
            addCriterion("studentClass <>", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThan(Integer value) {
            addCriterion("studentClass >", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentClass >=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThan(Integer value) {
            addCriterion("studentClass <", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassLessThanOrEqualTo(Integer value) {
            addCriterion("studentClass <=", value, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassIn(List<Integer> values) {
            addCriterion("studentClass in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotIn(List<Integer> values) {
            addCriterion("studentClass not in", values, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassBetween(Integer value1, Integer value2) {
            addCriterion("studentClass between", value1, value2, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStudentclassNotBetween(Integer value1, Integer value2) {
            addCriterion("studentClass not between", value1, value2, "studentclass");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("starTime is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("starTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(Date value) {
            addCriterion("starTime =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(Date value) {
            addCriterion("starTime <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(Date value) {
            addCriterion("starTime >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starTime >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(Date value) {
            addCriterion("starTime <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(Date value) {
            addCriterion("starTime <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<Date> values) {
            addCriterion("starTime in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<Date> values) {
            addCriterion("starTime not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(Date value1, Date value2) {
            addCriterion("starTime between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(Date value1, Date value2) {
            addCriterion("starTime not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMainIsNull() {
            addCriterion("main is null");
            return (Criteria) this;
        }

        public Criteria andMainIsNotNull() {
            addCriterion("main is not null");
            return (Criteria) this;
        }

        public Criteria andMainEqualTo(String value) {
            addCriterion("main =", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotEqualTo(String value) {
            addCriterion("main <>", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThan(String value) {
            addCriterion("main >", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThanOrEqualTo(String value) {
            addCriterion("main >=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThan(String value) {
            addCriterion("main <", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThanOrEqualTo(String value) {
            addCriterion("main <=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLike(String value) {
            addCriterion("main like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotLike(String value) {
            addCriterion("main not like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainIn(List<String> values) {
            addCriterion("main in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotIn(List<String> values) {
            addCriterion("main not in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainBetween(String value1, String value2) {
            addCriterion("main between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotBetween(String value1, String value2) {
            addCriterion("main not between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(Integer value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(Integer value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(Integer value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(Integer value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(Integer value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<Integer> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<Integer> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(Integer value1, Integer value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
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