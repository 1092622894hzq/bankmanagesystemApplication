package com.gdut.bankmanagesystem.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gdut.bankmanagesystem.entity.Client;
import com.gdut.bankmanagesystem.entity.Contacts;
import lombok.Getter;
import lombok.Setter;

/**
 * @author honzooban
 * @version 1.0.0
 * @Description
 * @createTime 2021年01月04日 23:51:00
 */
@Getter
@Setter
public class UpdateClientDTO {

    private Long id;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 客户手机号码
     */
    private String phone;

    /**
     * 客户家庭地址
     */
    private String address;

    /**
     * 身份证号码
     */
    private String identifyCard;

    /**
     * contacts表主键id
     */
    private Long contactId;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人手机号码
     */
    private String contactPhone;

    /**
     * 联系人邮箱
     */
    private String contactEmail;

    /**
     * 客户与联系人的关系
     */
    private String contactRelation;

}