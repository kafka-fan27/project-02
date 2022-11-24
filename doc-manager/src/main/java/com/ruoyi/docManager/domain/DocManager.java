package com.ruoyi.docManager.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公文签收对象 tjdw_doc_manager
 * 
 * @author kafka
 * @date 2022-11-23
 */
public class DocManager extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** NO */
    private Long id;

    /** 发文号 */
    @Excel(name = "发文号")
    private String docOrder;

    /** 公文标题 */
    @Excel(name = "公文标题")
    private String docTitle;

    /** 公文保存地址 */
    @Excel(name = "公文保存地址")
    private String docUrl;

    /** 发文部门id */
    @Excel(name = "发文部门id")
    private Long deptId;

    /** 发文日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发文日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date docDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDocOrder(String docOrder) 
    {
        this.docOrder = docOrder;
    }

    public String getDocOrder() 
    {
        return docOrder;
    }
    public void setDocTitle(String docTitle) 
    {
        this.docTitle = docTitle;
    }

    public String getDocTitle() 
    {
        return docTitle;
    }
    public void setDocUrl(String docUrl) 
    {
        this.docUrl = docUrl;
    }

    public String getDocUrl() 
    {
        return docUrl;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setDocDate(Date docDate) 
    {
        this.docDate = docDate;
    }

    public Date getDocDate() 
    {
        return docDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("docOrder", getDocOrder())
            .append("docTitle", getDocTitle())
            .append("docUrl", getDocUrl())
            .append("deptId", getDeptId())
            .append("docDate", getDocDate())
            .toString();
    }
}
