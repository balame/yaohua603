package com.yaohua.love.db;

import java.util.Date;

import javax.persistence.Id;

import com.yaohua.love.util.UUIdGenId;

import tk.mybatis.mapper.annotation.KeySql;

public class TUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
	@KeySql(genId = UUIdGenId.class)
	@Id
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.CREATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.CREATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private Long createrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.EMAIL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.ERRORTIMES
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private Integer errortimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.IS_DELETED
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.NAME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.PASSWORD
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.SID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.STATUS
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.TEL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.TYPE
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.UPDATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.UPDATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    private Long updaterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.ID
     *
     * @return the value of T_USER.ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.ID
     *
     * @param id the value for T_USER.ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.CREATE_TIME
     *
     * @return the value of T_USER.CREATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.CREATE_TIME
     *
     * @param createTime the value for T_USER.CREATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.CREATER_ID
     *
     * @return the value of T_USER.CREATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.CREATER_ID
     *
     * @param createrId the value for T_USER.CREATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.EMAIL
     *
     * @return the value of T_USER.EMAIL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.EMAIL
     *
     * @param email the value for T_USER.EMAIL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.ERRORTIMES
     *
     * @return the value of T_USER.ERRORTIMES
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Integer getErrortimes() {
        return errortimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.ERRORTIMES
     *
     * @param errortimes the value for T_USER.ERRORTIMES
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setErrortimes(Integer errortimes) {
        this.errortimes = errortimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.IS_DELETED
     *
     * @return the value of T_USER.IS_DELETED
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.IS_DELETED
     *
     * @param isDeleted the value for T_USER.IS_DELETED
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.NAME
     *
     * @return the value of T_USER.NAME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.NAME
     *
     * @param name the value for T_USER.NAME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.PASSWORD
     *
     * @return the value of T_USER.PASSWORD
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.PASSWORD
     *
     * @param password the value for T_USER.PASSWORD
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.SID
     *
     * @return the value of T_USER.SID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.SID
     *
     * @param sid the value for T_USER.SID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.STATUS
     *
     * @return the value of T_USER.STATUS
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.STATUS
     *
     * @param status the value for T_USER.STATUS
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.TEL
     *
     * @return the value of T_USER.TEL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.TEL
     *
     * @param tel the value for T_USER.TEL
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.TYPE
     *
     * @return the value of T_USER.TYPE
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.TYPE
     *
     * @param type the value for T_USER.TYPE
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.UPDATE_TIME
     *
     * @return the value of T_USER.UPDATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.UPDATE_TIME
     *
     * @param updateTime the value for T_USER.UPDATE_TIME
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.UPDATER_ID
     *
     * @return the value of T_USER.UPDATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public Long getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.UPDATER_ID
     *
     * @param updaterId the value for T_USER.UPDATER_ID
     *
     * @mbg.generated Mon Dec 23 21:44:25 CST 2019
     */
    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }
}