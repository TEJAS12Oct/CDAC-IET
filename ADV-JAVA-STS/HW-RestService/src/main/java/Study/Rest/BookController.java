package Study.Rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 2.  Write a class Book with properties  String bookName, String author, double cost , getters and setters
	Write a REST CONTROLLER  having controller levelmapping  /book
	
	GET  /book/getAll      show JSON array of all books in the DB table book
       GET   /book/get/{bookname}      show JSON array of all books having name given by bookName
        GET  /book/allAuthors     show coma separated list of all the authors in the db table 

        POST  /book/add     Pass the book Info as RequestBody and  INSERT row in DB
	PUT    /book/changename/{bookName}    update bookName to new name
	PUT    /book/changename/{oldbookName}/{newbookName}    update oldbookName to new name in DB
       PUT    /book/changecost/{bookName/bookCost}    update bookCost for all books with book name  in DB

        DELETE   /book/deletebyname/{bookName}    delete all books with given name from the DB 

 */

@RestController
@RequestMapping(path = "/book")
public class BookController {
	@Autowired
	private JdbcTemplate template;

	@Autowired
	private DataSource ds;

	@PostMapping("/add")
	public void insert(@RequestBody Book b) {
		template.update("insert into book values(?,?,?)", b.getBookName(), b.getAuthor(), b.getCost());

	}
	// http://localhost:8080/book/add
	/*
	 * { "bookName":"java", "author":"sharma", "cost":"429" }
	 */

//  http://localhost:8080/book/showAll
	@GetMapping("/showAll") 
	public List<Book> show1() {
		List<Book> b1 = template.query("select *from book", (rs, rowNum) -> {
			return new Book(rs.getString(1), rs.getString(2), rs.getDouble(3));
		});

		return b1;

	}

//  http://localhost:8080/book/show/python
	@GetMapping("/show/{bookname}") 
	public List<Book> show1(@PathVariable("bookname") String bname) {
		String sql = "select * from book where bookname='" + bname + "'";
		List<Book> b1 = template.query(sql, (rs, rowNum) -> {
			return new Book(rs.getString(1), rs.getString(2), rs.getDouble(3));
		});
		return b1;
	}

//  http://localhost:8080/book/ALLAuthors	
	@GetMapping("/ALLAuthors")
	public String getAu() {
		StringBuffer str = new StringBuffer();
		try {
			Connection con = ds.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while (rs.next()) {
				str.append(rs.getString(2) + ",");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return str.toString();
	}

//  http://localhost:8080/book/changename/C++/dbms
	@PutMapping("/changename/{oldbookname}/{newbookname}") 
	public void updateName(@PathVariable("oldbookname") String oldbname, @PathVariable("newbookname") String newbname) {
		template.update("update book set bookname='" + newbname + "' where bookname='" + oldbname + "'");
	}

	@PutMapping("/changecost/{bookname}/{newcost}")
	public void updateCost(@PathVariable("bookname") String bname, @PathVariable("newcost") float cost) {
		template.update("update book set cost=" + cost + " where bookname='" + bname + "'");
	}
// http://localhost:8080/book/deletebyname/dbms
	@DeleteMapping("/deletebyname/{bookname}") 
	public void updateCost(@PathVariable("bookname") String bname) {
		template.update("delete from book where bookname='" + bname + "'");
	}
}// main controller
