package com.jason.webService;

import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import com.jason.ws.client.Cal;
import com.jason.ws.client.CalService;
import com.jason.ws.client.date.SystemDate;
import com.jason.ws.client.date.SystemDateService;

public class CaClient {
	public static void main(String[] args) {
		CallServiceByPort();
		CallServiceByPortDate();
	}
	
	public static void CallServiceByPort () {
		System.out.println("test begin...");
		Cal cal = new CalService().getCalPort();
		System.out.println(cal.show());
		System.out.println(cal.add(2, 3));
	}
	
	public static void CallServiceByPortDate () {
		System.out.println("test Date begin...");
		SystemDate date = new SystemDateService().getSystemDatePort();
		System.out.println(date.showDate());
		System.out.println(date.showNewDate());
	}
	
	public static void CallByEndPoint () {
		try {
			String endpoint = "http://localhost:1234/cal?wsdl";
			// 直接引用遠端的wsdl檔案
			// 以下都是套路
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(endpoint);
			call.setOperationName("add");// WSDL裏面描述的介面名稱
			
			call.addParameter("a",XMLType.XSD_INT,ParameterMode.IN);// 介面的引數
			call.addParameter("b",XMLType.XSD_INT,ParameterMode.IN);// 介面的引數
			
			call.setReturnType(XMLType.XSD_INT);// 設定返回型別
			int result = (int) call.invoke(new Object[] { 1, 2 });
			// 給方法傳遞引數，並且呼叫方法
			System.out.println("result is " + result);         
		} catch (Exception e) {
			System.err.println(e.toString());
		}     
	}
}