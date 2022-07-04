package Study;

import java.sql.ResultSet;
// Direct Run
public class Client2 {

	public static void main(String[] args) {
		DAO dao = new DAO();
	
		System.out.println("All Product List View : ");
		ResultSet rs = dao.getRows("select * from product");
		dao.showResultSet(rs);
		
		System.out.println("\nShow Product cost Less than 200 : ");
		ResultSet rs1 = dao.getRows("select * from product where cost < 200");
		dao.showResultSet(rs1);
		
		System.out.println("\nShow Product cost Greater than 200 : ");
		ResultSet rs2 = dao.getRows("select * from product where cost > 200");
		dao.showResultSet(rs2);
		
//		System.out.println("\n New Product Inserted : ");
//		dao.addProduct(5, "NetWork Card"  , 1500);
//		dao.showResultSet(dao.getRows("select * from product"));
		
//		System.out.println("\n Update Product Inserted : ");
//		dao.UpdateProduct(5, 2500);
//		dao.showResultSet(dao.getRows("select * from product"));

		System.out.println("\nProcedure  : ");
		dao.CallHistoredProc();
		
		System.out.println("\nName Procedure :");
		dao.CallNameProc(5); // 5 No Foruct Name Display In Product Table
	}

}
