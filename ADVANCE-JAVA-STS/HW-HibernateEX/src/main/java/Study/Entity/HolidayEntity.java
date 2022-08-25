package Study.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Holiday")
public class HolidayEntity {

	@Id
	@Column
	int id;

	@Column(name = "NameHoliday")
	String NameOfHoliday;

	@Column(name = "DateInYear")
	Date dateInCurrentYear;

	public HolidayEntity() {
	}

	public HolidayEntity(int id, String nameOfHoliday, Date dateInCurrentYear) {
		this.id = id;
		NameOfHoliday = nameOfHoliday;
		this.dateInCurrentYear = dateInCurrentYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfHoliday() {
		return NameOfHoliday;
	}

	public void setNameOfHoliday(String nameOfHoliday) {
		NameOfHoliday = nameOfHoliday;
	}

	public Date getDateInCurrentYear() {
		return dateInCurrentYear;
	}

	public void setDateInCurrentYear(Date dateInCurrentYear) {
		this.dateInCurrentYear = dateInCurrentYear;
	}

	@Override
	public String toString() {
		return "HolidayEntity [id=" + id + ", NameOfHoliday=" + NameOfHoliday + ", dateInCurrentYear="
				+ dateInCurrentYear + "]";
	}

}
