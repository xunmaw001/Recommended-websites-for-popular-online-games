package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 游戏发货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-23 10:19:25
 */
@TableName("youxifahuo")
public class YouxifahuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxifahuoEntity() {
		
	}
	
	public YouxifahuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 游戏编号
	 */
					
	private String youxibianhao;
	
	/**
	 * 游戏名称
	 */
					
	private String youximingcheng;
	
	/**
	 * 游戏类型
	 */
					
	private String youxileixing;
	
	/**
	 * 游戏厂商
	 */
					
	private String youxichangshang;
	
	/**
	 * 游戏热度
	 */
					
	private String youxiredu;
	
	/**
	 * 游戏下载
	 */
					
	private String youxixiazai;
	
	/**
	 * 单价
	 */
					
	private Integer danjia;
	
	/**
	 * 发货时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fahuoshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 用户电话
	 */
					
	private String yonghudianhua;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：游戏编号
	 */
	public void setYouxibianhao(String youxibianhao) {
		this.youxibianhao = youxibianhao;
	}
	/**
	 * 获取：游戏编号
	 */
	public String getYouxibianhao() {
		return youxibianhao;
	}
	/**
	 * 设置：游戏名称
	 */
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
	/**
	 * 设置：游戏类型
	 */
	public void setYouxileixing(String youxileixing) {
		this.youxileixing = youxileixing;
	}
	/**
	 * 获取：游戏类型
	 */
	public String getYouxileixing() {
		return youxileixing;
	}
	/**
	 * 设置：游戏厂商
	 */
	public void setYouxichangshang(String youxichangshang) {
		this.youxichangshang = youxichangshang;
	}
	/**
	 * 获取：游戏厂商
	 */
	public String getYouxichangshang() {
		return youxichangshang;
	}
	/**
	 * 设置：游戏热度
	 */
	public void setYouxiredu(String youxiredu) {
		this.youxiredu = youxiredu;
	}
	/**
	 * 获取：游戏热度
	 */
	public String getYouxiredu() {
		return youxiredu;
	}
	/**
	 * 设置：游戏下载
	 */
	public void setYouxixiazai(String youxixiazai) {
		this.youxixiazai = youxixiazai;
	}
	/**
	 * 获取：游戏下载
	 */
	public String getYouxixiazai() {
		return youxixiazai;
	}
	/**
	 * 设置：单价
	 */
	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Integer getDanjia() {
		return danjia;
	}
	/**
	 * 设置：发货时间
	 */
	public void setFahuoshijian(Date fahuoshijian) {
		this.fahuoshijian = fahuoshijian;
	}
	/**
	 * 获取：发货时间
	 */
	public Date getFahuoshijian() {
		return fahuoshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：用户电话
	 */
	public void setYonghudianhua(String yonghudianhua) {
		this.yonghudianhua = yonghudianhua;
	}
	/**
	 * 获取：用户电话
	 */
	public String getYonghudianhua() {
		return yonghudianhua;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
