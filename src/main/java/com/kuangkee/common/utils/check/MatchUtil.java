package com.kuangkee.common.utils.check ;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 校验数组，集合，字符串等是否为空
 * ClassName: MatchUtil <br/>
 * date: 2018年1月7日 下午8:19:03 <br/>
 * @author Leon Xi
 * @version v1.0
 */
public class MatchUtil {
    /**
     * 判断对象是否为空
     *
     * @param obj 对象
     * @return 是否为空
     */
    public static boolean isEmpty(Object obj) {
        return obj == null;
    }

    /**
     * 判断哈希是否为空
     *
     * @param map 哈希
     * @return 是否为空
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return (map == null || map.size() == 0);
    }

    /**
     * 判断字符是否为空
     *
     * @param str 字符
     * @return 是否为空
     */
    public static boolean isEmpty(String str) {
        return (str == null || "".equals(str) || "null".equalsIgnoreCase(str) || str.trim().length() == 0);
    }

    /**
     * 判断数组是否为空
     *
     * @param arr 数组
     * @return 是否为空
     */
    public static boolean isEmpty(Arrays[] arr) {
        return (arr == null || arr.length == 0);
    }

    /**
     * 判断列表是否为空
     *
     * @param lis 列表
     * @return 是否为空
     */
    public static boolean isEmpty(List<?> lis) {
        return (lis == null || lis.size() == 0);
    }

    /**
     * 判断集合是否为空
     *
     * @param ita 集合
     * @return 是否为空
     */
    public static boolean isEmpty(Iterator<?> ita) {
        return (ita == null || !ita.hasNext());
    }

    /**
     * 判断缓存是否为空
     *
     * @param sbf 缓存
     * @return 是否为空
     */
    public static boolean isEmpty(StringBuffer sbf) {
        return (sbf == null || sbf.length() == 0);
    }
}
