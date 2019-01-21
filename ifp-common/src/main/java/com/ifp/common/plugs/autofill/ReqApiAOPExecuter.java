/*
 * Copyright 2018 www.n22.com.cn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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
package com.ifp.common.plugs.autofill;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 响应GetApi、PostApi、ReqApi。
 * @see com.ifp.common.plugs.autofill.annotations.ReqApi
 * @see com.ifp.common.plugs.autofill.annotations.GetApi
 * @see com.ifp.common.plugs.autofill.annotations.PostApi
 * @author xman 2018-12-29
 */
@Aspect
public class ReqApiAOPExecuter {

	@Pointcut("(execution(com.ifp.common.model.ResponseObj **.*(..)) "
			+ "|| execution(com.ifp.common.model.ResponseDTO **.*(..)))"
			+ " && "
			+ "(@annotation(com.ifp.common.plugs.autofill.annotations.ReqApi) || "
			+ "@annotation(com.ifp.common.plugs.autofill.annotations.GetApi) || "
			+ "@annotation(com.ifp.common.plugs.autofill.annotations.PostApi)")
	public void whoElse() {}
	
	@Around("whoElse()")
	public Object aroundHandler(ProceedingJoinPoint jointPoint) {
		// 暂停编写
		// 运行时使用反射取值带来严重的性能影响，
		// 良好的解决方案是：在spring扫描bean时实现预处理。
		try {
			jointPoint.proceed();
		} catch (Throwable e) {
			
		}
		return null;
	}
	
}
