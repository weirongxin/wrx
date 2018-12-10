package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.ShiJuanDao;
import dao.ShiJuanDaoImpl;
import entity.ShiJuan;
import entity.TiMu;
import entity.XuanXiang;

public class ShiJuanManager {
	public static ShiJuanDao dao = new ShiJuanDaoImpl();
	public static Map<Integer,ShiJuan> shijuans;
	static{
		shijuans = new HashMap<Integer,ShiJuan>();
		shijuans = dao.queryAll();
	}
	//查所有试卷
	public List<ShiJuan> queryAllShiJuan(){
		List<ShiJuan> ss = new ArrayList<>(shijuans.values());
		return ss;
	}
	//根据id查找试卷
	public ShiJuan queryShiJuanById(int id){
		ShiJuan ss = shijuans.get(id);
		return ss;
	}
	//设置题目id 对应的选项
	public void setXuanXiangById(int shijuanId,int tiMuId,List<XuanXiang> xuanXiangs){
		List<TiMu> ss = new ArrayList<>(shijuans.get(shijuanId).getTimus());
		for(TiMu t:ss){
			if(t.getId()==tiMuId){
				t.setXuanxiangs(xuanXiangs);
			}
		}
		
	}
	// 根据试卷 id 取题目集合
	public List<TiMu> queryTiMuById(int id){
		List<Integer> shijuanId = new ArrayList<>(shijuans.keySet());
		if(shijuanId.contains(id)){
			List<TiMu> ss = new ArrayList<>(shijuans.get(id).getTimus());
			return ss;
		}
		return null;
	}
	//根据试卷id 填充题目集合
	public void setTiMuById(int id,List<TiMu> timus){
		ShiJuan s = shijuans.get(id);
		s.setTimus(timus);
	}
	
}
