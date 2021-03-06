package com.wh.kettlescheduler.vo.response;

import com.wh.kettlescheduler.vo.basic.BasicVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户表
 *
 * @author lyf
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户表-出参")
public class UserRes extends BasicVO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 用于电话
     */
    @ApiModelProperty(value = "用于电话")
    private String phone;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号")
    private String account;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String password;
}