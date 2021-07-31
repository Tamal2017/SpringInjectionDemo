package pp;

public class Dept {
	private int deptId;
	private String deptName;
	private String deptDesc;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", deptDesc=" + deptDesc + "]";
	}

}
