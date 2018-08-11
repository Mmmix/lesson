package com.wust.lesson.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompositionExample() {
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

        public Criteria andTbIdIsNull() {
            addCriterion("tb_id is null");
            return (Criteria) this;
        }

        public Criteria andTbIdIsNotNull() {
            addCriterion("tb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbIdEqualTo(Integer value) {
            addCriterion("tb_id =", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotEqualTo(Integer value) {
            addCriterion("tb_id <>", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdGreaterThan(Integer value) {
            addCriterion("tb_id >", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_id >=", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdLessThan(Integer value) {
            addCriterion("tb_id <", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_id <=", value, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdIn(List<Integer> values) {
            addCriterion("tb_id in", values, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotIn(List<Integer> values) {
            addCriterion("tb_id not in", values, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_id between", value1, value2, "tbId");
            return (Criteria) this;
        }

        public Criteria andTbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_id not between", value1, value2, "tbId");
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

        public Criteria andTbFileurlIsNull() {
            addCriterion("tb_fileUrl is null");
            return (Criteria) this;
        }

        public Criteria andTbFileurlIsNotNull() {
            addCriterion("tb_fileUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTbFileurlEqualTo(String value) {
            addCriterion("tb_fileUrl =", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlNotEqualTo(String value) {
            addCriterion("tb_fileUrl <>", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlGreaterThan(String value) {
            addCriterion("tb_fileUrl >", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlGreaterThanOrEqualTo(String value) {
            addCriterion("tb_fileUrl >=", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlLessThan(String value) {
            addCriterion("tb_fileUrl <", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlLessThanOrEqualTo(String value) {
            addCriterion("tb_fileUrl <=", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlLike(String value) {
            addCriterion("tb_fileUrl like", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlNotLike(String value) {
            addCriterion("tb_fileUrl not like", value, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlIn(List<String> values) {
            addCriterion("tb_fileUrl in", values, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlNotIn(List<String> values) {
            addCriterion("tb_fileUrl not in", values, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlBetween(String value1, String value2) {
            addCriterion("tb_fileUrl between", value1, value2, "tbFileurl");
            return (Criteria) this;
        }

        public Criteria andTbFileurlNotBetween(String value1, String value2) {
            addCriterion("tb_fileUrl not between", value1, value2, "tbFileurl");
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

        public Criteria andTbSummaryIsNull() {
            addCriterion("tb_summary is null");
            return (Criteria) this;
        }

        public Criteria andTbSummaryIsNotNull() {
            addCriterion("tb_summary is not null");
            return (Criteria) this;
        }

        public Criteria andTbSummaryEqualTo(String value) {
            addCriterion("tb_summary =", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryNotEqualTo(String value) {
            addCriterion("tb_summary <>", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryGreaterThan(String value) {
            addCriterion("tb_summary >", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("tb_summary >=", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryLessThan(String value) {
            addCriterion("tb_summary <", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryLessThanOrEqualTo(String value) {
            addCriterion("tb_summary <=", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryLike(String value) {
            addCriterion("tb_summary like", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryNotLike(String value) {
            addCriterion("tb_summary not like", value, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryIn(List<String> values) {
            addCriterion("tb_summary in", values, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryNotIn(List<String> values) {
            addCriterion("tb_summary not in", values, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryBetween(String value1, String value2) {
            addCriterion("tb_summary between", value1, value2, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbSummaryNotBetween(String value1, String value2) {
            addCriterion("tb_summary not between", value1, value2, "tbSummary");
            return (Criteria) this;
        }

        public Criteria andTbTimeIsNull() {
            addCriterion("tb_time is null");
            return (Criteria) this;
        }

        public Criteria andTbTimeIsNotNull() {
            addCriterion("tb_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbTimeEqualTo(Date value) {
            addCriterion("tb_time =", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotEqualTo(Date value) {
            addCriterion("tb_time <>", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeGreaterThan(Date value) {
            addCriterion("tb_time >", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tb_time >=", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeLessThan(Date value) {
            addCriterion("tb_time <", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeLessThanOrEqualTo(Date value) {
            addCriterion("tb_time <=", value, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeIn(List<Date> values) {
            addCriterion("tb_time in", values, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotIn(List<Date> values) {
            addCriterion("tb_time not in", values, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeBetween(Date value1, Date value2) {
            addCriterion("tb_time between", value1, value2, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTimeNotBetween(Date value1, Date value2) {
            addCriterion("tb_time not between", value1, value2, "tbTime");
            return (Criteria) this;
        }

        public Criteria andTbTitleIsNull() {
            addCriterion("tb_title is null");
            return (Criteria) this;
        }

        public Criteria andTbTitleIsNotNull() {
            addCriterion("tb_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbTitleEqualTo(String value) {
            addCriterion("tb_title =", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleNotEqualTo(String value) {
            addCriterion("tb_title <>", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleGreaterThan(String value) {
            addCriterion("tb_title >", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tb_title >=", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleLessThan(String value) {
            addCriterion("tb_title <", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleLessThanOrEqualTo(String value) {
            addCriterion("tb_title <=", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleLike(String value) {
            addCriterion("tb_title like", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleNotLike(String value) {
            addCriterion("tb_title not like", value, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleIn(List<String> values) {
            addCriterion("tb_title in", values, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleNotIn(List<String> values) {
            addCriterion("tb_title not in", values, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleBetween(String value1, String value2) {
            addCriterion("tb_title between", value1, value2, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbTitleNotBetween(String value1, String value2) {
            addCriterion("tb_title not between", value1, value2, "tbTitle");
            return (Criteria) this;
        }

        public Criteria andTbUseridIsNull() {
            addCriterion("tb_userId is null");
            return (Criteria) this;
        }

        public Criteria andTbUseridIsNotNull() {
            addCriterion("tb_userId is not null");
            return (Criteria) this;
        }

        public Criteria andTbUseridEqualTo(Integer value) {
            addCriterion("tb_userId =", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridNotEqualTo(Integer value) {
            addCriterion("tb_userId <>", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridGreaterThan(Integer value) {
            addCriterion("tb_userId >", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_userId >=", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridLessThan(Integer value) {
            addCriterion("tb_userId <", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridLessThanOrEqualTo(Integer value) {
            addCriterion("tb_userId <=", value, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridIn(List<Integer> values) {
            addCriterion("tb_userId in", values, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridNotIn(List<Integer> values) {
            addCriterion("tb_userId not in", values, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridBetween(Integer value1, Integer value2) {
            addCriterion("tb_userId between", value1, value2, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_userId not between", value1, value2, "tbUserid");
            return (Criteria) this;
        }

        public Criteria andTbReadIsNull() {
            addCriterion("tb_read is null");
            return (Criteria) this;
        }

        public Criteria andTbReadIsNotNull() {
            addCriterion("tb_read is not null");
            return (Criteria) this;
        }

        public Criteria andTbReadEqualTo(String value) {
            addCriterion("tb_read =", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadNotEqualTo(String value) {
            addCriterion("tb_read <>", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadGreaterThan(String value) {
            addCriterion("tb_read >", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadGreaterThanOrEqualTo(String value) {
            addCriterion("tb_read >=", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadLessThan(String value) {
            addCriterion("tb_read <", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadLessThanOrEqualTo(String value) {
            addCriterion("tb_read <=", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadLike(String value) {
            addCriterion("tb_read like", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadNotLike(String value) {
            addCriterion("tb_read not like", value, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadIn(List<String> values) {
            addCriterion("tb_read in", values, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadNotIn(List<String> values) {
            addCriterion("tb_read not in", values, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadBetween(String value1, String value2) {
            addCriterion("tb_read between", value1, value2, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbReadNotBetween(String value1, String value2) {
            addCriterion("tb_read not between", value1, value2, "tbRead");
            return (Criteria) this;
        }

        public Criteria andTbCommentIsNull() {
            addCriterion("tb_comment is null");
            return (Criteria) this;
        }

        public Criteria andTbCommentIsNotNull() {
            addCriterion("tb_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTbCommentEqualTo(String value) {
            addCriterion("tb_comment =", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentNotEqualTo(String value) {
            addCriterion("tb_comment <>", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentGreaterThan(String value) {
            addCriterion("tb_comment >", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentGreaterThanOrEqualTo(String value) {
            addCriterion("tb_comment >=", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentLessThan(String value) {
            addCriterion("tb_comment <", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentLessThanOrEqualTo(String value) {
            addCriterion("tb_comment <=", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentLike(String value) {
            addCriterion("tb_comment like", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentNotLike(String value) {
            addCriterion("tb_comment not like", value, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentIn(List<String> values) {
            addCriterion("tb_comment in", values, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentNotIn(List<String> values) {
            addCriterion("tb_comment not in", values, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentBetween(String value1, String value2) {
            addCriterion("tb_comment between", value1, value2, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCommentNotBetween(String value1, String value2) {
            addCriterion("tb_comment not between", value1, value2, "tbComment");
            return (Criteria) this;
        }

        public Criteria andTbCollectionIsNull() {
            addCriterion("tb_collection is null");
            return (Criteria) this;
        }

        public Criteria andTbCollectionIsNotNull() {
            addCriterion("tb_collection is not null");
            return (Criteria) this;
        }

        public Criteria andTbCollectionEqualTo(String value) {
            addCriterion("tb_collection =", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionNotEqualTo(String value) {
            addCriterion("tb_collection <>", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionGreaterThan(String value) {
            addCriterion("tb_collection >", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("tb_collection >=", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionLessThan(String value) {
            addCriterion("tb_collection <", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionLessThanOrEqualTo(String value) {
            addCriterion("tb_collection <=", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionLike(String value) {
            addCriterion("tb_collection like", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionNotLike(String value) {
            addCriterion("tb_collection not like", value, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionIn(List<String> values) {
            addCriterion("tb_collection in", values, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionNotIn(List<String> values) {
            addCriterion("tb_collection not in", values, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionBetween(String value1, String value2) {
            addCriterion("tb_collection between", value1, value2, "tbCollection");
            return (Criteria) this;
        }

        public Criteria andTbCollectionNotBetween(String value1, String value2) {
            addCriterion("tb_collection not between", value1, value2, "tbCollection");
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