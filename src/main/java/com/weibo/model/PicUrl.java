/*
 * @(#)PicUrl.java $version 2013年12月2日
 *
 * Copyright 2013 NHN ST. All rights Reserved.
 * cuizuoli.cn PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.weibo.model;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * weibo-api
 * com.weibo.model.PicUrl.java
 * @author st13902
 * @date 2013年12月2日
 */
@Data
public class PicUrl {
	@JsonProperty("thumbnail_pic")
	private String thumbnailPic;
}
