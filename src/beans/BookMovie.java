package beans;

public class BookMovie {

	private int id;
	private String movieName;
	private String showTime;
	private int seatNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	@Override
	public String toString() {
		return "BookMovie [id=" + id + ", movieName=" + movieName + ", showTime=" + showTime + ", seatNo=" + seatNo
				+ "]";
	}
	
	
}
