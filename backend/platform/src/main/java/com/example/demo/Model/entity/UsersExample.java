package com.example.demo.Model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(Integer value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(Integer value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(Integer value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(Integer value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<Integer> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<Integer> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(Integer value1, Integer value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andBanstateIsNull() {
            addCriterion("banState is null");
            return (Criteria) this;
        }

        public Criteria andBanstateIsNotNull() {
            addCriterion("banState is not null");
            return (Criteria) this;
        }

        public Criteria andBanstateEqualTo(Boolean value) {
            addCriterion("banState =", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateNotEqualTo(Boolean value) {
            addCriterion("banState <>", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateGreaterThan(Boolean value) {
            addCriterion("banState >", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banState >=", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateLessThan(Boolean value) {
            addCriterion("banState <", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateLessThanOrEqualTo(Boolean value) {
            addCriterion("banState <=", value, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateIn(List<Boolean> values) {
            addCriterion("banState in", values, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateNotIn(List<Boolean> values) {
            addCriterion("banState not in", values, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateBetween(Boolean value1, Boolean value2) {
            addCriterion("banState between", value1, value2, "banstate");
            return (Criteria) this;
        }

        public Criteria andBanstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banState not between", value1, value2, "banstate");
            return (Criteria) this;
        }

        public Criteria andBantypeIsNull() {
            addCriterion("banType is null");
            return (Criteria) this;
        }

        public Criteria andBantypeIsNotNull() {
            addCriterion("banType is not null");
            return (Criteria) this;
        }

        public Criteria andBantypeEqualTo(String value) {
            addCriterion("banType =", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotEqualTo(String value) {
            addCriterion("banType <>", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeGreaterThan(String value) {
            addCriterion("banType >", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeGreaterThanOrEqualTo(String value) {
            addCriterion("banType >=", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLessThan(String value) {
            addCriterion("banType <", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLessThanOrEqualTo(String value) {
            addCriterion("banType <=", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLike(String value) {
            addCriterion("banType like", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotLike(String value) {
            addCriterion("banType not like", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeIn(List<String> values) {
            addCriterion("banType in", values, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotIn(List<String> values) {
            addCriterion("banType not in", values, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeBetween(String value1, String value2) {
            addCriterion("banType between", value1, value2, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotBetween(String value1, String value2) {
            addCriterion("banType not between", value1, value2, "bantype");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNull() {
            addCriterion("banReason is null");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNotNull() {
            addCriterion("banReason is not null");
            return (Criteria) this;
        }

        public Criteria andBanreasonEqualTo(Integer value) {
            addCriterion("banReason =", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotEqualTo(Integer value) {
            addCriterion("banReason <>", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThan(Integer value) {
            addCriterion("banReason >", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("banReason >=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThan(Integer value) {
            addCriterion("banReason <", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThanOrEqualTo(Integer value) {
            addCriterion("banReason <=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonIn(List<Integer> values) {
            addCriterion("banReason in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotIn(List<Integer> values) {
            addCriterion("banReason not in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonBetween(Integer value1, Integer value2) {
            addCriterion("banReason between", value1, value2, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotBetween(Integer value1, Integer value2) {
            addCriterion("banReason not between", value1, value2, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanstartIsNull() {
            addCriterion("banStart is null");
            return (Criteria) this;
        }

        public Criteria andBanstartIsNotNull() {
            addCriterion("banStart is not null");
            return (Criteria) this;
        }

        public Criteria andBanstartEqualTo(Date value) {
            addCriterion("banStart =", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartNotEqualTo(Date value) {
            addCriterion("banStart <>", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartGreaterThan(Date value) {
            addCriterion("banStart >", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartGreaterThanOrEqualTo(Date value) {
            addCriterion("banStart >=", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartLessThan(Date value) {
            addCriterion("banStart <", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartLessThanOrEqualTo(Date value) {
            addCriterion("banStart <=", value, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartIn(List<Date> values) {
            addCriterion("banStart in", values, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartNotIn(List<Date> values) {
            addCriterion("banStart not in", values, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartBetween(Date value1, Date value2) {
            addCriterion("banStart between", value1, value2, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanstartNotBetween(Date value1, Date value2) {
            addCriterion("banStart not between", value1, value2, "banstart");
            return (Criteria) this;
        }

        public Criteria andBanendIsNull() {
            addCriterion("banEnd is null");
            return (Criteria) this;
        }

        public Criteria andBanendIsNotNull() {
            addCriterion("banEnd is not null");
            return (Criteria) this;
        }

        public Criteria andBanendEqualTo(Date value) {
            addCriterion("banEnd =", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendNotEqualTo(Date value) {
            addCriterion("banEnd <>", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendGreaterThan(Date value) {
            addCriterion("banEnd >", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendGreaterThanOrEqualTo(Date value) {
            addCriterion("banEnd >=", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendLessThan(Date value) {
            addCriterion("banEnd <", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendLessThanOrEqualTo(Date value) {
            addCriterion("banEnd <=", value, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendIn(List<Date> values) {
            addCriterion("banEnd in", values, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendNotIn(List<Date> values) {
            addCriterion("banEnd not in", values, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendBetween(Date value1, Date value2) {
            addCriterion("banEnd between", value1, value2, "banend");
            return (Criteria) this;
        }

        public Criteria andBanendNotBetween(Date value1, Date value2) {
            addCriterion("banEnd not between", value1, value2, "banend");
            return (Criteria) this;
        }

        public Criteria andCoinsIsNull() {
            addCriterion("coins is null");
            return (Criteria) this;
        }

        public Criteria andCoinsIsNotNull() {
            addCriterion("coins is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsEqualTo(Integer value) {
            addCriterion("coins =", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotEqualTo(Integer value) {
            addCriterion("coins <>", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsGreaterThan(Integer value) {
            addCriterion("coins >", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsGreaterThanOrEqualTo(Integer value) {
            addCriterion("coins >=", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsLessThan(Integer value) {
            addCriterion("coins <", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsLessThanOrEqualTo(Integer value) {
            addCriterion("coins <=", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsIn(List<Integer> values) {
            addCriterion("coins in", values, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotIn(List<Integer> values) {
            addCriterion("coins not in", values, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsBetween(Integer value1, Integer value2) {
            addCriterion("coins between", value1, value2, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotBetween(Integer value1, Integer value2) {
            addCriterion("coins not between", value1, value2, "coins");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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