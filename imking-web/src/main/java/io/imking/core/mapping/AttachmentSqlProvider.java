package io.imking.core.mapping;

import io.imking.core.domain.Attachment;
import org.apache.ibatis.jdbc.SQL;

public class AttachmentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attachment
     *
     * @mbg.generated Wed Jan 24 11:10:47 CST 2018
     */
    public String insertSelective(Attachment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_attachment");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getFileName() != null) {
            sql.VALUES("file_name", "#{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.VALUES("path", "#{path,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.VALUES("size", "#{size,jdbcType=BIGINT}");
        }
        
        if (record.getFileType() != null) {
            sql.VALUES("file_type", "#{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_attachment
     *
     * @mbg.generated Wed Jan 24 11:10:47 CST 2018
     */
    public String updateByPrimaryKeySelective(Attachment record) {
        SQL sql = new SQL();
        sql.UPDATE("t_attachment");
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.SET("path = #{path,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.SET("size = #{size,jdbcType=BIGINT}");
        }
        
        if (record.getFileType() != null) {
            sql.SET("file_type = #{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}