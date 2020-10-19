package com.adr.swagger.demo.web.rest.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ExampleDTO implements Serializable {

    @ApiModelProperty(position = 0 )
    private String firstAttribute;

    @ApiModelProperty(position = 1)
    private String secondAttribute;

    @ApiModelProperty(position = 2)
    private Long longAtribute;


    public String getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
    }

    public Long getLongAtribute() {
        return longAtribute;
    }

    public void setLongAtribute(Long longAtribute) {
        this.longAtribute = longAtribute;
    }
}
