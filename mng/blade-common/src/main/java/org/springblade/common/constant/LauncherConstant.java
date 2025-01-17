
package org.springblade.common.constant;

import org.springblade.core.launch.constant.AppConstant;

import static org.springblade.core.launch.constant.AppConstant.APPLICATION_NAME_PREFIX;

/**
 * 启动常量
 *
 *
 */
public interface LauncherConstant {

	/**
	 * xxljob
	 */
	String APPLICATION_XXLJOB_NAME = APPLICATION_NAME_PREFIX + "xxljob";

	/**
	 * xxljob
	 */
	String APPLICATION_XXLJOB_ADMIN_NAME = APPLICATION_NAME_PREFIX + "xxljob-admin";

	/**
	 * nacos dev 地址
	 */
	String NACOS_DEV_ADDR = "127.0.0.1:8848";

	/**
	 * nacos prod 地址
	 */
	String NACOS_PROD_ADDR = "nacos:8848";

	/**
	 * nacos test 地址
	 */
	String NACOS_TEST_ADDR = "50.229.2.4:8848";

	/**
	 * sentinel dev 地址
	 */
	String SENTINEL_DEV_ADDR = "127.0.0.1:8858";

	/**
	 * sentinel prod 地址
	 */
	String SENTINEL_PROD_ADDR = "172.30.0.58:8858";

	/**
	 * sentinel test 地址
	 */
	String SENTINEL_TEST_ADDR = "172.30.0.58:8858";

	/**
	 * seata dev 地址
	 */
	String SEATA_DEV_ADDR = "127.0.0.1:8091";

	/**
	 * seata prod 地址
	 */
	String SEATA_PROD_ADDR = "172.30.0.68:8091";

	/**
	 * seata test 地址
	 */
	String SEATA_TEST_ADDR = "172.30.0.68:8091";

	/**
	 * zipkin dev 地址
	 */
	String ZIPKIN_DEV_ADDR = "http://127.0.0.1:9411";

	/**
	 * zipkin prod 地址
	 */
	String ZIPKIN_PROD_ADDR = "http://172.30.0.71:9411";

	/**
	 * zipkin test 地址
	 */
	String ZIPKIN_TEST_ADDR = "http://172.30.0.71:9411";

	/**
	 * elk dev 地址
	 */
	String ELK_DEV_ADDR = "154.207.98.223:9000";

	/**
	 * elk prod 地址
	 */
	String ELK_PROD_ADDR = "172.31.13.66:9000";

	/**
	 * elk test 地址
	 */
	String ELK_TEST_ADDR = "154.207.98.223:9000";

	/**
	 * seata file模式
	 */
	String FILE_MODE = "file";

	/**
	 * seata nacos模式
	 */
	String NACOS_MODE = "nacos";

	/**
	 * seata default模式
	 */
	String DEFAULT_MODE = "default";

	/**
	 * seata group后缀
	 */
	String GROUP_NAME = "-group";

	/**
	 * seata 服务组格式
	 *
	 * @param appName 服务名
	 * @return group
	 */
	static String seataServiceGroup(String appName) {
		return appName.concat(GROUP_NAME);
	}

	/**
	 * 动态获取nacos地址
	 *
	 * @param profile 环境变量
	 * @return addr
	 */
	static String nacosAddr(String profile) {
		switch (profile) {
			case (AppConstant.PROD_CODE):
				return NACOS_PROD_ADDR;
			case (AppConstant.TEST_CODE):
				return NACOS_TEST_ADDR;
			default:
				return NACOS_DEV_ADDR;
		}
	}

	/**
	 * 动态获取sentinel地址
	 *
	 * @param profile 环境变量
	 * @return addr
	 */
	static String sentinelAddr(String profile) {
		switch (profile) {
			case (AppConstant.PROD_CODE):
				return SENTINEL_PROD_ADDR;
			case (AppConstant.TEST_CODE):
				return SENTINEL_TEST_ADDR;
			default:
				return SENTINEL_DEV_ADDR;
		}
	}

	/**
	 * 动态获取seata地址
	 *
	 * @param profile 环境变量
	 * @return addr
	 */
	static String seataAddr(String profile) {
		switch (profile) {
			case (AppConstant.PROD_CODE):
				return SEATA_PROD_ADDR;
			case (AppConstant.TEST_CODE):
				return SEATA_TEST_ADDR;
			default:
				return SEATA_DEV_ADDR;
		}
	}

	/**
	 * 动态获取zipkin地址
	 *
	 * @param profile 环境变量
	 * @return addr
	 */
	static String zipkinAddr(String profile) {
		switch (profile) {
			case (AppConstant.PROD_CODE):
				return ZIPKIN_PROD_ADDR;
			case (AppConstant.TEST_CODE):
				return ZIPKIN_TEST_ADDR;
			default:
				return ZIPKIN_DEV_ADDR;
		}
	}

	/**
	 * 动态获取elk地址
	 *
	 * @param profile 环境变量
	 * @return addr
	 */
	static String elkAddr(String profile) {
		switch (profile) {
			case (AppConstant.PROD_CODE):
				return ELK_PROD_ADDR;
			case (AppConstant.TEST_CODE):
				return ELK_TEST_ADDR;
			default:
				return ELK_DEV_ADDR;
		}
	}

}
