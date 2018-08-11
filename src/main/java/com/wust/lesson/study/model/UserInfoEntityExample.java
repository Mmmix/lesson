package com.wust.lesson.study.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoEntityExample() {
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

        public Criteria andTdNameIsNull() {
            addCriterion("td_name is null");
            return (Criteria) this;
        }

        public Criteria andTdNameIsNotNull() {
            addCriterion("td_name is not null");
            return (Criteria) this;
        }

        public Criteria andTdNameEqualTo(String value) {
            addCriterion("td_name =", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotEqualTo(String value) {
            addCriterion("td_name <>", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameGreaterThan(String value) {
            addCriterion("td_name >", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameGreaterThanOrEqualTo(String value) {
            addCriterion("td_name >=", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLessThan(String value) {
            addCriterion("td_name <", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLessThanOrEqualTo(String value) {
            addCriterion("td_name <=", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameLike(String value) {
            addCriterion("td_name like", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotLike(String value) {
            addCriterion("td_name not like", value, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameIn(List<String> values) {
            addCriterion("td_name in", values, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotIn(List<String> values) {
            addCriterion("td_name not in", values, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameBetween(String value1, String value2) {
            addCriterion("td_name between", value1, value2, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdNameNotBetween(String value1, String value2) {
            addCriterion("td_name not between", value1, value2, "tdName");
            return (Criteria) this;
        }

        public Criteria andTdSexIsNull() {
            addCriterion("td_sex is null");
            return (Criteria) this;
        }

        public Criteria andTdSexIsNotNull() {
            addCriterion("td_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTdSexEqualTo(String value) {
            addCriterion("td_sex =", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexNotEqualTo(String value) {
            addCriterion("td_sex <>", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexGreaterThan(String value) {
            addCriterion("td_sex >", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexGreaterThanOrEqualTo(String value) {
            addCriterion("td_sex >=", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexLessThan(String value) {
            addCriterion("td_sex <", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexLessThanOrEqualTo(String value) {
            addCriterion("td_sex <=", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexLike(String value) {
            addCriterion("td_sex like", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexNotLike(String value) {
            addCriterion("td_sex not like", value, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexIn(List<String> values) {
            addCriterion("td_sex in", values, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexNotIn(List<String> values) {
            addCriterion("td_sex not in", values, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexBetween(String value1, String value2) {
            addCriterion("td_sex between", value1, value2, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdSexNotBetween(String value1, String value2) {
            addCriterion("td_sex not between", value1, value2, "tdSex");
            return (Criteria) this;
        }

        public Criteria andTdAgeIsNull() {
            addCriterion("td_age is null");
            return (Criteria) this;
        }

        public Criteria andTdAgeIsNotNull() {
            addCriterion("td_age is not null");
            return (Criteria) this;
        }

        public Criteria andTdAgeEqualTo(String value) {
            addCriterion("td_age =", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeNotEqualTo(String value) {
            addCriterion("td_age <>", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeGreaterThan(String value) {
            addCriterion("td_age >", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeGreaterThanOrEqualTo(String value) {
            addCriterion("td_age >=", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeLessThan(String value) {
            addCriterion("td_age <", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeLessThanOrEqualTo(String value) {
            addCriterion("td_age <=", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeLike(String value) {
            addCriterion("td_age like", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeNotLike(String value) {
            addCriterion("td_age not like", value, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeIn(List<String> values) {
            addCriterion("td_age in", values, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeNotIn(List<String> values) {
            addCriterion("td_age not in", values, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeBetween(String value1, String value2) {
            addCriterion("td_age between", value1, value2, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdAgeNotBetween(String value1, String value2) {
            addCriterion("td_age not between", value1, value2, "tdAge");
            return (Criteria) this;
        }

        public Criteria andTdRoleIsNull() {
            addCriterion("td_role is null");
            return (Criteria) this;
        }

        public Criteria andTdRoleIsNotNull() {
            addCriterion("td_role is not null");
            return (Criteria) this;
        }

        public Criteria andTdRoleEqualTo(String value) {
            addCriterion("td_role =", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleNotEqualTo(String value) {
            addCriterion("td_role <>", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleGreaterThan(String value) {
            addCriterion("td_role >", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleGreaterThanOrEqualTo(String value) {
            addCriterion("td_role >=", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleLessThan(String value) {
            addCriterion("td_role <", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleLessThanOrEqualTo(String value) {
            addCriterion("td_role <=", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleLike(String value) {
            addCriterion("td_role like", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleNotLike(String value) {
            addCriterion("td_role not like", value, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleIn(List<String> values) {
            addCriterion("td_role in", values, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleNotIn(List<String> values) {
            addCriterion("td_role not in", values, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleBetween(String value1, String value2) {
            addCriterion("td_role between", value1, value2, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdRoleNotBetween(String value1, String value2) {
            addCriterion("td_role not between", value1, value2, "tdRole");
            return (Criteria) this;
        }

        public Criteria andTdAccountIsNull() {
            addCriterion("td_account is null");
            return (Criteria) this;
        }

        public Criteria andTdAccountIsNotNull() {
            addCriterion("td_account is not null");
            return (Criteria) this;
        }

        public Criteria andTdAccountEqualTo(String value) {
            addCriterion("td_account =", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountNotEqualTo(String value) {
            addCriterion("td_account <>", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountGreaterThan(String value) {
            addCriterion("td_account >", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountGreaterThanOrEqualTo(String value) {
            addCriterion("td_account >=", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountLessThan(String value) {
            addCriterion("td_account <", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountLessThanOrEqualTo(String value) {
            addCriterion("td_account <=", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountLike(String value) {
            addCriterion("td_account like", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountNotLike(String value) {
            addCriterion("td_account not like", value, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountIn(List<String> values) {
            addCriterion("td_account in", values, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountNotIn(List<String> values) {
            addCriterion("td_account not in", values, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountBetween(String value1, String value2) {
            addCriterion("td_account between", value1, value2, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdAccountNotBetween(String value1, String value2) {
            addCriterion("td_account not between", value1, value2, "tdAccount");
            return (Criteria) this;
        }

        public Criteria andTdEmailIsNull() {
            addCriterion("td_email is null");
            return (Criteria) this;
        }

        public Criteria andTdEmailIsNotNull() {
            addCriterion("td_email is not null");
            return (Criteria) this;
        }

        public Criteria andTdEmailEqualTo(String value) {
            addCriterion("td_email =", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailNotEqualTo(String value) {
            addCriterion("td_email <>", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailGreaterThan(String value) {
            addCriterion("td_email >", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("td_email >=", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailLessThan(String value) {
            addCriterion("td_email <", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailLessThanOrEqualTo(String value) {
            addCriterion("td_email <=", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailLike(String value) {
            addCriterion("td_email like", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailNotLike(String value) {
            addCriterion("td_email not like", value, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailIn(List<String> values) {
            addCriterion("td_email in", values, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailNotIn(List<String> values) {
            addCriterion("td_email not in", values, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailBetween(String value1, String value2) {
            addCriterion("td_email between", value1, value2, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdEmailNotBetween(String value1, String value2) {
            addCriterion("td_email not between", value1, value2, "tdEmail");
            return (Criteria) this;
        }

        public Criteria andTdImgIsNull() {
            addCriterion("td_img is null");
            return (Criteria) this;
        }

        public Criteria andTdImgIsNotNull() {
            addCriterion("td_img is not null");
            return (Criteria) this;
        }

        public Criteria andTdImgEqualTo(String value) {
            addCriterion("td_img =", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgNotEqualTo(String value) {
            addCriterion("td_img <>", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgGreaterThan(String value) {
            addCriterion("td_img >", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgGreaterThanOrEqualTo(String value) {
            addCriterion("td_img >=", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgLessThan(String value) {
            addCriterion("td_img <", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgLessThanOrEqualTo(String value) {
            addCriterion("td_img <=", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgLike(String value) {
            addCriterion("td_img like", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgNotLike(String value) {
            addCriterion("td_img not like", value, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgIn(List<String> values) {
            addCriterion("td_img in", values, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgNotIn(List<String> values) {
            addCriterion("td_img not in", values, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgBetween(String value1, String value2) {
            addCriterion("td_img between", value1, value2, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdImgNotBetween(String value1, String value2) {
            addCriterion("td_img not between", value1, value2, "tdImg");
            return (Criteria) this;
        }

        public Criteria andTdPasswordIsNull() {
            addCriterion("td_password is null");
            return (Criteria) this;
        }

        public Criteria andTdPasswordIsNotNull() {
            addCriterion("td_password is not null");
            return (Criteria) this;
        }

        public Criteria andTdPasswordEqualTo(String value) {
            addCriterion("td_password =", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordNotEqualTo(String value) {
            addCriterion("td_password <>", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordGreaterThan(String value) {
            addCriterion("td_password >", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("td_password >=", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordLessThan(String value) {
            addCriterion("td_password <", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordLessThanOrEqualTo(String value) {
            addCriterion("td_password <=", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordLike(String value) {
            addCriterion("td_password like", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordNotLike(String value) {
            addCriterion("td_password not like", value, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordIn(List<String> values) {
            addCriterion("td_password in", values, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordNotIn(List<String> values) {
            addCriterion("td_password not in", values, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordBetween(String value1, String value2) {
            addCriterion("td_password between", value1, value2, "tdPassword");
            return (Criteria) this;
        }

        public Criteria andTdPasswordNotBetween(String value1, String value2) {
            addCriterion("td_password not between", value1, value2, "tdPassword");
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