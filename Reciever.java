import java.util.ArrayList;

public class Receiver {

	private String ReceiverName;
	private String ReceiverBloodGroup;
	private String birthDate;
	private char gender;
	private double weight;
	private Area areaOfReceiver;
	private long contactNum;
	private int Emergency;
	private boolean approvedReceiver;
	private String Organ;
	private String enrolled_hosp;
	public Receiver(String receiverName, String receiverBloodGroup, String birthDate, char gender, double weight,
			String hosp, long contactNum, int emergency,String Org) {
		super();
		ReceiverName = receiverName;
		ReceiverBloodGroup = receiverBloodGroup;
		this.birthDate = birthDate;
		this.gender = gender;
		this.weight = weight;
		this.enrolled_hosp = hosp;
		this.contactNum = contactNum;
		Emergency = emergency;
		this.Organ = Org;
	}
	public String gethospitalName() {
		return enrolled_hosp;
	}
	public String getReceiverName() {
		return ReceiverName;
	}
	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	public String getReceiverBloodGroup() {
		return ReceiverBloodGroup;
	}
	public void setReceiverBloodGroup(String receiverBloodGroup) {
		ReceiverBloodGroup = receiverBloodGroup;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Area getAreaOfReceiver() {
		return areaOfReceiver;
	}
	public void setAreaOfReceiver(Area areaOfReceiver) {
		this.areaOfReceiver = areaOfReceiver;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public int getEmergency() {
		return Emergency;
	}
	public void setEmergency(int emergency) {
		Emergency = emergency;
	}
	public boolean isApprovedReceiver() {
		return approvedReceiver;
	}
	public void setApprovedReceiver(boolean approvedReceiver) {
		this.approvedReceiver = approvedReceiver;
	}



}
