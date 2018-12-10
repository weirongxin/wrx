package dao;

import java.util.List;

import entity.XuanXiang;

public interface XuanXiangDao {
	public List<XuanXiang> queryByTiMuId(int id);
}
