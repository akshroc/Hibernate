package org.hibernate.tester;

import org.hibernate.dao.ApplicationDAO;
import org.hibernate.dto.ApplicationDTO;

public class TesterMain {
	public static void main(String[] args) {
		ApplicationDTO dto = new ApplicationDTO();
		// dto.setAppName("enterprise");
		// dto.setPhoneNum(999999);

		ApplicationDAO dao = new ApplicationDAO();
		// dao.saveData(dto);
		// System.out.println("Data inserted");

		// ApplicationDTO id = dao.getById(1);

		// if (id != null) {
		// System.out.println("The name is " + id.getPhoneNum());
		// System.out.println("The id is " + id.getAppId());
		// }

		// dao.updateById("web", 9434343434L, 1);

		dao.deleteById(2);

	}

}
