package tiger.common.dal.persistence.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tiger.common.dal.persistence.icbc.TransactionInfoDO;
import tiger.common.dal.persistence.icbc.TransactionInfoDOExample;

public interface TransactionInfoDOMapper {
    List<TransactionInfoDO> selectAll();

    List<TransactionInfoDO> selectByOutCardNum(String outCardNum);

    TransactionInfoCountDomain  countAll();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int countByExample(TransactionInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int deleteByExample(TransactionInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int insert(TransactionInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int insertSelective(TransactionInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    List<TransactionInfoDO> selectByExample(TransactionInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    TransactionInfoDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransactionInfoDO record, @Param("example") TransactionInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransactionInfoDO record, @Param("example") TransactionInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransactionInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transactioninfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransactionInfoDO record);
}