package ets;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "LogWebService", name = "LogLog")
public class LogServiceImpl implements LogLog{
	@WebMethod
	public void log(String msg) {
		System.out.println(msg);
	}
}