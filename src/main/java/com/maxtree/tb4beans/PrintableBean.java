package com.maxtree.tb4beans;

import java.util.ArrayList;
import java.util.List;

public class PrintableBean {

	public String getPlateType() {
		return plateType;
	}

	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getPutawayCode() {
		return putawayCode;
	}

	public void setPutawayCode(String putawayCode) {
		this.putawayCode = putawayCode;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getBasicInformation() {
		return basicInformation;
	}

	public void setBasicInformation(String basicInformation) {
		this.basicInformation = basicInformation;
	}

	public String getObjection() {
		return objection;
	}

	public void setObjection(String objection) {
		this.objection = objection;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getDateChecked() {
		return dateChecked;
	}

	public void setDateChecked(String dateChecked) {
		this.dateChecked = dateChecked;
	}

	public static List<PrintableBean> createBeanCollection() {
		List<PrintableBean> beans = new ArrayList<PrintableBean>();
		PrintableBean bean = new PrintableBean();
		bean.setBasicInformation("号牌种类：1-小型汽车\n车牌号：辽BB8K57\nVIN：1222102203DR\n");
		bean.setChecker("陈顺谊");
		bean.setDateChecked("2018年5月20日 4点3分");
		bean.setDateCreated("2018年5月18日 3点33分");
		bean.setObjection("1.图像不合格\n2.图像不清晰\n");

		bean.setBarcode("1140416110935");
		bean.setIndexNumber("1");
		bean.setPutawayCode("116-002-004-027");
		bean.setPlateType("小型汽车");
		bean.setBusinessType("注册登记");
		bean.setPlateNumber("辽BB8K57");
		bean.setVin("LGB12YEA9DY001226");

		beans.add(bean);
		return beans;
	}

	private String plateType; // 号牌种类
	private String plateNumber; // 号码号牌
	private String vin; // 车辆识别代码
	private String putawayCode; // 上架号
	private String businessType;// 业务类型
	private String barcode; // 条形码,即业务流水号
	private String indexNumber; // 索引号
	private String dateCreated; // 申请时间
	private String basicInformation; // 基本信息
	private String objection; // 批改意见
	private String checker; // 审核人
	private String dateChecked; // 审核时间
}
