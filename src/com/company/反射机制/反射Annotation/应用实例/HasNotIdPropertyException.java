package com.company.反射机制.反射Annotation.应用实例;

/**
 * @author ShiWei
 * @date 2021/2/26 - 16:07
 *
 * 自定义异常
 */
public class HasNotIdPropertyException extends RuntimeException {
    public HasNotIdPropertyException() {}
    public HasNotIdPropertyException(String s) {
        super(s);
    }
}
