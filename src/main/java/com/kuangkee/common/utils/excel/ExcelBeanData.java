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
	
	public static void main(String[] args) {
		String excelTitle = "张三" ;
		List<String> vOs = new ArrayList<>() ;
		ExcelBeanData excelBeanData = new ExcelBeanData() ;
		excelBeanData.setExcelTitle(excelTitle);
		
	}
}

