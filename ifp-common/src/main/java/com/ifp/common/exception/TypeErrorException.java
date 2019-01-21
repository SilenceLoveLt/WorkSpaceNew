/*
 * Copyright 2018 www.n22.com.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this common except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ifp.common.exception;

/**
 * 类型错误异常。
 *
 * @author xman 2018-12-10
 */
public class TypeErrorException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public TypeErrorException(String message) {
        super(message);
    }

    public TypeErrorException(Throwable cause) {
        super(cause);
    }

    public TypeErrorException(String message, Throwable cause) {
        super(message, cause);
    }

}
