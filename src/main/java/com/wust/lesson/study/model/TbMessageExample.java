package com.wust.lesson.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMessageExample() {
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

        public Criteria andTdAddressidIsNull() {
            addCriterion("td_addressId is null");
            return (Criteria) this;
        }

        public Criteria andTdAddressidIsNotNull() {
            addCriterion("td_addressId is not null");
            return (Criteria) this;
        }

        public Criteria andTdAddressidEqualTo(Integer value) {
            addCriterion("td_addressId =", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidNotEqualTo(Integer value) {
            addCriterion("td_addressId <>", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidGreaterThan(Integer value) {
            addCriterion("td_addressId >", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_addressId >=", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidLessThan(Integer value) {
            addCriterion("td_addressId <", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("td_addressId <=", value, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidIn(List<Integer> values) {
            addCriterion("td_addressId in", values, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidNotIn(List<Integer> values) {
            addCriterion("td_addressId not in", values, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidBetween(Integer value1, Integer value2) {
            addCriterion("td_addressId between", value1, value2, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("td_addressId not between", value1, value2, "tdAddressid");
            return (Criteria) this;
        }

        public Criteria andTdContentIsNull() {
            addCriterion("td_content is null");
            return (Criteria) this;
        }

        public Criteria andTdContentIsNotNull() {
            addCriterion("td_content is not null");
            return (Criteria) this;
        }

        public Criteria andTdContentEqualTo(String value) {
            addCriterion("td_content =", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentNotEqualTo(String value) {
            addCriterion("td_content <>", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentGreaterThan(String value) {
            addCriterion("td_content >", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentGreaterThanOrEqualTo(String value) {
            addCriterion("td_content >=", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentLessThan(String value) {
            addCriterion("td_content <", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentLessThanOrEqualTo(String value) {
            addCriterion("td_content <=", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentLike(String value) {
            addCriterion("td_content like", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentNotLike(String value) {
            addCriterion("td_content not like", value, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentIn(List<String> values) {
            addCriterion("td_content in", values, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentNotIn(List<String> values) {
            addCriterion("td_content not in", values, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentBetween(String value1, String value2) {
            addCriterion("td_content between", value1, value2, "tdContent");
            return (Criteria) this;
        }

        public Criteria andTdContentNotBetween(String value1, String value2) {
            addCriterion("td_content not between", value1, value2, "tdContent");
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

        public Criteria andTdSenderidIsNull() {
            addCriterion("td_senderId is null");
            return (Criteria) this;
        }

        public Criteria andTdSenderidIsNotNull() {
            addCriterion("td_senderId is not null");
            return (Criteria) this;
        }

        public Criteria andTdSenderidEqualTo(Integer value) {
            addCriterion("td_senderId =", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidNotEqualTo(Integer value) {
            addCriterion("td_senderId <>", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidGreaterThan(Integer value) {
            addCriterion("td_senderId >", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("td_senderId >=", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidLessThan(Integer value) {
            addCriterion("td_senderId <", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidLessThanOrEqualTo(Integer value) {
            addCriterion("td_senderId <=", value, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidIn(List<Integer> values) {
            addCriterion("td_senderId in", values, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidNotIn(List<Integer> values) {
            addCriterion("td_senderId not in", values, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidBetween(Integer value1, Integer value2) {
            addCriterion("td_senderId between", value1, value2, "tdSenderid");
            return (Criteria) this;
        }

        public Criteria andTdSenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("td_senderId not between", value1, value2, "tdSenderid");
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