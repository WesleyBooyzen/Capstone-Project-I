
public class Project {
	
	String projectNum;
	String projectName;
	String typeOfBuilding;
	String buildingAddress;
	int erfNum;
	double projectFee;
	double paidToDate;
	String deadline;
	boolean finalised;
	
	Architect architect;
	Contractor contractor;
	Customer customer;
	
	public Project(String initProjectNum, String initProjectName, String initTypeOfBuilding, String initBuildingAddress,
			int initErfNum, int initProjectFee, int initPaidToDate, String initDeadline, Architect architect,
			boolean initFinalised, Contractor contractor, Customer customer) {
		
		this.projectNum = initProjectNum;
		this.projectName = initProjectName;
		this.typeOfBuilding = initTypeOfBuilding;
		this.buildingAddress = initBuildingAddress;
		this.erfNum = initErfNum;
		this.projectFee = initProjectFee;
		this.paidToDate = initPaidToDate;
		this.deadline = initDeadline;
		this.architect = architect;
		this.contractor = contractor;
		this.customer = customer;
	}
	
	public String getProjectNum() {
		return projectNum;
	}
	
	public String getDeadline(){
        return deadline;
	}
	
	public boolean getProjectFinalised(){
        return finalised;
    }
	
	public String getFinalisedString(){
        if(finalised){
            return "Finalised";
        }
        
        else {
        	return "Not Finalised";
        }
	}
	
	public Double getProjectFee() {
		return projectFee;
	}
	
	public Double getPaidToDate() {
		return paidToDate;
	}
	
	public Architect getArchitect() {
		return architect;
	}
	
	public Contractor getContractor() {
		return contractor;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setPaidToDate(double paidToDate){
        if(paidToDate > 0){
            this.paidToDate = paidToDate;
        }
    }
	
	public void setDeadline(String deadline){
        if(deadline.isEmpty() != true){
            this.deadline = deadline;
        }
    }
	
	public void setFinalised(String projectFinalised){
        if(projectFinalised.equals("1")){
            if(this.finalised == true){
                this.finalised = false;
            }

            else{
                this.finalised = true;
            }
        }
    }
	
	public void setArchitect(Architect architect) {
		this.architect = architect;
	}
	
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String write() {
		String output = "Project Number: " + projectNum;
		output += "\nProject Name: " + projectName;
		output += "\nType of Building: " + typeOfBuilding;
		output += "\nBuilding Address: " + buildingAddress;
		output += "\nERF Number: " + erfNum;
		output += "\nTotal project fee: " + projectFee;
		output += "\n Total fees paid to date: " + paidToDate;
		output += "\nProject Deadline: " + deadline;
		output += "\nProject Finalised: " + finalised;
		output += "\nArchitect: " + architect;
		output += "\nContractor: " + contractor;
		output += "\nCustomer: " + customer;
		
		return output;
	}
	
	public String toString() {
		String output = "Project Number: " + projectNum;
		output += "\nProject Name: " + projectName;
		output += "\nType of Building: " + typeOfBuilding;
		output += "\nBuilding Address: " + buildingAddress;
		output += "\nERF Number: " + erfNum;
		output += "\nTotal project fee: " + projectFee;
		output += "\n Total fees paid to date: " + paidToDate;
		output += "\nProject Deadline: " + deadline;
		
		if(finalised) {
			output += "Finalised: Yes";
		}
		else {
			output += "\nFinalised: No";
		}
		output += "\nArchitect: " + architect;
		output += "\nContractor: " + contractor;
		output += "\nCustomer: " + customer;
		
		return output;
	}
		
}
	
	