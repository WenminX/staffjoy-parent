package com.wm.staffjoy.common.error;

import com.wm.staffjoy.common.api.ResultCode;
import lombok.Getter;

/**
 * This is Description
 *
 * @author wm
 * @date 2019/12/25
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 8963351679624534034L;

    @Getter
    private final ResultCode resultCode;

    public ServiceException(String message) {
        super(message);
        this.resultCode = ResultCode.FALURE;
    }

    public ServiceException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }

    public ServiceException(String message, ResultCode resultCode) {
        super(message);
        this.resultCode = resultCode;
    }

    public ServiceException(ResultCode resultCode, Throwable cause) {
        super(cause);
        this.resultCode = resultCode;
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
        this.resultCode = ResultCode.FALURE;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public Throwable doFillStackTrace() {
        return super.fillInStackTrace();
    }
}
