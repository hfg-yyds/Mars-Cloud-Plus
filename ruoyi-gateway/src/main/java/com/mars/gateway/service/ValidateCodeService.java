package com.mars.gateway.service;

import com.mars.common.core.domain.R;
import com.mars.common.core.exception.CaptchaException;

import java.io.IOException;
import java.util.Map;

/**
 * 验证码处理
 *
 * @author ruoyi
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    R<Map<String, Object>> createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    void checkCaptcha(String key, String value) throws CaptchaException;
}
