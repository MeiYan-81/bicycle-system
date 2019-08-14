package com.ps.allapp.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author VP
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 返回码 默认200
     */
    private int error_code = 200;

    /**
     * 返回内容
     */
    private T data;

}
