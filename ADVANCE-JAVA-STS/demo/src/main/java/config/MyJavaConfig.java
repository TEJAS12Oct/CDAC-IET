package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Study.Beans.AddressBean;
import Study.Beans.MessageBean;

@Configuration
public class MyJavaConfig {

	@Bean(value = "msg")
	@Scope(value = "prototype")
	public MessageBean getMessageBean() {
		MessageBean bean = new MessageBean();
		bean.setMessage("THIS is from Java Config");
		bean.setSenderName("doremon");
		bean.setReceiverAddress(getAddr());
		return bean;
	}

	@Bean(value = "msg2")
	public MessageBean getMessageBean2() {
		MessageBean bean = new MessageBean("THis is from config 2", "Nobita", getAddr());
		return bean;
	}

	// WE register the bean with the container
	@Bean(value = "addr")
	public AddressBean getAddr() {
		AddressBean bean = new AddressBean();
		bean.setCity("pune");
		bean.setState("mah");
		bean.setCountry("ind");
		bean.setPin("1111");
		return bean;
	}

}
