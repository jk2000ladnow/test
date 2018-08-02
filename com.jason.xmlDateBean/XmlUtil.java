package com.jason.xmlDateBean;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.codec.binary.Base64;

import com.truetel.jcore.util.FileUtil;

import gov.fdc.oa.oautil.DateUtil;

public class XmlUtil {

    /**
     * XML String.
     * 
     * @param obj
     *            the obj
     * @return the string
     */
    public static String convertToXml(Object obj) {
        StringWriter sw = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
            marshaller.marshal(obj, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return sw.toString();
    }

    /**
     * Xml File.
     * 
     * @param obj
     *            the obj
     * @param path
     *            the path
     * @throws Exception
     *             the exception
     */
    public static void convertToXml(Object obj, String path) throws Exception {
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            OutputStream outputStream = null;
            File file = null;
            try {
                file = new File(path);
                if (!file.exists()) {
                    file.createNewFile();
                }
                outputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            marshaller.marshal(obj, outputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert xml str to object.
     * 
     * @param clazz
     *            the clazz
     * @param xmlStr
     *            the xml str
     * @return the object
     */
    public static Object convertXmlStrToObject(Class<?> clazz, String xmlStr) {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader sr = new StringReader(xmlStr);
            xmlObject = unmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlObject;
    }

    /**
     * Convert xml file to object.
     * 
     * @param clazz
     *            the clazz
     * @param xmlPath
     *            the xml path
     * @return the object
     */
    public static Object convertXmlFileToObject(Class<?> clazz, String xmlPath) {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            FileReader fr = null;
            try {
                fr = new FileReader(xmlPath);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            xmlObject = unmarshaller.unmarshal(fr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlObject;
    }

    /**
     * Gets the decoding data.
     * 
     * @param str
     *            the str
     * @return the decoding data
     * @throws Exception
     *             the exception
     */
    private static String getDecodingData(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.delete(1, 8);
        byte[] strByte = Base64.decodeBase64(sb.toString().getBytes("UTF-8"));
        return new String(strByte, "UTF-8");
    }

    /**
     * Gen xml file.
     *
     * @param list the list
     * @param enCode the en code
     * @return the string
     * @throws Exception the exception
     */
    public static String genXmlFile(List<? extends XmlDataBean> list, Boolean enCode)
        throws Exception {
        XmlData xml = new XmlData(list);
        String folderPath = "D:xml/";
        FileUtil.createDir(folderPath);  
        String today = DateUtil.getTodayY5d();
        DateFormat fmt = new SimpleDateFormat("HHmmss");
        String time = fmt.format(Calendar.getInstance().getTime());
        String filePath = folderPath + time + ".xml";
        String XmlString  = "";
        XmlString = convertToXml(xml);
        FileUtil.writeFile(XmlString.getBytes("UTF-8"), filePath);
        System.out.println(filePath);
        return filePath;
    }

    /**
     * Gets the file content.
     * 
     * @param fis
     *            the fis
     * @param encoding
     *            the encoding
     * @return the file content
     */
    public static String getFileContent(FileInputStream fis, String encoding) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new InputStreamReader(fis, encoding));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return sb.toString();

    }

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
//        System.out.println(getDecodingData(FileUtil.readFileContent("C:/Users/William.Tsou/Downloads/SalaryXml.xml")
//                .toString()));
        ;

    }
}
