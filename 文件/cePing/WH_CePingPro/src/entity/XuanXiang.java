package entity;

import java.sql.Date;

public class XuanXiang {
	private int id;
	private String name;
	private int xuHao;
	private int timu_id;
	private int fenzhi;
	private Date create_date;
	private Date update_date;
	public XuanXiang(int id, String name, int xuHao, int timu_id, int fenzhi) {
		super();
		this.id = id;
		this.name = name;
		this.xuHao = xuHao;
		this.timu_id = timu_id;
		this.fenzhi = fenzhi;
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
	public int getXuHao() {
		return xuHao;
	}
	public void setXuHao(int xuHao) {
		this.xuHao = xuHao;
	}
	public int getTimu_id() {
		return timu_id;
	}
	public void setTimu_id(int timu_id) {
		this.timu_id = timu_id;
	}
	public int getFenzhi() {
		return fenzhi;
	}
	public void setFenzhi(int fenzhi) {
		this.fenzhi = fenzhi;
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
		return "XuanXiang [id=" + id + ", name=" + name + ", xuHao=" + xuHao + ", timu_id=" + timu_id + ", fenzhi="
				+ fenzhi + ", create_date=" + create_date + ", update_date=" + update_date + "]";
	}
	
	
}
