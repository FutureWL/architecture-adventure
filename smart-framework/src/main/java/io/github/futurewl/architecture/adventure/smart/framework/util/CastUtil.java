package io.github.futurewl.architecture.adventure.smart.framework.util;

/**
 * ==========================
 * 功能描述：转型操作工具类
 * ==========================
 *
 * @author weilai
 * @version 1.0.0
 */
public final class CastUtil {

    /**
     * 转为 String 类型
     *
     * @param object
     * @return
     */
    public static String castString(Object object) {
        return CastUtil.castString(object, "");
    }

    /**
     * 转为 String 类型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    private static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }

    /**
     * 转为 Double 型
     *
     * @param object
     * @return
     */
    public static Double castDouble(Object object) {
        return CastUtil.castDouble(object, 0.0d);
    }

    /**
     * 转为 Double 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    private static Double castDouble(Object object, Double defaultValue) {
        double doubleValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为 Long 型
     *
     * @param object
     * @return
     */
    public static Long castLong(Object object) {
        return CastUtil.castLong(object, 0L);
    }

    /**
     * 转为 Long 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    private static Long castLong(Object object, Long defaultValue) {
        long longValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为 Integer 型
     *
     * @param object
     * @return
     */
    public static Integer castInt(Object object) {
        return CastUtil.castInt(object, 0);
    }

    /**
     * 转为 Integer 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    private static Integer castInt(Object object, Integer defaultValue) {
        int integerValue = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    integerValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    integerValue = defaultValue;
                }
            }
        }
        return integerValue;
    }


    /**
     * 转为 Boolean 型
     *
     * @param object
     * @return
     */
    public static Boolean castBoolean(Object object) {
        return CastUtil.castBoolean(object, false);
    }

    /**
     * 转为 Boolean 型（提供默认值）
     *
     * @param object
     * @param defaultValue
     * @return
     */
    private static Boolean castBoolean(Object object, Boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (object != null) {
            booleanValue = Boolean.parseBoolean(castString(object));
        }
        return booleanValue;
    }


}
