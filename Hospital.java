import java.util.PriorityQueue;

public class Hospital {
	private String hospitalName;
	private int citycode;
	private int areacode;
	private Area loc;
	private int hospitalcode;
	PriorityQueue<Receiver> pq;
	Hospital (int code ,String hospitalName,int a_code,int c_code){
		this.hospitalcode = code;
		this.hospitalName = hospitalName;
		this.areacode = a_code;
		this.citycode = c_code;
	}
	public Hospital(String hospitalName, Area loc) {
		super();
		this.hospitalName = hospitalName;
		this.loc = loc;
		this.pq = pq;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public int getHospitalCode() {
		return hospitalcode;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Area getLoc() {
		return loc;
	}
	public void setLoc(Area loc) {
		this.loc = loc;
	}
	public PriorityQueue<Receiver> getPq() {
		return pq;
	}
	public void setPq(PriorityQueue<Receiver> pq) {
		this.pq = pq;
	}
	
	
}