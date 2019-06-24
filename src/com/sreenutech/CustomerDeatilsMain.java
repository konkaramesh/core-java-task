package com.sreenutech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDeatilsMain {
	public static void main(String[] args) throws IOException {
		int countVisa = 0, countMaster = 0, countApex = 0, countRupay = 0, countInvalid = 0;
		Map<String, List<CustomerDetails>> map = new HashMap<>();
		List<CustomerDetails> list = new ArrayList();
		BufferedReader br = new BufferedReader(new FileReader("customerDetails"));
		String line = br.readLine();
		while (line != null) {
			String[] column = line.split(" ~ ");
			String a4 = column[4];

			while (line != null) {
				line = br.readLine();
				if (a4.charAt(0) == '3') {
					countVisa++;
					for (int i = 0; i < countMaster; ++i) {
						CustomerDetails cd = new CustomerDetails();
						cd.setCardNO(column[0]);
						cd.setName(column[1]);
						cd.setDob(column[2]);
						cd.setMailID(column[3]);
						cd.setCardNO(column[4]);
						cd.setBalance(column[5]);
						list.add(cd);
						map.put("Visa", list);
					}
				} else if (a4.charAt(0) == '4') {

					countMaster++;

					for (int i = 0; i < countMaster; ++i) {
						CustomerDetails cd = new CustomerDetails();
						cd.setCardNO(column[0]);
						cd.setName(column[1]);
						cd.setDob(column[2]);
						cd.setMailID(column[3]);
						cd.setCardNO(column[4]);
						cd.setBalance(column[5]);
						list.add(cd);
						map.put("Master", list);
					}
				}

				else if (a4.charAt(0) == '5') {
					countApex++;
					list = new ArrayList();
					for (int i = 0; i < countMaster; ++i) {
						CustomerDetails cd = new CustomerDetails();
						cd.setCardNO(column[0]);
						cd.setName(column[1]);
						cd.setDob(column[2]);
						cd.setMailID(column[3]);
						cd.setCardNO(column[4]);
						cd.setBalance(column[5]);
						list.add(cd);
						map.put("Apex", list);
					}
				} else if (a4.charAt(0) == '6') {
					countRupay++;
					list = new ArrayList();
					for (int i = 0; i < countMaster; ++i) {
						CustomerDetails cd = new CustomerDetails();
						cd.setCardNO(column[0]);
						cd.setName(column[1]);
						cd.setDob(column[2]);
						cd.setMailID(column[3]);
						cd.setCardNO(column[4]);
						cd.setBalance(column[5]);
						list.add(cd);
						map.put("Rupay", list);
					}
				} else {
					countInvalid++;
				}

				break;
			}
		}

		System.out.println("Number of visa card are: " + countVisa);
		System.out.println("Number of Master card are: " + countMaster);
		System.out.println("Number of Apex card are: " + countApex);
		System.out.println("Number of Rupay card are: " + countRupay);
		System.out.println("Number of Invalid card : " + countInvalid);
	/*	for (Map.Entry<String, List<CustomerDetails>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
*/
	}

}
