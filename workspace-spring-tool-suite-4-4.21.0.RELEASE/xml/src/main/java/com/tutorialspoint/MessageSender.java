package com.tutorialspoint;


public class MessageSender {

	 private MessageService emailService;
	 private MessageService smsService;

	 public MessageSender() {
		 
	 }

	 public MessageSender(MessageService emailService, MessageService smsService){
		  this.emailService=emailService;
		  this.smsService=smsService;
	 }
	 
	 public void setEmailService(MessageService emailService) {
		 this.emailService = emailService;
	 }
	 
	 public void setSmsService(MessageService smsService) {
		 this.smsService = smsService;
	 }
	 
	 public void sendMessage(String m, String type){
		 if(type == "email") {
			this.emailService.sendMessage(m);
		 }else {
			 this.smsService.sendMessage(m);
		 }
	 }
	 
}
