package com.jason.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HttpClientDemo {

	
	public void getHeartStore(String tag) throws Exception {
		URL url = new URL("http://gametsg.techbang.com/hs/index.php?view=item&tag=," + tag + "#done");
		Document doc = Jsoup.parse(url, 10000);
		Elements tables = doc.select("table[id='card_table']");
		//file
		File file = new File("D:\\store.txt");
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		//end file
		for (Element table : tables) {
			Elements trs = table.select("tr");
			Elements ths = trs.get(0).select("th");
			for (Element th : ths) {
				if (ths.indexOf(th) == 1) {
					bw.write(th.text().trim() + "\t\t ");
					System.out.print(th.text().trim() + "\t\t ");
				} else {
				bw.write(th.text().trim() + "\t ");
				System.out.print(th.text().trim() + "\t ");
				}
			}
			bw.newLine();
			System.out.println();
			for (Element tr : trs) {
				Elements tds = tr.select("td");
				if (tds == null || tds.size() == 0) {
					continue;
				}
				int mana = Integer.valueOf(tds.get(6).text().trim());
				if (mana <= 5) continue; 
				int count = 0;
				for (Element td : tds) {
					switch (count) {
					case 0:
						String ss = td.select("div").get(1).text().trim();
						bw.write(ss + "\t ");
						System.out.print(ss + "\t ");
						break;
					case 1:
						StringBuffer str = new StringBuffer(td.select("span").text().trim());
						if(str.length() >= 6){
							bw.write(str + "\t ");
							System.out.print(str + "\t ");
						} else {
							bw.write(str + "\t\t ");
							System.out.print(str + "\t\t ");
						}
						break;
					default:
						String st = td.text().trim();
						bw.write(st + "\t ");
						System.out.print(st + "\t ");
						break;
					}
					count++;
				}
				bw.newLine();
				System.out.println();
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		HttpClientDemo demo = new HttpClientDemo();
//		demo.getHeartStore("Mage");
		demo.getHeartStore("Priest");
	}
	

}
