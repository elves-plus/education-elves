package com.cloud.edu.exception;

public interface ErrorType {
    /**
     * 返回code
     *
     * @return
     */
    String getCode();

    /**
     * 返回mesg
     *
     * @return
     */
    String getMesg();
}
