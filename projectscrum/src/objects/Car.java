package objects;

/**
 * Created by Kasia on 2016-12-20.
 */
public class Car {

    private String rejestrationNumber;
    private String ownerName;
    private String ownerSurname;
    private String dateOfBuying;
    private String maxDateToTechnicalRewiev;

    public Car(String rejestrationNumber, String ownerName, String ownerSurname, String dateOfBuying, String maxDateToTechnicalRewiev) {
        this.rejestrationNumber = rejestrationNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.dateOfBuying = dateOfBuying;
        this.maxDateToTechnicalRewiev = maxDateToTechnicalRewiev;
    }

	@Override
	public String toString() {
		return "Car [rejestrationNumber=" + rejestrationNumber + ", ownerName=" + ownerName + ", ownerSurname="
				+ ownerSurname + ", dateOfBuying=" + dateOfBuying + ", maxDateToTechnicalRewiev="
				+ maxDateToTechnicalRewiev + "]";
	}
    
    
}
