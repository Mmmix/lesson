package com.wust.lesson.study.model;

import java.util.ArrayList;
import java.util.List;

public class FriendsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendsExample() {
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

        public Criteria andTdIdIsNull() {
            addCriterion("td_id is null");
            return (Criteria) this;
        }

        public Criteria andTdIdIsNotNull() {
            addCriterion("td_id is not null");
            return (Criteria) this;
        }

        public Criteria andTdIdEqualTo(Integer value) {
            addCriterion("td_id =", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotEqualTo(Integer value) {
            addCriterion("td_id <>", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThan(Integer value) {
            addCriterion("td_id >", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_id >=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThan(Integer value) {
            addCriterion("td_id <", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdLessThanOrEqualTo(Integer value) {
            addCriterion("td_id <=", value, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdIn(List<Integer> values) {
            addCriterion("td_id in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotIn(List<Integer> values) {
            addCriterion("td_id not in", values, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdBetween(Integer value1, Integer value2) {
            addCriterion("td_id between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andTdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("td_id not between", value1, value2, "tdId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andTdFriendidIsNull() {
            addCriterion("td_friendId is null");
            return (Criteria) this;
        }

        public Criteria andTdFriendidIsNotNull() {
            addCriterion("td_friendId is not null");
            return (Criteria) this;
        }

        public Criteria andTdFriendidEqualTo(Integer value) {
            addCriterion("td_friendId =", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidNotEqualTo(Integer value) {
            addCriterion("td_friendId <>", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidGreaterThan(Integer value) {
            addCriterion("td_friendId >", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_friendId >=", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidLessThan(Integer value) {
            addCriterion("td_friendId <", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidLessThanOrEqualTo(Integer value) {
            addCriterion("td_friendId <=", value, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidIn(List<Integer> values) {
            addCriterion("td_friendId in", values, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidNotIn(List<Integer> values) {
            addCriterion("td_friendId not in", values, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidBetween(Integer value1, Integer value2) {
            addCriterion("td_friendId between", value1, value2, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andTdFriendidNotBetween(Integer value1, Integer value2) {
            addCriterion("td_friendId not between", value1, value2, "tdFriendid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTdStatusIsNull() {
            addCriterion("td_status is null");
            return (Criteria) this;
        }

        public Criteria andTdStatusIsNotNull() {
            addCriterion("td_status is not null");
            return (Criteria) this;
        }

        public Criteria andTdStatusEqualTo(Integer value) {
            addCriterion("td_status =", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusNotEqualTo(Integer value) {
            addCriterion("td_status <>", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusGreaterThan(Integer value) {
            addCriterion("td_status >", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_status >=", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusLessThan(Integer value) {
            addCriterion("td_status <", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("td_status <=", value, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusIn(List<Integer> values) {
            addCriterion("td_status in", values, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusNotIn(List<Integer> values) {
            addCriterion("td_status not in", values, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusBetween(Integer value1, Integer value2) {
            addCriterion("td_status between", value1, value2, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("td_status not between", value1, value2, "tdStatus");
            return (Criteria) this;
        }

        public Criteria andTdUseridIsNull() {
            addCriterion("td_userId is null");
            return (Criteria) this;
        }

        public Criteria andTdUseridIsNotNull() {
            addCriterion("td_userId is not null");
            return (Criteria) this;
        }

        public Criteria andTdUseridEqualTo(Integer value) {
            addCriterion("td_userId =", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridNotEqualTo(Integer value) {
            addCriterion("td_userId <>", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridGreaterThan(Integer value) {
            addCriterion("td_userId >", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_userId >=", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridLessThan(Integer value) {
            addCriterion("td_userId <", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridLessThanOrEqualTo(Integer value) {
            addCriterion("td_userId <=", value, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridIn(List<Integer> values) {
            addCriterion("td_userId in", values, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridNotIn(List<Integer> values) {
            addCriterion("td_userId not in", values, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridBetween(Integer value1, Integer value2) {
            addCriterion("td_userId between", value1, value2, "tdUserid");
            return (Criteria) this;
        }

        public Criteria andTdUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("td_userId not between", value1, value2, "tdUserid");
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