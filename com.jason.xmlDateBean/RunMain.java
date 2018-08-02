package com.jason.xmlDateBean;

import java.util.ArrayList;

public class RunMain {
	
	public static void main(String[] args) throws Exception {
		ObjToXml();
		//xmlToObj();
	}
	
	public static void ObjToXml () throws Exception {
		ArrayList <EmpXmlDataBean> list = new ArrayList<EmpXmlDataBean>();
		EmpXmlDataBean emp = new EmpXmlDataBean();
		emp.setEmpId("7955");
		emp.setEmpName("JOJO");
		emp.setIdNo("A123456789");
		emp.setMail("JOJO@gmail.com");
		emp.setSerialNumber("0001");
		list.add(emp);
		emp = new EmpXmlDataBean();
		emp.setEmpId("6666");
		emp.setEmpName("NONO");
		emp.setIdNo("F123456789");
		emp.setMail("NONO@gmail.com");
		emp.setSerialNumber("0002");
		list.add(emp);
		
		XmlUtil.genXmlFile(list, false);
	}
	
	public static void xmlToObj () throws Exception {
		XmlData data = (XmlData) XmlUtil.convertXmlFileToObject(XmlData.class,"D:xml/152423.xml");
		System.out.println(data.getOrganization().getOrganizationalCode());
		for (XmlDataBean bean : data.getDataList().getData()) {
			EmpXmlDataBean emp = (EmpXmlDataBean) bean;
			System.out.println(emp.getEmpName());
			System.out.println(emp.getMail());
			
		}
	}
}
