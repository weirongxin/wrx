package service;

import java.util.List;

import dao.XuanXiangDao;
import dao.XuanXiangDaoImpl;
import entity.TiMu;
import entity.XuanXiang;

public class XuanXiangManager {
	XuanXiangDao dao = new XuanXiangDaoImpl();
	
	//根据 试卷id、题目id 查询选项
	public List<XuanXiang> queryXuanXiang(int shijuanId,int timuId){
		TiMuManager manager = new TiMuManager();
		
		List<XuanXiang> xuanXiangs = null;
		List<TiMu> timus = manager.queryAllTiMu(shijuanId);
		
		if(timus==null){
			xuanXiangs = dao.queryByTiMuId(timuId);
			ShiJuanManager shiManager = new ShiJuanManager();
			shiManager.setXuanXiangById(shijuanId, timuId, xuanXiangs);
		}else{
			for(TiMu t:timus){
				if(t.getId()==timuId){
					xuanXiangs = t.getXuanxiangs();
				}
			}
			
		}
		return xuanXiangs;
	}
}
