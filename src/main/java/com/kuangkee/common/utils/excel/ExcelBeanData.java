/**
 * Project Name:taotao-common
 * File Name:ExcelBeanData.java
 * Package Name:com.kuangkee.common.utils.excel
 * Date:2018年1月12日下午1:14:08
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ExcelBeanData <br/>
 * Date:     2018年1月12日 下午1:14:08 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
public class ExcelBeanData {
	
	public static final String EXCEL_ENDING = ".xls" ;
	
    private String excelTitle ;
    
    private List<String> excelHeaders ;

	public List<String> getExcelHeaders() {
		return excelHeaders;
	}

	public void setExcelHeaders(List<String> excelHeaders) {
		this.excelHeaders = excelHeaders;
	}
    
	public String getExcelTitle() {
		return excelTitle;
	}

	public void setExcelTitle(String excelTitle) {
		this.excelTitle = excelTitle ;
	}

	@Override
	public String toString() {
		return "ExcelBeanData [excelTitle=" + excelTitle + ", excelHeaders=" + excelHeaders + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((excelHeaders == null) ? 0 : excelHeaders.hashCode());
		result = prime * result + ((excelTitle == null) ? 0 : excelTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcelBeanData other = (ExcelBeanData) obj;
		if (excelHeaders == null) {
			if (other.excelHeaders != null)
				return false;
		} else if (!excelHeaders.equals(other.excelHeaders))
			return false;
		if (excelTitle == null) {
			if (other.excelTitle != null)
				return false;
		} else if (!excelTitle.equals(other.excelTitle))
			return false;
		return true;
	}

}

