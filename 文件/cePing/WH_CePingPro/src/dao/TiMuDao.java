package dao;

import java.util.List;

import entity.TiMu;

public interface TiMuDao {
	public List<TiMu> queryByShiJuanId(int Id);
}
