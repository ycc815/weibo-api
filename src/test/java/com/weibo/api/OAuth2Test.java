/*
 * @(#)OAuth2Test.java $version 2013年12月2日
 *
 * Copyright 2013 NHN ST. All rights Reserved.
 * NHN ST PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.weibo.api;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.weibo.api.test.AbstractTest;

/**
 * nhn weibo-api
 * com.weibo.api.OAuth2Test.java
 * @author st13902
 * @date 2013年12月2日
 */
public class OAuth2Test extends AbstractTest {

	@Resource
	private Map<String, String> dataMap;

	@Resource
	private OAuth2 oAuth2;

	@Test
	public void getTokenInfo() {
		oAuth2.getTokenInfo(dataMap.get("accessToken"));
	}

}