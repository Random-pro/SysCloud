package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * 角色表 t_test_lib
 * 
 * @author snaker
 */
public class TestLib extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色ID */
    @Excel(name = "角色序号")
    private Long testId;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String testContent;

    /** 角色权限 */
    @Excel(name = "角色权限")
    private String evaluationId;

    /** 角色排序 */
    @Excel(name = "角色排序")
    private String testAnswer;

    /** 角色排序 */
    @Excel(name = "角色排序")
    private String testSort;

    /** 角色排序 */
    @Excel(name = "角色排序")
    private String calcScore;

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getTestAnswer() {
        return testAnswer;
    }

    public void setTestAnswer(String testAnswer) {
        this.testAnswer = testAnswer;
    }

    public String getTestSort() {
        return testSort;
    }

    public void setTestSort(String testSort) {
        this.testSort = testSort;
    }

    public String getCalcScore() {
        return calcScore;
    }

    public void setCalcScore(String calcScore) {
        this.calcScore = calcScore;
    }

    @Override
    public String toString() {
        return "TestLib{" +
                "testId=" + testId +
                ", testContent='" + testContent + '\'' +
                ", evaluationId='" + evaluationId + '\'' +
                ", testAnswer='" + testAnswer + '\'' +
                ", testSort='" + testSort + '\'' +
                ", calcScore='" + calcScore + '\'' +
                '}';
    }
}
