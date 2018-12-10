package service;

import java.util.List;

import dao.TiMuDao;
import dao.TiMuDaoImpl;
import entity.TiMu;

public class TiMuManager {
	TiMuDao dao = new TiMuDaoImpl();
	//根据试卷id 查询 题目
	public List<TiMu> queryAllTiMu(int shijuanId){
		ShiJuanManager manager = new ShiJuanManager();

		List<TiMu> timus = null;
		timus = manager.queryTiMuById(shijuanId);
		if(timus==null){
			timus = dao.queryByShiJuanId(shijuanId);
			manager.setTiMuById(shijuanId, timus);
		}
		return timus;
	}
	
}
