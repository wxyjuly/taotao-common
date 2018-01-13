/**
 * Project Name:taotao-common
 * File Name:ExcelExportTest.java
 * Package Name:com.kuangkee.common.utils.excel
 * Date:2018年1月12日下午1:27:53
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ExcelExportTest <br/>
 * Date:     2018年1月12日 下午1:27:53 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */

/**
 * JS Ajax写法，Ajax构造表单
	function submitForm(qryParam) {
		//定义一个form表单  
	    var myform = $("<form></form>");  
	    myform.attr('method','post')  
	    myform.attr('action', _base + "/asmt/report/exportCurProcessViews");  
	      
	    var myProductId = $("<input type='hidden' name='productId' />")  
	    myProductId.attr('value',$("#query-param-product-id").val());  
	    myform.append(myProductId);
	    
	    //jquery循环json的值赋值
	    $.each(qryParam,function(name,value) {
	//    	alert(name+"->"+value);
	    	
	    	var myHiddenData = $("<input type='hidden' name='"+name+"' />") ;
	        myHiddenData.attr('value',value);  
	        myform.append(myHiddenData);
	    });
	    myform.appendTo('body').submit(); //must add this line for higher html spec       
	}
 */
public class ExcelExportTest {

	public static void main(String[] args) {
		String excelTitle = "张三的歌" ;
		List<String> vOs = new ArrayList<>() ;
		ExcelBeanData excelBeanData = new ExcelBeanData() ;
		excelBeanData.setExcelTitle(excelTitle);
		
	}

}

