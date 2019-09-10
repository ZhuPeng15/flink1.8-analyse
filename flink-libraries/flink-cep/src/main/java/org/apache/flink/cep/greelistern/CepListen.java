package org.apache.flink.cep.greelistern;

import org.apache.flink.cep.pattern.Pattern;

import java.io.Serializable;

public interface CepListen<T> extends Serializable {
	/**
	 * @Description: 给用户实现，返回一个新逻辑生成的pattern对象
	 * @param: []
	 * @return: org.apache.flink.cep.pattern.Pattern
	 * @auther: greenday
	 * @date: 2019/9/7 10:46
	 */
	Pattern<T,?> returnPattern();
	/**
	 * @Description: 留给用户当接受到元素的时候是否需要更新逻辑
	 * @param: []
	 * @return: java.lang.Boolean
	 * @auther: greenday
	 * @date: 2019/9/7 11:22
	 */
	Boolean needChange(T element);
}
