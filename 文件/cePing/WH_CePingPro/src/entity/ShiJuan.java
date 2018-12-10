package entity;

import java.sql.Date;
import java.util.List;

public class ShiJuan {
	private int id;
	private String name;
	private Date create_date;
	private Date update_date;
	private List<TiMu> timus;
	 
	public ShiJuan(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ShiJuan(int id, String name, List<TiMu> timus) {
		super();
		this.id = id;
		this.name = name;
		this.timus = timus;
	}
	
	public List<TiMu> getTimus() {
		return timus;
	}

	public void setTimus(List<TiMu> timus) {
		this.timus = timus;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	@Override
	public String toString() {
		return "ShiJuan [id=" + id + ", name=" + name + ", create_date=" + create_date + ", update_date=" + update_date
				+ "]";
	}
	
}
