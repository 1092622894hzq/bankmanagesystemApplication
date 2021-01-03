package com.gdut.bankmanagesystem.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author blue
 * @since 2021-01-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Contacts implements Serializable {

    private static final long serialVersionUID = 1L;

    public String id;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 联系人手机号码
     */
    private String phone;

    /**
     * 联系人邮箱
     */
    private String email;

    /**
     * 客户与联系人的关系
     */
    private String relation;


}
