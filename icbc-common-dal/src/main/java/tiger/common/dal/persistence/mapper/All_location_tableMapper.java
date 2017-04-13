package tiger.common.dal.persistence.mapper;

import org.apache.ibatis.annotations.Param;
import tiger.common.dal.persistence.behaviour_authen.All_location_table;
import tiger.common.dal.persistence.behaviour_authen.All_location_tableExample;

import java.util.List;

public interface All_location_tableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int countByExample(All_location_tableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int deleteByExample(All_location_tableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int insert(All_location_table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int insertSelective(All_location_table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    List<All_location_table> selectByExample(All_location_tableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    All_location_table selectByPrimaryKey(Integer user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") All_location_table record, @Param("example") All_location_tableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") All_location_table record, @Param("example") All_location_tableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(All_location_table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_location_table
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(All_location_table record);
}