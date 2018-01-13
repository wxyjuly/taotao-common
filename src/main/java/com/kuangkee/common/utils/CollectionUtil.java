package com.kuangkee.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 集合工具类 Date: 2017年2月10日 <br>
 * Copyright (c) 2017 asiainfo.com <br>
 * 
 * @author
 */
public final class CollectionUtil {
	private CollectionUtil() {
	}

	public static boolean isEmpty(Collection<?> collection) {
		if (null == collection) {
			return true;
		} else {
			return collection.isEmpty();
		}
	}

	public static boolean isEmpty(Object[] objects) {
		return (objects == null || objects.length == 0) ? true : false;
	}

	/**
	 * 数组转换为List
	 * 
	 * @param arr
	 * @return
	 */
	public static List<?> arrayToList(Object[] arr) {
		List<?> list = new ArrayList<>();
		if (arr == null) {
			return list;
		}
		list = Arrays.asList(arr);
		return list;
	}

	/**
	 * 集合分割成字符串
	 * 
	 * @param collections
	 *            集合对象
	 * @param separator
	 *            分隔符
	 * @return
	 * @author rui
	 */
	public static String toSplitString(Collection<?> collections, String separator) {
		if (isEmpty(collections))
			return null;
		Object[] array = collections.toArray(new Object[collections.size()]);
		int length = array.length;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			stringBuilder.append(array[i]);
			if (i != length - 1) {
				stringBuilder.append(separator);
			}
		}
		return stringBuilder.toString();
	}

}
