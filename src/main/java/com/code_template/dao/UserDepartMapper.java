package com.code_template.dao;

import com.code_template.model.po.UserDepart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDepartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    @Delete({
        "delete from user_depart",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    @Insert({
        "insert into user_depart (id, depart_id, ",
        "user_id, gmt_create, ",
        "gmt_modify)",
        "values (#{id,jdbcType=INTEGER}, #{departId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP})"
    })
    int insert(UserDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    int insertSelective(UserDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    @Select({
        "select",
        "id, depart_id, user_id, gmt_create, gmt_modify",
        "from user_depart",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.code_template.dao.UserDepartMapper.BaseResultMap")
    UserDepart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    int updateByPrimaryKeySelective(UserDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_depart
     *
     * @mbg.generated Thu Jan 28 21:37:17 CST 2021
     */
    @Update({
        "update user_depart",
        "set depart_id = #{departId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserDepart record);
}