package io.renren.common.utils;

import com.twilio.sdk.Twilio;
import com.twilio.sdk.creator.api.v2010.account.MessageCreator;
import com.twilio.sdk.resource.api.v2010.account.Message;
import com.twilio.sdk.type.PhoneNumber;

public class TwilioUtils {
	
	String accountSid = "ACd53d15caf31fc6a6abf3fada046ea624"; // Your Account SID from www.twilio.com/user/account
	String authToken = "f978e2db49a2ff7839fe7fcd948ef12a"; // Your Auth Token from www.twilio.com/user/account
	
	public String sendSMS(String phone,String content) {
		Twilio.init(accountSid, authToken);
		MessageCreator messageCreator = Message.create(
				accountSid,
			    new PhoneNumber(phone),  // To number
			    new PhoneNumber("+16158238680"),  // From number
			    content                   // SMS body
			);
		Message message = messageCreator.execute();
		return message.getSid();
	}
	
	
	public static void main(String[] args) {
		TwilioUtils twiliUtils = new TwilioUtils();
		twiliUtils.sendSMS("+86 183 7099 2760","hello world,xiaodong");
	}

}
