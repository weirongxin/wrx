package entity;

import java.sql.Date;
import java.util.List;

public class TiMu {
	private int id;
	private String name;
	private int xuHao;
	private int userXuanXiang_id;
	private int shiJuan_id;
	private Date create_date;
	private Date update_date;
	private List<XuanXiang> xuanxiangs;
	
	public TiMu(int id, String name, int xuHao, int shiJuan_id) {
		super();
		this.id = id;
		this.name = name;
		this.xuHao = xuHao;
		this.shiJuan_id = shiJuan_id;
	}

	public TiMu(int id, String name, int xuHao, int userXuanXiang_id,List<XuanXiang> xuanxiangs) {
		super();
		this.id = id;
		this.name = name;
		this.xuHao = xuHao;
		this.userXuanXiang_id = userXuanXiang_id;
		this.xuanxiangs = xuanxiangs;
	}
	
	public List<XuanXiang> getXuanxiangs() {
		return xuanxiangs;
	}

	public void setXuanxiangs(List<XuanXiang> xuanxiangs) {
		this.xuanxiangs = xuanxiangs;
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
	public int getUserXuanXiang_id() {
		return userXuanXiang_id;
	}
	public void setUserXuanXiang_id(int userXuanXiang_id) {
		this.userXuanXiang_id = userXuanXiang_id;
	}
	public int getShiJuan_id() {
		return shiJuan_id;
	}
	public void setShiJuan_id(int shiJuan_id) {
		this.shiJuan_id = shiJuan_id;
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
		return "TiMu [id=" + id + ", name=" + name + ", xuHao=" + xuHao + ", userXuanXiang_id=" + userXuanXiang_id
				+ ", shiJuan_id=" + shiJuan_id + ", create_date=" + create_date + ", update_date=" + update_date + "]";
	}
	
	
}
