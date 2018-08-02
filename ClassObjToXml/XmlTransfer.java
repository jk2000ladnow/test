package com.jason.test;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlTransfer {

	public static void main(String[] args) throws Exception {
		ObjToXml();
		XmlToObj();
	}

	public static void ObjToXml() throws ParseException {
		JAXBContext ctx;
		try {
			ctx = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = ctx.createMarshaller();
			// 格式化輸出
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// 設置輸出編碼,默認為UTF-8 
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			Student stu = new Student("Jason","ROC","02/08");
			File xmlFile = new File("C:/Student.xml");
			marshaller.marshal(stu, xmlFile);
			marshaller.marshal(stu, System.out);
			System.out.println();
		} catch (JAXBException e) {
			System.out.println("ObjToXml  error");
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}
	}

	public static void XmlToObj() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			File file = new File("C:\\Student.xml");
			Student stu = (Student) unmarshaller.unmarshal(file);
			System.out.println(stu.getName() + "..." + stu.getCountry() + "..." +stu.getBirthDate());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
