package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttenceExample() {
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

        public Criteria andAttenceidIsNull() {
            addCriterion("attenceId is null");
            return (Criteria) this;
        }

        public Criteria andAttenceidIsNotNull() {
            addCriterion("attenceId is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceidEqualTo(Integer value) {
            addCriterion("attenceId =", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidNotEqualTo(Integer value) {
            addCriterion("attenceId <>", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidGreaterThan(Integer value) {
            addCriterion("attenceId >", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attenceId >=", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidLessThan(Integer value) {
            addCriterion("attenceId <", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidLessThanOrEqualTo(Integer value) {
            addCriterion("attenceId <=", value, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidIn(List<Integer> values) {
            addCriterion("attenceId in", values, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidNotIn(List<Integer> values) {
            addCriterion("attenceId not in", values, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidBetween(Integer value1, Integer value2) {
            addCriterion("attenceId between", value1, value2, "attenceid");
            return (Criteria) this;
        }

        public Criteria andAttenceidNotBetween(Integer value1, Integer value2) {
            addCriterion("attenceId not between", value1, value2, "attenceid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
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

        public Criteria andStudentgreadidIsNull() {
            addCriterion("studentGreadId is null");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidIsNotNull() {
            addCriterion("studentGreadId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidEqualTo(Integer value) {
            addCriterion("studentGreadId =", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidNotEqualTo(Integer value) {
            addCriterion("studentGreadId <>", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidGreaterThan(Integer value) {
            addCriterion("studentGreadId >", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentGreadId >=", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidLessThan(Integer value) {
            addCriterion("studentGreadId <", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidLessThanOrEqualTo(Integer value) {
            addCriterion("studentGreadId <=", value, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidIn(List<Integer> values) {
            addCriterion("studentGreadId in", values, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidNotIn(List<Integer> values) {
            addCriterion("studentGreadId not in", values, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidBetween(Integer value1, Integer value2) {
            addCriterion("studentGreadId between", value1, value2, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentgreadidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentGreadId not between", value1, value2, "studentgreadid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidIsNull() {
            addCriterion("studentClassId is null");
            return (Criteria) this;
        }

        public Criteria andStudentclassidIsNotNull() {
            addCriterion("studentClassId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentclassidEqualTo(Integer value) {
            addCriterion("studentClassId =", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidNotEqualTo(Integer value) {
            addCriterion("studentClassId <>", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidGreaterThan(Integer value) {
            addCriterion("studentClassId >", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentClassId >=", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidLessThan(Integer value) {
            addCriterion("studentClassId <", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidLessThanOrEqualTo(Integer value) {
            addCriterion("studentClassId <=", value, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidIn(List<Integer> values) {
            addCriterion("studentClassId in", values, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidNotIn(List<Integer> values) {
            addCriterion("studentClassId not in", values, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidBetween(Integer value1, Integer value2) {
            addCriterion("studentClassId between", value1, value2, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentClassId not between", value1, value2, "studentclassid");
            return (Criteria) this;
        }

        public Criteria andStudentteacherIsNull() {
            addCriterion("studentTeacher is null");
            return (Criteria) this;
        }

        public Criteria andStudentteacherIsNotNull() {
            addCriterion("studentTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andStudentteacherEqualTo(Integer value) {
            addCriterion("studentTeacher =", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherNotEqualTo(Integer value) {
            addCriterion("studentTeacher <>", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherGreaterThan(Integer value) {
            addCriterion("studentTeacher >", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentTeacher >=", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherLessThan(Integer value) {
            addCriterion("studentTeacher <", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherLessThanOrEqualTo(Integer value) {
            addCriterion("studentTeacher <=", value, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherIn(List<Integer> values) {
            addCriterion("studentTeacher in", values, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherNotIn(List<Integer> values) {
            addCriterion("studentTeacher not in", values, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherBetween(Integer value1, Integer value2) {
            addCriterion("studentTeacher between", value1, value2, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andStudentteacherNotBetween(Integer value1, Integer value2) {
            addCriterion("studentTeacher not between", value1, value2, "studentteacher");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andAttenceIsNull() {
            addCriterion("attence is null");
            return (Criteria) this;
        }

        public Criteria andAttenceIsNotNull() {
            addCriterion("attence is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceEqualTo(Integer value) {
            addCriterion("attence =", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotEqualTo(Integer value) {
            addCriterion("attence <>", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceGreaterThan(Integer value) {
            addCriterion("attence >", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("attence >=", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceLessThan(Integer value) {
            addCriterion("attence <", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceLessThanOrEqualTo(Integer value) {
            addCriterion("attence <=", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceIn(List<Integer> values) {
            addCriterion("attence in", values, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotIn(List<Integer> values) {
            addCriterion("attence not in", values, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceBetween(Integer value1, Integer value2) {
            addCriterion("attence between", value1, value2, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotBetween(Integer value1, Integer value2) {
            addCriterion("attence not between", value1, value2, "attence");
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