//package com.ifp.common.plugs.rabbitmq.consumer;
//
//@Component
//public class MessageReceive {
//	
//	@Autowired
//	private ReceiveTemplate receiveTemplate;
//	
//	@RabbitHandler
//	@RabbitListener(queues = "default.queue", containerFactory = "myRabbitListenerContainerFactory")
//	public void process(@Payload User user) {
//	    System.out.println("Receiver : " + user);
//	    receiveTemplate.dispose(TestService::getUser, TestService.class, user, CustomeResult::new);
//	}
//	
//	@RabbitHandler
//	@RabbitListener(queues = "default.queue.ae", containerFactory = "myRabbitListenerContainerFactory")
//	public void processAE(@Payload User user) {
//	    System.out.println("Receiver : " + user);
//	}
//	
//	@RabbitHandler
//	@RabbitListener(queues = "default.queue.dlx", containerFactory = "myRabbitListenerContainerFactory")
//	public void processDLX(@Payload User user) {
//	    System.out.println("Receiver : " + user);
//	}
//
//}