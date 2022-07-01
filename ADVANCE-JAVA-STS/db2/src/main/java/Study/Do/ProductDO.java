package Study.Do;

public class ProductDO {
	private int pid;
	private String pname;
	private int pcost;

	public ProductDO() {
	}

	public ProductDO(int pid, String pname, int pcost) {
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "ProductDO [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}

}
