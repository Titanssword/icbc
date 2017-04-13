package tiger.common.dal.persistence.behaviour_authen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Simulation_source_tableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public Simulation_source_tableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTimeStampIsNull() {
            addCriterion("Time_Stamp is null");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNotNull() {
            addCriterion("Time_Stamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStampEqualTo(Date value) {
            addCriterion("Time_Stamp =", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotEqualTo(Date value) {
            addCriterion("Time_Stamp <>", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThan(Date value) {
            addCriterion("Time_Stamp >", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("Time_Stamp >=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThan(Date value) {
            addCriterion("Time_Stamp <", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("Time_Stamp <=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampIn(List<Date> values) {
            addCriterion("Time_Stamp in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotIn(List<Date> values) {
            addCriterion("Time_Stamp not in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampBetween(Date value1, Date value2) {
            addCriterion("Time_Stamp between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("Time_Stamp not between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumIsNull() {
            addCriterion("Tran_Out_Card_Num is null");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumIsNotNull() {
            addCriterion("Tran_Out_Card_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumEqualTo(String value) {
            addCriterion("Tran_Out_Card_Num =", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumNotEqualTo(String value) {
            addCriterion("Tran_Out_Card_Num <>", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumGreaterThan(String value) {
            addCriterion("Tran_Out_Card_Num >", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("Tran_Out_Card_Num >=", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumLessThan(String value) {
            addCriterion("Tran_Out_Card_Num <", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumLessThanOrEqualTo(String value) {
            addCriterion("Tran_Out_Card_Num <=", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumLike(String value) {
            addCriterion("Tran_Out_Card_Num like", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumNotLike(String value) {
            addCriterion("Tran_Out_Card_Num not like", value, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumIn(List<String> values) {
            addCriterion("Tran_Out_Card_Num in", values, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumNotIn(List<String> values) {
            addCriterion("Tran_Out_Card_Num not in", values, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumBetween(String value1, String value2) {
            addCriterion("Tran_Out_Card_Num between", value1, value2, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTranOutCardNumNotBetween(String value1, String value2) {
            addCriterion("Tran_Out_Card_Num not between", value1, value2, "tranOutCardNum");
            return (Criteria) this;
        }

        public Criteria andTxAmtIsNull() {
            addCriterion("Tx_Amt is null");
            return (Criteria) this;
        }

        public Criteria andTxAmtIsNotNull() {
            addCriterion("Tx_Amt is not null");
            return (Criteria) this;
        }

        public Criteria andTxAmtEqualTo(BigDecimal value) {
            addCriterion("Tx_Amt =", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotEqualTo(BigDecimal value) {
            addCriterion("Tx_Amt <>", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtGreaterThan(BigDecimal value) {
            addCriterion("Tx_Amt >", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Tx_Amt >=", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtLessThan(BigDecimal value) {
            addCriterion("Tx_Amt <", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Tx_Amt <=", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtIn(List<BigDecimal> values) {
            addCriterion("Tx_Amt in", values, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotIn(List<BigDecimal> values) {
            addCriterion("Tx_Amt not in", values, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tx_Amt between", value1, value2, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tx_Amt not between", value1, value2, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumIsNull() {
            addCriterion("Tran_In_Acct_Num is null");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumIsNotNull() {
            addCriterion("Tran_In_Acct_Num is not null");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumEqualTo(String value) {
            addCriterion("Tran_In_Acct_Num =", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumNotEqualTo(String value) {
            addCriterion("Tran_In_Acct_Num <>", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumGreaterThan(String value) {
            addCriterion("Tran_In_Acct_Num >", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumGreaterThanOrEqualTo(String value) {
            addCriterion("Tran_In_Acct_Num >=", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumLessThan(String value) {
            addCriterion("Tran_In_Acct_Num <", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumLessThanOrEqualTo(String value) {
            addCriterion("Tran_In_Acct_Num <=", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumLike(String value) {
            addCriterion("Tran_In_Acct_Num like", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumNotLike(String value) {
            addCriterion("Tran_In_Acct_Num not like", value, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumIn(List<String> values) {
            addCriterion("Tran_In_Acct_Num in", values, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumNotIn(List<String> values) {
            addCriterion("Tran_In_Acct_Num not in", values, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumBetween(String value1, String value2) {
            addCriterion("Tran_In_Acct_Num between", value1, value2, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andTranInAcctNumNotBetween(String value1, String value2) {
            addCriterion("Tran_In_Acct_Num not between", value1, value2, "tranInAcctNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumIsNull() {
            addCriterion("Jnl_Seq_Num is null");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumIsNotNull() {
            addCriterion("Jnl_Seq_Num is not null");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumEqualTo(String value) {
            addCriterion("Jnl_Seq_Num =", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumNotEqualTo(String value) {
            addCriterion("Jnl_Seq_Num <>", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumGreaterThan(String value) {
            addCriterion("Jnl_Seq_Num >", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumGreaterThanOrEqualTo(String value) {
            addCriterion("Jnl_Seq_Num >=", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumLessThan(String value) {
            addCriterion("Jnl_Seq_Num <", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumLessThanOrEqualTo(String value) {
            addCriterion("Jnl_Seq_Num <=", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumLike(String value) {
            addCriterion("Jnl_Seq_Num like", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumNotLike(String value) {
            addCriterion("Jnl_Seq_Num not like", value, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumIn(List<String> values) {
            addCriterion("Jnl_Seq_Num in", values, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumNotIn(List<String> values) {
            addCriterion("Jnl_Seq_Num not in", values, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumBetween(String value1, String value2) {
            addCriterion("Jnl_Seq_Num between", value1, value2, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andJnlSeqNumNotBetween(String value1, String value2) {
            addCriterion("Jnl_Seq_Num not between", value1, value2, "jnlSeqNum");
            return (Criteria) this;
        }

        public Criteria andEventDtIsNull() {
            addCriterion("Event_Dt is null");
            return (Criteria) this;
        }

        public Criteria andEventDtIsNotNull() {
            addCriterion("Event_Dt is not null");
            return (Criteria) this;
        }

        public Criteria andEventDtEqualTo(Date value) {
            addCriterionForJDBCDate("Event_Dt =", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("Event_Dt <>", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtGreaterThan(Date value) {
            addCriterionForJDBCDate("Event_Dt >", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Event_Dt >=", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtLessThan(Date value) {
            addCriterionForJDBCDate("Event_Dt <", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Event_Dt <=", value, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtIn(List<Date> values) {
            addCriterionForJDBCDate("Event_Dt in", values, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("Event_Dt not in", values, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Event_Dt between", value1, value2, "eventDt");
            return (Criteria) this;
        }

        public Criteria andEventDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Event_Dt not between", value1, value2, "eventDt");
            return (Criteria) this;
        }

        public Criteria andLableIsNull() {
            addCriterion("Lable is null");
            return (Criteria) this;
        }

        public Criteria andLableIsNotNull() {
            addCriterion("Lable is not null");
            return (Criteria) this;
        }

        public Criteria andLableEqualTo(Boolean value) {
            addCriterion("Lable =", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotEqualTo(Boolean value) {
            addCriterion("Lable <>", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThan(Boolean value) {
            addCriterion("Lable >", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Lable >=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThan(Boolean value) {
            addCriterion("Lable <", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThanOrEqualTo(Boolean value) {
            addCriterion("Lable <=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableIn(List<Boolean> values) {
            addCriterion("Lable in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotIn(List<Boolean> values) {
            addCriterion("Lable not in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableBetween(Boolean value1, Boolean value2) {
            addCriterion("Lable between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Lable not between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andZoneNumIsNull() {
            addCriterion("Zone_Num is null");
            return (Criteria) this;
        }

        public Criteria andZoneNumIsNotNull() {
            addCriterion("Zone_Num is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNumEqualTo(String value) {
            addCriterion("Zone_Num =", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumNotEqualTo(String value) {
            addCriterion("Zone_Num <>", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumGreaterThan(String value) {
            addCriterion("Zone_Num >", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("Zone_Num >=", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumLessThan(String value) {
            addCriterion("Zone_Num <", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumLessThanOrEqualTo(String value) {
            addCriterion("Zone_Num <=", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumLike(String value) {
            addCriterion("Zone_Num like", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumNotLike(String value) {
            addCriterion("Zone_Num not like", value, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumIn(List<String> values) {
            addCriterion("Zone_Num in", values, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumNotIn(List<String> values) {
            addCriterion("Zone_Num not in", values, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumBetween(String value1, String value2) {
            addCriterion("Zone_Num between", value1, value2, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andZoneNumNotBetween(String value1, String value2) {
            addCriterion("Zone_Num not between", value1, value2, "zoneNum");
            return (Criteria) this;
        }

        public Criteria andPredicationResultIsNull() {
            addCriterion("Predication_result is null");
            return (Criteria) this;
        }

        public Criteria andPredicationResultIsNotNull() {
            addCriterion("Predication_result is not null");
            return (Criteria) this;
        }

        public Criteria andPredicationResultEqualTo(Boolean value) {
            addCriterion("Predication_result =", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultNotEqualTo(Boolean value) {
            addCriterion("Predication_result <>", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultGreaterThan(Boolean value) {
            addCriterion("Predication_result >", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Predication_result >=", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultLessThan(Boolean value) {
            addCriterion("Predication_result <", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultLessThanOrEqualTo(Boolean value) {
            addCriterion("Predication_result <=", value, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultIn(List<Boolean> values) {
            addCriterion("Predication_result in", values, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultNotIn(List<Boolean> values) {
            addCriterion("Predication_result not in", values, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultBetween(Boolean value1, Boolean value2) {
            addCriterion("Predication_result between", value1, value2, "predicationResult");
            return (Criteria) this;
        }

        public Criteria andPredicationResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Predication_result not between", value1, value2, "predicationResult");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table simulation_source_table
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table simulation_source_table
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}