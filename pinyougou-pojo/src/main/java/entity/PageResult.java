package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果
 * @author 刘雨明
 */
public class PageResult implements Serializable{
	
	private static final long serialVersionUID = -6728074099349435029L;
	private long total;
	private List rows;
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	

}
