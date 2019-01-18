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
package com.ifp.common.constant;

/**
 * 系统中所用到的消息中间件中的队列的名字。
 * 
 * @author xman 2018-11-16
 */
public class MQName {

	/**
	 * 投保的消息队列
	 * 
	 * @author xman 2018-11-16
	 */
	public static class INS {

		// 声明交换器名称
		public static final String EXCHANGE = "ins.topic";
		public static final String EXCHANGE_AE = "ins.topic.ae";
		public static final String EXCHANGE_DLX = "ins.topic.dlx";
		// 声明队列名称
		public static final String QUEUE = "ins.queue";
		public static final String QUEUE_AE = "ins.queue.ae";
		public static final String QUEUE_DLX = "ins.queue.dlx";
		// 绑定Key
		public static final String ROUTING_KEY = "ins.*";
		// 具体消息路由键
		public static final String ROUTING_KEY_TEST = "ins.test";

	}

	public static class BPM {

		// 声明交换器名称
		public static final String EXCHANGE = "bpm.topic";
		public static final String EXCHANGE_AE = "bpm.topic.ae";
		public static final String EXCHANGE_DLX = "bpm.topic.dlx";
		// 声明队列名称
		public static final String QUEUE = "bpm.queue";
		public static final String QUEUE_AE = "bpm.queue.ae";
		public static final String QUEUE_DLX = "bpm.queue.dlx";
		public static final String QUEUE_REMOTE = "bpm.queue.remote";//动态远程调用
		// 绑定Key
		public static final String ROUTING_KEY = "bpm.*";
		// 具体消息路由键
		public static final String ROUTING_KEY_DEALDATA = "bpm.dd";// deal data
		public static final String ROUTING_KEY_REMOTE_CALL = "bpm.call";// deal data

	}


    public static class PAPER {

		// 声明交换器名称
        public static final String EXCHANGE = "paper.topic";
        public static final String EXCHANGE_AE = "paper.topic.ae";
        public static final String EXCHANGE_DLX = "paper.topic.dlx";
		// 声明队列名称
        public static final String QUEUE = "paper.queue";
        public static final String QUEUE_AE = "paper.queue.ae";
        public static final String QUEUE_DLX = "paper.queue.dlx";
        public static final String QUEUE_REMOTE = "paper.queue.remote";//动态远程调用
        public static final String QUEUE_TAX = "paper.queue.tax";//税收声明
		// 绑定Key
        public static final String ROUTING_KEY = "paper.*";
		// 具体消息路由键
        public static final String ROUTING_KEY_DEALDATA = "paper.dd";// deal data
        public static final String ROUTING_KEY_TAX = "paper.tax";// 税收声明
        public static final String ROUTING_KEY_REMOTE_CALL = "paper.call";// deal data

	}
    
    
    public static class MsgType {

        public static final String PROCESS_TB_HEALTH = "tb.health";//投保健康告知
        public static final String PROCESS_TB_TAX = "tb.tax";//投保税收声明

	}

}
