

public class Swimmer{
	private int age;
	private String fName;
	private String lName;
	private double freestyle;
	@Transient
	private double crawl;
	private double butterfly;
	private double breaststroke;

	public void setAge(int age) {
        this.age = age;
    }

	public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setFreestyle(double freestyle) {
        this.freestyle = freestyle;
    }
    public void setButterfly(double butterfly) {
        this.butterfly = butterfly;
    }
    public void setBreaststroke(double breaststroke) {
        this.breaststroke = breaststroke;
    }
}

